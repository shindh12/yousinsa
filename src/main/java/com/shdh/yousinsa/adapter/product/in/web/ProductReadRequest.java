package com.shdh.yousinsa.adapter.product.in.web;

import com.shdh.yousinsa.application.product.port.in.ReadProductSearchCondition;
import org.springframework.lang.Nullable;

public class ProductReadRequest {
    @Nullable
    String productNameLike;

    @Nullable
    String oneDepthCategory;

    @Nullable
    String twoDepthCategory;

    //TODO : 상세 카테고리 구조를 바꾼 뒤에 request -> searchCondition 변환을 해줘야할것 같음.
    public ReadProductSearchCondition toSearchCondition(){
        return ReadProductSearchCondition.builder()
                .productNameLike(productNameLike)
                .build();
    }
}
