package com.shdh.yousinsa.domain.user;

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

    static class PaymentMethod {
        PaymentType type;
        Payment payment;

        public String getPaymentId() {
            return payment.getId();
        }
    }

    static class CardPayment implements Payment {

        String cardNum;
        String cardCompany;
        int expireYear;
        int expireMonth;

        @Override
        public String getId() {
            return cardNum;
        }
    }

    static class EfinPayment implements Payment {
        String accountId;
        EfinType type;

        @Override
        public String getId() {
            return accountId;
        }

        enum EfinType {
            NAVER, KAKAOPAY
        }
    }
    interface Payment {
        String getId();
    }

    enum Gender{
        MAN, WOMEN
    }

    enum PaymentType {
        CARD, EFIN
    }
}
