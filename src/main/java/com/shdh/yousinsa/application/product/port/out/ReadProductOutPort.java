package com.shdh.yousinsa.application.product.port.out;

import com.shdh.yousinsa.application.product.port.in.ReadProductSearchCondition;
import com.shdh.yousinsa.domain.product.Product;

import java.util.List;

public interface ReadProductOutPort {
    List<Product> getProductList(ReadProductSearchCondition searchCondition);
}
