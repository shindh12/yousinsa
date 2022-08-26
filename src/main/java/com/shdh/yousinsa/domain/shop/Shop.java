package com.shdh.yousinsa.domain.shop;

import lombok.AccessLevel;
import lombok.Builder;

import java.util.Set;

public enum Shop {

    무신사(new ShopID(1L), "무신사"),
    ;
    Shop(ShopID id, String name) {
        this.id = id;
        this.name = name;
    }

    private ShopID id;
    private String name;
}
