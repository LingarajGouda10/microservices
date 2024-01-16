package com.ivoyant.PaymentService.repository;

import com.ivoyant.PaymentService.model.RequestPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestPaymentRepository extends JpaRepository<RequestPayment, Integer> {
}
