package com.shdh.yousinsa.application.user.usecase;

import com.shdh.yousinsa.application.user.port.in.ReadUserPaymentInPort;
import com.shdh.yousinsa.application.user.port.out.ReadUserPaymentOutPort;
import com.shdh.yousinsa.domain.payment.PaymentMethod;
import com.shdh.yousinsa.domain.user.UserID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class ReadUserPaymentUsecase implements ReadUserPaymentInPort {
    private final ReadUserPaymentOutPort readUserPaymentOutPort;

    public ReadUserPaymentUsecase(ReadUserPaymentOutPort readUserPaymentOutPort) {
        this.readUserPaymentOutPort = readUserPaymentOutPort;
    }

    @Override
    public PaymentMethod getUserPayment(UserID userID) {
        return readUserPaymentOutPort.getUserPayment(userID);
    }
}
