package com.shdh.yousinsa.domain.like;

import com.shdh.yousinsa.domain.product.ProductID;
import com.shdh.yousinsa.domain.user.UserID;
import lombok.Builder;

public class UserLike {
    private UserID userId;
    private ProductID productID;
    private boolean like;

    @Builder(toBuilder = true)
    UserLike(UserID userId, ProductID productID, boolean like) {
        this.userId = userId;
        this.productID = productID;
        this.like = like;
    }


    public static UserLike createNew(ProductID productID, UserID userId) {
        return UserLike.builder()
                .productID(productID)
                .userId(userId)
                .like(true)
                .build();
    }

    public UserLike toggled(){
        return this.toBuilder()
                .like(!this.like)
                .build();
    }
}
