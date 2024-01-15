package com.ivoyant.PaymentService.repository;

import com.ivoyant.PaymentService.model.PaymentPayRoll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentPayrollRepository extends JpaRepository<PaymentPayRoll, Integer> {
}
