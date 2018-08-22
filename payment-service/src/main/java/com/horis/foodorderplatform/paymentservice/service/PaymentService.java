package com.horis.foodorderplatform.paymentservice.service;

import com.horis.foodorderplatform.paymentservice.domain.Payment;

public interface PaymentService {
    void processPayment(Payment payment);
}
