package com.shdh.yousinsa.domain.user;

import com.devskiller.jfairy.Fairy;

public enum UserFixture {
    INSTANCE;

    public UserID userID() {
        return new UserID(Fairy.create().baseProducer().randomBetween(0, Long.MAX_VALUE));
    }
}
