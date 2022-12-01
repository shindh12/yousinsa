package com.shdh.yousinsa.adapter.user.in.web;

import com.shdh.yousinsa.application.user.port.in.ReadUserPaymentInPort;
import com.shdh.yousinsa.domain.user.UserID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserPaymentController {

    private final ReadUserPaymentInPort readUserPaymentInPort;

    public UserPaymentController(final ReadUserPaymentInPort readUserPaymentInPort) {
        this.readUserPaymentInPort = readUserPaymentInPort;
    }

    @GetMapping("/{userID}/payment")
    public ReadUserPaymentViewModel getUserPayment(@PathVariable Long userID) {
        final var userPayment = readUserPaymentInPort.getUserPayment(new UserID(userID));
        return new ReadUserPaymentViewModel(userPayment.getPaymentId(), userPayment.getType().name()); // FIXME : Enum name 말고 다른 코드 같은거로 대체
    }
}
