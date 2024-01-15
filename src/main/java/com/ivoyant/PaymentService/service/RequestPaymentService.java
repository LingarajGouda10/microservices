package com.ivoyant.PaymentService.service;

import com.ivoyant.PaymentService.model.RequestPayment;
import com.ivoyant.PaymentService.repository.RequestPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestPaymentService {

    @Autowired
    private RequestPaymentRepository requestPaymentRepository;

    public RequestPayment upsertRequestPayment(RequestPayment requestPayment) {
        return requestPaymentRepository.save(requestPayment);
    }

    public RequestPayment saveRequestPayment(RequestPayment requestPayment) {
        return requestPaymentRepository.save(requestPayment);
    }

    public List<RequestPayment> getAllRequestPayments() {
        return requestPaymentRepository.findAll();
    }

    public RequestPayment getRequestPaymentById(int id) {
        return requestPaymentRepository.getReferenceById(id);
    }

    public String deleteRequestPaymentById(int id) {
        requestPaymentRepository.deleteById(id);
        return "deleted Successfully" + id;
    }


}
