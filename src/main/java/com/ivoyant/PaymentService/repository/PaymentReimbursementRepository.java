package com.ivoyant.PaymentService.repository;

import com.ivoyant.PaymentService.model.PaymentReimbursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentReimbursementRepository extends JpaRepository<PaymentReimbursement, Integer> {
}
