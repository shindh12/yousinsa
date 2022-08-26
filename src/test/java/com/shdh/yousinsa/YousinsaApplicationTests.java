package com.shdh.yousinsa;

import com.shdh.yousinsa.domain.product.ProductID;
import com.shdh.yousinsa.domain.shop.Shop;
import com.shdh.yousinsa.domain.user.Coupon;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
class YousinsaApplicationTests {

    @Test
    void contextLoads() {
        ProductID id1 = new ProductID(1L);
        ProductID id2 = new ProductID(1L);

        assertThat(id1).isEqualTo(id2);
    }


}
