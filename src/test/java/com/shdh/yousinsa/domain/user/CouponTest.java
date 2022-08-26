package com.shdh.yousinsa.domain.user;

import com.shdh.yousinsa.domain.shop.Shop;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class CouponTest {

    @Test
    void getRemainedDays() {
        // given
        final var coupon = Coupon.of(
                "test",
                LocalDateTime.now().minusDays(25).plusMinutes(1),
                Shop.무신사,
                30
        );

        // when
        long actualRemained = coupon.getRemainedDays();
        long expectRemaind = 5;

        // then
        assertThat(actualRemained).isEqualTo(expectRemaind);

    }
}
