package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class StudentEntity {

    @Id
    String id;
    String name;
    String address;
    LocalDate DOB;
    String email;
    Integer phoneNumber;

}
