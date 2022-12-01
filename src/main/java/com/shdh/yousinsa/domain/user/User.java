package com.shdh.yousinsa.domain.user;

import com.shdh.yousinsa.domain.payment.PaymentMethod;
import lombok.Getter;

import java.util.List;

@Getter
public class User {
    private UserID userID;
    private String name;
    private String phone;
    private Gender gender;
    private Address primaryAddress;
    private List<Address> shippingAdresses;
    private PaymentMethod primaryPaymentMethod;
    private List<PaymentMethod> paymentMethods;

    private List<Coupon> coupons;
    private Point point;

    static class Address{
        String name;
        String city;
        String zipCode;
        String detailAddress;
    }


    enum Gender{
        MAN, WOMEN
    }

}
