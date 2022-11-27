package com.shdh.yousinsa.application.product.port.in;

import com.shdh.yousinsa.domain.product.Product;

import java.util.List;

public interface ReadProductInPort {
    public List<Product> getProducts(ReadProductSearchCondition searchCondition);

}
