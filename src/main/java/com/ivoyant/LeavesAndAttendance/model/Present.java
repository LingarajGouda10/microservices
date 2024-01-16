package com.ivoyant.LeavesAndAttendance.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Present {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private LocalDateTime login;
    private LocalDateTime logout;
    private String remarks;
}
