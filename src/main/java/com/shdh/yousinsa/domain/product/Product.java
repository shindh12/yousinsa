package com.shdh.yousinsa.domain.product;

import lombok.AccessLevel;
import lombok.Builder;

import java.util.Set;

public class Product {
    private ProductID id;
    private String productName;
    private Color color;
    private ProductCategory category;
    private Price price;
    private int displayPriority;
    private Double discountRate;
    private String thumbnailImageUrl;
    private String detailImageUrl;
    private ShopID shopId;
    private Option sizeOption;
    private int like;
    private String description;


    enum ProductCategory {
        상의("TOP", Set.of("dd", "dd")),
        하의("BOTTOM", Set.of("aa", "bb")),
        악세사리("ACC", Set.of("bb", "cc"));

        @Builder(access = AccessLevel.PUBLIC)
        ProductCategory(String depth1, Set<String> depth2) {
            this.depth1 = depth1;
            this.depth2 = depth2;
        }

        private final String depth1;
        private final Set<String> depth2;

//        private final Map<String, ProductCategory> map = Map.of();
//
//        public ProductCategory of(String code) {
//            return map.getOrDefault(code, DEFAULT);
//        }
    }

}
