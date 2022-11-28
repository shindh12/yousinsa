package com.shdh.yousinsa.adapter.user.out.persistence;

import com.shdh.yousinsa.application.user.port.out.ReadUserPaymentOutPort;
import com.shdh.yousinsa.domain.payment.CardPayment;
import com.shdh.yousinsa.domain.payment.PaymentMethod;
import com.shdh.yousinsa.domain.payment.PaymentType;
import com.shdh.yousinsa.domain.user.UserID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ReadUserPaymentPersistenceAdapter implements ReadUserPaymentOutPort {

    @Override
    public PaymentMethod getUserPayment(UserID userID) {
        return new PaymentMethod(PaymentType.CARD, new CardPayment());
    }
}
