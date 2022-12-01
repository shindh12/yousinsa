package com.shdh.yousinsa.application.user.port.out;

import com.shdh.yousinsa.domain.payment.PaymentMethod;
import com.shdh.yousinsa.domain.user.UserID;

public interface ReadUserPaymentOutPort {
    PaymentMethod getUserPayment(UserID userID);
}
