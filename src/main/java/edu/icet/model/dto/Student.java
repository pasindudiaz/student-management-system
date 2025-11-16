package edu.icet.model.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student {

    String id;
    String name;
    String address;
    String DOB;
    String email;
    Integer phoneNumber;

}
