package com.shdh.yousinsa.adapter.user.in.web;

import com.shdh.yousinsa.application.user.port.in.ReadUserPaymentInPort;
import com.shdh.yousinsa.domain.payment.PaymentMethodFixture;
import com.shdh.yousinsa.domain.user.UserFixture;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.doReturn;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.payload.JsonFieldType.STRING;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserPaymentController.class)
@AutoConfigureMockMvc
@AutoConfigureRestDocs
public class UserPaymentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ReadUserPaymentInPort inPort;

    @Test
    void getUserPayment_shouldBe200Status_whenHasUserPayment() throws Exception {
        // given
        final var userID = UserFixture.INSTANCE.userID();
        final var result = PaymentMethodFixture.INSTANCE.cardPaymentMethod();

        // when
        doReturn(result).when(inPort).getUserPayment(userID);

        // then
        mockMvc.perform(get("/user/{userID}/payment", userID.value()))
                .andExpect(status().isOk())
                .andDo(print())
                .andDo(document("get-user-payment",
                        pathParameters(
                                parameterWithName("userID").description("결제 수단 소유 유저 아이디")
                        ),
//                        requestFields(
//
//                        ),
                        responseFields(
                                fieldWithPath("paymentID").type(STRING).description("결제수단 정보"),
                                fieldWithPath("paymentType").type(STRING).description("결제 수단 방식")
                        )
                ));
    }
}
