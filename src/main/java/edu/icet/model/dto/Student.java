package edu.icet.model.dto;

import lombok.*;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student {

    String id;
    String name;
    String address;
    LocalDate DOB;
    String email;
    Integer phoneNumber;

}
