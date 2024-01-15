package com.ivoyant.EmployeeDetails.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeDetails {

    private int id;
    private String name;
    private int age;
    private String email;
    private Gender gender;
    private long phoneNumber;
    private Role role;
    private double salary;

}
