package com.ivoyant.PaymentService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.desktop.UserSessionEvent;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class RequestPayment {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String reason;
    private LocalDate date;
    private int amount;
    private Status requestStatus;
}
