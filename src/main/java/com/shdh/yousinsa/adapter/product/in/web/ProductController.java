package com.shdh.yousinsa.adapter.product.in.web;

import com.shdh.yousinsa.application.product.port.in.ReadProductInPort;
import com.shdh.yousinsa.domain.product.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/product")
public class ProductController {
    ReadProductInPort readProductInPort;
    @GetMapping("/product-list")
    public List<Product> getProduct(ProductReadRequest request){
        return readProductInPort.getProducts(request);
    }

}
