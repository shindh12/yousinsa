package com.shdh.yousinsa.domain.payment;

import lombok.Getter;

@Getter
public class CardPayment implements Payment {

    String cardNum;
    String cardCompany;
    int expireYear;
    int expireMonth;

    public CardPayment() {}

    public CardPayment(String cardNum, String cardCompany, int expireYear, int expireMonth) {
        this.cardNum = cardNum;
        this.cardCompany = cardCompany;
        this.expireYear = expireYear;
        this.expireMonth = expireMonth;
    }

    @Override
    public String getId() {
        return cardNum;
    }
}
