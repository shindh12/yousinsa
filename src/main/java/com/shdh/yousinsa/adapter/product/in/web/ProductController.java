package com.shdh.yousinsa.adapter.product.in.web;

import com.shdh.yousinsa.application.product.port.in.ReadProductInPort;
import com.shdh.yousinsa.domain.product.Product;
import com.shdh.yousinsa.domain.product.ProductDto;
import com.shdh.yousinsa.domain.product.ProductID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController("/product")
public class ProductController {
    ReadProductInPort readProductInPort;
    @GetMapping("/product-list")
    public List<ProductDto> getProducts(ProductReadRequest request){
        return readProductInPort.getProducts(request.toSearchCondition())
                .stream()
                .map(ProductDto::from)
                .collect(Collectors.toList());
    }

    @GetMapping("/{product-id}")
    public Product getProductDetail(@PathVariable("product-id") ProductID productId){
        return readProductInPort.getProduct(productId);
    }

}
