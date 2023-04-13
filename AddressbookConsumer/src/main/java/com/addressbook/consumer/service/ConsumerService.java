package com.addressbook.consumer.service;

import com.addressbook.consumer.dto.AddressBookDTO;
import com.addressbook.consumer.dto.AddressBookMapper;
import com.addressbook.consumer.entity.AddressBook;
import com.addressbook.consumer.repository.AddressBookRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private final AddressBookRepository addressBookRepository;

    @Autowired
    public ConsumerService(AddressBookRepository addressBookRepository) {
        this.addressBookRepository = addressBookRepository;
    }

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receivedMessage(AddressBookDTO addressBookDTO){
        AddressBook addressBook = addressBookRepository.save(AddressBookMapper.toEntity(addressBookDTO));
        System.out.println("Persisted: "+addressBook);
        System.out.println("AddressBook details received is.. : "+addressBookDTO);

    }
}
