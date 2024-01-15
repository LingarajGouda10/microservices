package com.ivoyant.LeavesAndAttendance.model;

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
@Entity
@Table

public class UnpaidLeave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private List<Integer> emplyoeeId= new ArrayList<Integer>();
    private int noOfUnpaidLeaves;
    private LocalDate dateOfLeave;
}
