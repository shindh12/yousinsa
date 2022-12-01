package com.shdh.yousinsa.domain.payment;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PaymentMethod {
    PaymentType type;
    Payment payment;

    @Builder
    public PaymentMethod(PaymentType type, Payment payment) {
        this.type = type;
        this.payment = payment;
    }

    public String getPaymentId() {
        return payment.getId();
    }
}
