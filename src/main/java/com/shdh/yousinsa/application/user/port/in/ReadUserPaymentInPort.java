package com.shdh.yousinsa.application.user.port.in;

import com.shdh.yousinsa.domain.payment.PaymentMethod;
import com.shdh.yousinsa.domain.user.UserID;

public interface ReadUserPaymentInPort {
    PaymentMethod getUserPayment(UserID userID);
}
