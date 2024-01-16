package com.ivoyant.Assets.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class  HeadPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int headPhoneId;
    private List<Integer> employeeIds=new ArrayList<Integer>();
    private LocalDate issuedOn;

}
