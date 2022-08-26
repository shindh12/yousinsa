package com.shdh.yousinsa.domain.user;

import com.shdh.yousinsa.domain.shop.Shop;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

@Getter
public class Coupon {
    private String name;
    private LocalDateTime issueDateTime;
    private Shop issuer;
//    private LocalDateTime expireDateTime;
    private long expiredAt; // 일 단위

    @Builder
    public Coupon(String name, LocalDateTime issueDateTime, Shop issuer, int expiredAt) {
        this.name = name;
        this.issueDateTime = issueDateTime;
        this.issuer = issuer;
        this.expiredAt = expiredAt;
    }

    public LocalDateTime getExpireDateTime() {
        return issueDateTime.plusDays(expiredAt);
    }

    public long getRemainedDays() {
//        final var duration = Duration.between(LocalDateTime.now(), getExpireDateTime());
        return  ChronoUnit.DAYS.between(LocalDateTime.now(), getExpireDateTime());
//        return expiredAt - duration.get(ChronoUnit.DAYS);
    }

    public static Coupon of(String name, LocalDateTime issueDateTime, Shop issuer, int expiredAt) {
        return Coupon.builder()
                .name(name)
                .issueDateTime(issueDateTime)
                .issuer(issuer)
                .expiredAt(expiredAt)
                .build();
    }


}
