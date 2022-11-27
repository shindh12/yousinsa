package com.shdh.yousinsa.application.product.port.in;

import com.shdh.yousinsa.domain.product.Product;
import lombok.Builder;

import java.util.List;


//TODO category 변경 후 작업 필요
public class ReadProductSearchCondition {
    private String productNameLike;
    private Product.ProductCategory category;

    @Builder
    public ReadProductSearchCondition(String productNameLike, List<Product.ProductCategory> categories) {
        this.productNameLike = productNameLike;
    }
}
