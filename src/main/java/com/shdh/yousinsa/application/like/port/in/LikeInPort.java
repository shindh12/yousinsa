package com.shdh.yousinsa.application.like.port.in;

import com.shdh.yousinsa.domain.product.ProductID;
import com.shdh.yousinsa.domain.user.UserID;

public interface LikeInPort {
    void handleLike(ProductID productId, UserID userId);
}
