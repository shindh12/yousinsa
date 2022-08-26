package com.shdh.yousinsa.domain.stock;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Stock {
    private int quantity;
    private LocalDate estimatedDeliveryDate;
}
