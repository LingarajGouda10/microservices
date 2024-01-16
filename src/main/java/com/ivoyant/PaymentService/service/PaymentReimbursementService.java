package com.ivoyant.PaymentService.service;

import com.ivoyant.PaymentService.model.PaymentReimbursement;
import com.ivoyant.PaymentService.model.RequestPayment;
import com.ivoyant.PaymentService.repository.PaymentReimbursementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentReimbursementService {

    @Autowired
    private PaymentReimbursementRepository paymentReimbursementRepository;

    public PaymentReimbursement upsertPaymentReimbursement(PaymentReimbursement paymentReimbursement) {
        return paymentReimbursementRepository.save(paymentReimbursement);
    }

    public PaymentReimbursement savePaymentReimbursement(PaymentReimbursement paymentReimbursement) {
        return paymentReimbursementRepository.save(paymentReimbursement);
    }

    public List<PaymentReimbursement> getAllPaymentReimbursement() {
        return paymentReimbursementRepository.findAll();
    }

    public PaymentReimbursement getPaymentReimbursementById(int id) {
        return paymentReimbursementRepository.getReferenceById(id);
    }

    public String deletePaymentReimbursementById(int id) {
        paymentReimbursementRepository.deleteById(id);
        return "deleted Successfully" + id;
    }

}
