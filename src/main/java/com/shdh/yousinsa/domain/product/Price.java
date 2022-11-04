package com.shdh.yousinsa.domain.product;

public record Price(long value) {

    public static Price of(double value) {
        return new Price((long) Math.floor(value));
    }

    public Price subtract(Price target){
        return new Price(this.value - target.value());
    }

    public Price add(Price target){
        return new Price(this.value + target.value());
    }
}
