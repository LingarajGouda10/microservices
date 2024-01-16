package com.ivoyant.PaymentService.controller;

import com.ivoyant.PaymentService.model.PaymentPayRoll;
import com.ivoyant.PaymentService.model.PaymentReimbursement;
import com.ivoyant.PaymentService.service.PaymentPayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentPayRollController {

    @Autowired
    private PaymentPayrollService paymentPayrollService;

    @PostMapping("/paymentPayRoll")
    public PaymentPayRoll addpaymentPayroll(@RequestBody PaymentPayRoll paymentPayRoll) {
        return paymentPayrollService.savePaymentPayRoll(paymentPayRoll);
    }

    @PutMapping("/paymentPayRoll")
    public PaymentPayRoll updatePaymentPayRoll(@RequestBody PaymentPayRoll paymentPayRoll) {
        return paymentPayrollService.upsertPaymentPayRoll(paymentPayRoll);
    }

    @GetMapping("/allPaymentPayRoll")
    public List<PaymentPayRoll> getAllPaymentPayRolls() {
        return paymentPayrollService.getAllPaymentPayRoll();
    }

    @GetMapping("/paymentPayRoll/{id}")
    public PaymentPayRoll getPaymentPayRollOnId(@PathVariable int id) {
        return paymentPayrollService.getPaymentPayRollById(id);
    }

    @DeleteMapping("paymentPayRoll/{id}")
    public String deletePaymentPayRoll(@PathVariable int id) {
        return paymentPayrollService.deletePaymentPayRollById(id);
    }
}
