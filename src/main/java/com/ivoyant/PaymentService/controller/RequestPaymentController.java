package com.ivoyant.PaymentService.controller;

import com.ivoyant.PaymentService.model.RequestPayment;
import com.ivoyant.PaymentService.service.RequestPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RequestPaymentController {

    @Autowired
    private RequestPaymentService service;

    @PostMapping("/requestPayment")
    public RequestPayment addRequestPayment(@RequestBody RequestPayment requestPayment) {
        return service.saveRequestPayment(requestPayment);
    }

    @PutMapping("/requestPayment")
    public RequestPayment updateRequestPayment(@RequestBody RequestPayment requestPayment) {
        return service.upsertRequestPayment(requestPayment);
    }

    @GetMapping("/allRequestPayments")
    public List<RequestPayment> getAllRequestPayment() {
        return service.getAllRequestPayments();
    }

    @GetMapping("/requestPayment/{id}")
    public RequestPayment getRequestPaymentOnId(@PathVariable int id) {
        return service.getRequestPaymentById(id);
    }

    @DeleteMapping("requestPayment/{id}")
    public String deleteRequestPayment(@PathVariable int id) {
        return service.deleteRequestPaymentById(id);
    }

}
