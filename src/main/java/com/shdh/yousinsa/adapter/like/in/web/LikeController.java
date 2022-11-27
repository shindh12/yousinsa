package com.shdh.yousinsa.adapter.like.in.web;

import com.shdh.yousinsa.application.like.port.in.LikeInPort;
import com.shdh.yousinsa.domain.product.ProductID;
import com.shdh.yousinsa.domain.user.UserID;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/like")
public class LikeController {
    private final LikeInPort likeInPort;

    public LikeController(LikeInPort likeInPort) {
        this.likeInPort = likeInPort;
    }

    @PostMapping("/{product-id}/{user-id}")
    public void handleLike(@PathVariable("product-id") ProductID productID, @PathVariable("user-id") UserID userId){
        likeInPort.handleLike(productID, userId);
    }
}
