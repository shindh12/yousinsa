package com.shdh.yousinsa.adapter.product.out.persistence;

import com.shdh.yousinsa.application.product.port.in.ReadProductSearchCondition;
import com.shdh.yousinsa.application.product.port.out.ReadProductOutPort;
import com.shdh.yousinsa.domain.product.Product;

import java.util.List;

public class ReadProductListJpaAdapter implements ReadProductOutPort {
    @Override
    public List<Product> getProductList(ReadProductSearchCondition searchCondition) {
        return null;
    }
}
