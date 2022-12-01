package com.shdh.yousinsa.application.like.port.out;

import com.shdh.yousinsa.domain.like.UserLike;
import com.shdh.yousinsa.domain.product.ProductID;
import com.shdh.yousinsa.domain.user.UserID;

import java.util.Optional;

public interface LikeOutPort {
    Optional<UserLike> getUserLike(ProductID productID, UserID userId);
    void create(UserLike userLike);
    void updateLike(UserLike userLike);
}
