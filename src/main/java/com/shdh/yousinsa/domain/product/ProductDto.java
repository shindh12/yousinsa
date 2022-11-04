package com.shdh.yousinsa.domain.product;

import com.shdh.yousinsa.domain.shop.Shop;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProductDto {
    private ProductID id;
    private String productName;
    private Color color;
    private Option sizeOption;
    private Price discountedPrice;
    private String thumbnailImageUrl;
    private Shop shop;

    public static ProductDto from(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .productName(product.getProductName())
                .color(product.getColor())
                .sizeOption(product.getSizeOption())
                .discountedPrice(product.getDiscountedPrice())
                .thumbnailImageUrl(product.getThumbnailImageUrl())
                .build();
    }
}
