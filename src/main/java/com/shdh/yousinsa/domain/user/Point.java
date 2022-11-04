package com.shdh.yousinsa.domain.user;

import com.shdh.yousinsa.domain.product.Price;

public record Point(long value) {

    public Price toPrice() {
        return new Price(value);
    }
}
