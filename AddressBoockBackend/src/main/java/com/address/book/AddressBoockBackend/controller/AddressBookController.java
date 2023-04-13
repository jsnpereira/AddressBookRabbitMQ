package com.address.book.AddressBoockBackend.controller;

import com.address.book.AddressBoockBackend.dto.AddressBookDTO;
import com.address.book.AddressBoockBackend.service.AddressBookService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/addressbook")
public class AddressBookController {
    private AddressBookService addressBookService;


    @Autowired
    public AddressBookController(AddressBookService addressBookService) {
        this.addressBookService = addressBookService;
    }

    @PostMapping
    private ResponseEntity<String> saveAddressBook(@RequestBody AddressBookDTO addressBookDTO){
        addressBookService.saveAddressBook(addressBookDTO);
        return ResponseEntity.ok("Enviado com sucesso!!");
    }
}
