package com.ivoyant.PaymentService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class PaymentPayRoll {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double basePay;
    private double variablePay;
    private double pf;
    private float tax;

}
