package com.shdh.yousinsa.application.like.usecase;

import com.shdh.yousinsa.application.like.port.in.LikeInPort;
import com.shdh.yousinsa.application.like.port.out.LikeOutPort;
import com.shdh.yousinsa.domain.like.UserLike;
import com.shdh.yousinsa.domain.product.ProductID;
import com.shdh.yousinsa.domain.user.UserID;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LikeUseCase implements LikeInPort {

    private final LikeOutPort likeOutPort;

    public LikeUseCase(@Qualifier("LikeJpaAdapter") LikeOutPort likeOutPort) {
        this.likeOutPort = likeOutPort;
    }

    @Override
    public void handleLike(ProductID productId, UserID userId) {
        likeOutPort.getUserLike(productId, userId)
                .ifPresentOrElse(
                        userLike -> likeOutPort.updateLike(userLike.toggled()),
                        () -> likeOutPort.create(UserLike.createNew(productId, userId)));
    }
}
