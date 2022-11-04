package com.shdh.yousinsa.domain.order;

import com.shdh.yousinsa.domain.product.Price;
import com.shdh.yousinsa.domain.user.Point;
import com.shdh.yousinsa.domain.user.User;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class OrderSheet {
    User user;
    Point usedPoint;
    LocalDateTime orderDateTime;

    List<OrderInfo> orderInfos;
    //TODO 결제수단 도메인 개발 후 이 주문정보에 이용된 결제수단 추가 LocalDateTime paymentDateTime;
    //TODO 배송지 도메인 개발 후 이 주문정보에 이용된 배송지 추가

    public Price getTotalPrice(){
        final var sumPrice = new Price(orderInfos.stream().mapToLong(o -> o.getPurchasePrice().value()).sum());
        return sumPrice.subtract(usedPoint.toPrice());
    }
}
