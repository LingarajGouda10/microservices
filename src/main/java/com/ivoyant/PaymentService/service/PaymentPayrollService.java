package com.ivoyant.PaymentService.service;

import com.ivoyant.PaymentService.model.PaymentPayRoll;
import com.ivoyant.PaymentService.model.PaymentReimbursement;
import com.ivoyant.PaymentService.repository.PaymentPayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentPayrollService {

    @Autowired
    private PaymentPayrollRepository paymentPayrollRepository;

    public PaymentPayRoll upsertPaymentPayRoll(PaymentPayRoll paymentPayRoll) {
        return paymentPayrollRepository.save(paymentPayRoll);
    }

    public PaymentPayRoll savePaymentPayRoll(PaymentPayRoll paymentPayRoll) {
        return paymentPayrollRepository.save(paymentPayRoll);
    }

    public List<PaymentPayRoll> getAllPaymentPayRoll() {
        return paymentPayrollRepository.findAll();
    }

    public PaymentPayRoll getPaymentPayRollById(int id) {
        return paymentPayrollRepository.findById(id).get();
    }

    public String deletePaymentPayRollById(int id) {
        paymentPayrollRepository.deleteById(id);
        return "deleted Successfully" + id;
    }

}
