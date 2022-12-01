package com.shdh.yousinsa.domain.payment;

import lombok.Builder;
import lombok.Getter;

@Getter
public class EfinPayment implements Payment {
    String accountId;
    EfinType type;

    @Builder
    public EfinPayment(String accountId, EfinType type) {
        this.accountId = accountId;
        this.type = type;
    }

    @Override
    public String getId() {
        return accountId;
    }

    enum EfinType {
        NAVER, KAKAOPAY
    }
}
