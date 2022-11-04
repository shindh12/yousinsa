package com.shdh.yousinsa.domain.product;

import com.shdh.yousinsa.domain.shop.Shop;
import com.shdh.yousinsa.domain.stock.Stock;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
public class Product {
    private ProductID id;
    private String productName;
    private Color color;
    private ProductCategory category;
    private Price price;
    private int displayPriority;
    private Double discountRate; // 1이 100%
    private String thumbnailImageUrl;
    private String detailImageUrl;
    private Shop shop;
    private Option sizeOption;
    private int like;
    private String description;
    private Stock stock;


    public LocalDate getEstimatedDeliveryDate(){
        return this.stock.getEstimatedDeliveryDate();
    }

    public int getStockQuantity(){
        return this.stock.getQuantity();
    }

    public Price getTotalPrice(){
        return price.subtract(getDiscountedPrice());
    }

    public Price getDiscountedPrice(){
        return Price.of(price.value() * discountRate);
    }

    @Getter
    enum ProductCategory {
        상의("TOP", Set.of("dd", "dd")),
        하의("BOTTOM", Set.of("aa", "bb")),
        악세사리("ACC", Set.of("bb", "cc"));

        private final String depth1;
        private final Set<String> depth2;
        private final Map<String, ProductCategory> map = Arrays.stream(ProductCategory.values())
                .collect(Collectors.toMap(ProductCategory::getDepth1, Function.identity()));

        ProductCategory(String depth1, Set<String> depth2) {
            this.depth1 = depth1;
            this.depth2 = depth2;
        }

        public ProductCategory of(String code) {
            return map.get(code);
        }
    }

}
