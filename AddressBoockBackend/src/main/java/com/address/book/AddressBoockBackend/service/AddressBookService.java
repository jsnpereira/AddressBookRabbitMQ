package com.address.book.AddressBoockBackend.service;

import com.address.book.AddressBoockBackend.dto.AddressBookDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService {
    private RabbitTemplate rabbitTemplate;

    @Autowired

    public AddressBookService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value("${spring.rabbitmq.exchange}")
    private String exchange;

    @Value("${spring.rabbitmq.routingkey}")
    private String routingkey;

    public void saveAddressBook(AddressBookDTO addressBookDTO){
        rabbitTemplate.convertAndSend(exchange, routingkey, addressBookDTO);
    }

}
