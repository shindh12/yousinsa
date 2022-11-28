package com.shdh.yousinsa.adapter.user.in.web;

import com.shdh.yousinsa.application.user.port.in.ReadUserPaymentInPort;
import com.shdh.yousinsa.domain.user.UserID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserPaymentController {

    private final ReadUserPaymentInPort readUserPaymentInPort;

    @GetMapping("/{userID}/payment")
    public ReadUserPaymentViewModel getUserPayment(@PathVariable Long userID) {
        final var userPayment = readUserPaymentInPort.getUserPayment(new UserID(userID));
        return new ReadUserPaymentViewModel(userPayment.getPaymentId(), userPayment.getType().name()); // FIXME : Enum name 말고 다른 코드 같은거로 대체
    }
}
