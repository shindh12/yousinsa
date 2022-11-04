package com.shdh.yousinsa.domain.order;

import com.shdh.yousinsa.domain.product.Price;
import com.shdh.yousinsa.domain.product.Product;
import com.shdh.yousinsa.domain.product.ProductDto;
import com.shdh.yousinsa.domain.user.Coupon;
import lombok.Builder;

@Builder
public class OrderInfo {
    ProductDto productDto;
    Coupon usedCoupon;


    public static OrderInfo from(Product product, Coupon usedCoupon) {
        return OrderInfo.builder()
                .productDto(ProductDto.from(product))
                .usedCoupon(usedCoupon)
                .build();
    }

    public Price getPurchasePrice(){
        return usedCoupon.calculateDiscountAmount(this.productDto.getDiscountedPrice());
    }

}
