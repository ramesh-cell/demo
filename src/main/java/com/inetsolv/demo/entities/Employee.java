package com.inetsolv.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@NoArgsConstructor
@Data
@Document(collection = "employee")
public class Employee {


    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("address")
    private AddressDTO address;
    @JsonProperty("phoneNumbers")
    private List<PhoneNumbersDTO> phoneNumbers;


    @NoArgsConstructor
    @Data
    public static class AddressDTO {
        @JsonProperty("streetAddress")
        private String streetAddress;
        @JsonProperty("city")
        private String city;
        @JsonProperty("state")
        private String state;
        @JsonProperty("postalCode")
        private String postalCode;
    }

    @NoArgsConstructor
    @Data
    public static class PhoneNumbersDTO {
        @JsonProperty("type")
        private String type;
        @JsonProperty("number")
        private String number;
    }
}
