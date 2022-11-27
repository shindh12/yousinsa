package com.shdh.yousinsa.adapter.like.out.persistence;

import com.shdh.yousinsa.application.like.port.out.LikeOutPort;
import com.shdh.yousinsa.domain.like.UserLike;
import com.shdh.yousinsa.domain.product.ProductID;
import com.shdh.yousinsa.domain.user.UserID;
import org.springframework.stereotype.Component;

@Component
public class LikeRedisAdapter implements LikeOutPort {
    @Override
    public UserLike getUserLike(ProductID productID, UserID userId) {
        return null;
    }

    @Override
    public void create(UserLike userLike) {

    }

    @Override
    public void updateLike(UserLike userLike) {

    }
}
