package com.shdh.yousinsa.adapter.like.out.persistence;

import com.shdh.yousinsa.application.like.port.out.LikeOutPort;
import com.shdh.yousinsa.domain.like.UserLike;
import com.shdh.yousinsa.domain.product.ProductID;
import com.shdh.yousinsa.domain.user.UserID;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("LikeJpaAdapter")
public class LikeJpaAdapter implements LikeOutPort {

    @Override
    public Optional<UserLike> getUserLike(ProductID productID, UserID userId) {
        return Optional.empty();
    }

    @Override
    public void create(UserLike userLike) {
        //test
    }

    @Override
    public void updateLike(UserLike userLike) {
        //test
    }
}
