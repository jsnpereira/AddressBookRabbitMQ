package com.address.book.AddressBoockBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class AddressBookDTO implements Serializable {
    private Long id;
    private String name;
    private String email;
    private List<String> phoneNumbers;
}
