package com.addressbook.consumer.dto;

import com.addressbook.consumer.entity.AddressBook;

public class AddressBookMapper {
    public static AddressBook toEntity(AddressBookDTO addressBookDTO){
        AddressBook addressBook = new AddressBook();
        addressBook.setId(addressBookDTO.getId());
        addressBook.setEmail(addressBookDTO.getEmail());
        addressBook.setName(addressBookDTO.getName());
        addressBook.setPhoneNumbers(addressBookDTO.getPhoneNumbers());
        return addressBook;
    }

    public static AddressBookDTO toDTO(AddressBook addressBook){
        AddressBookDTO addressBookDTO = new AddressBookDTO();
        addressBookDTO.setId(addressBook.getId());
        addressBookDTO.setEmail(addressBook.getEmail());
        addressBookDTO.setName(addressBook.getName());
        addressBookDTO.setPhoneNumbers(addressBook.getPhoneNumbers());
        return addressBookDTO;
    }
}
