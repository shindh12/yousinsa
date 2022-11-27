package com.shdh.yousinsa.application.product.usecase;

import com.shdh.yousinsa.application.product.port.in.ReadProductInPort;
import com.shdh.yousinsa.application.product.port.in.ReadProductSearchCondition;
import com.shdh.yousinsa.application.product.port.out.ReadProductOutPort;
import com.shdh.yousinsa.domain.product.Product;
import com.shdh.yousinsa.domain.product.ProductID;

import java.util.List;

public class ReadProductListUseCase implements ReadProductInPort {
    private final ReadProductOutPort readProductOutPort;

    public ReadProductListUseCase(ReadProductOutPort readProductOutPort) {
        this.readProductOutPort = readProductOutPort;
    }

    @Override
    public List<Product> getProducts(ReadProductSearchCondition searchCondition) {
        return readProductOutPort.getProductList(searchCondition);
    }

    @Override
    public Product getProduct(ProductID productID) {
        return readProductOutPort.getProductById(productID);
    }
}
