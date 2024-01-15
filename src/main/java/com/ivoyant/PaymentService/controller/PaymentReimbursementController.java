package com.ivoyant.PaymentService.controller;

import com.ivoyant.PaymentService.model.PaymentReimbursement;
import com.ivoyant.PaymentService.model.RequestPayment;
import com.ivoyant.PaymentService.service.PaymentReimbursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentReimbursementController {

    @Autowired
    private PaymentReimbursementService paymentReimbursementService;

    @PostMapping("/paymentReimbursement")
    public PaymentReimbursement addPaymentReimbursement(@RequestBody PaymentReimbursement paymentReimbursement) {
        return paymentReimbursementService.savePaymentReimbursement(paymentReimbursement);
    }

    @PutMapping("/paymentReimbursement")
    public PaymentReimbursement updatePaymentReimbursement(@RequestBody PaymentReimbursement paymentReimbursement) {
        return paymentReimbursementService.upsertPaymentReimbursement(paymentReimbursement);
    }

    @GetMapping("/allPaymentReimbursement")
    public List<PaymentReimbursement> getAllPaymentReimbursements() {
        return paymentReimbursementService.getAllPaymentReimbursement();
    }

    @GetMapping("/paymentReimbursement/{id}")
    public PaymentReimbursement getPaymentReimbursementOnId(@PathVariable int id) {
        return paymentReimbursementService.getPaymentReimbursementById(id);
    }

    @DeleteMapping("paymentReimbursement/{id}")
    public String deletePaymentReimbursement(@PathVariable int id) {
        return paymentReimbursementService.deletePaymentReimbursementById(id);
    }
}
