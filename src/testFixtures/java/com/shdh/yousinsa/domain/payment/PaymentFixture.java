package com.shdh.yousinsa.domain.payment;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.BaseProducer;
import com.devskiller.jfairy.producer.text.TextProducer;

public enum PaymentFixture {
    INSTANCE;

    private static final Fairy fairy = Fairy.create();
    private static final BaseProducer baseProducer = Fairy.create().baseProducer();
    private static final TextProducer textProducer = Fairy.create().textProducer();
    public CardPayment cardPayment() {
        return new CardPayment(fairy.creditCard().getCardNumber(),
                fairy.creditCard().getVendor(),
                baseProducer.randomBetween(2020, 2030),
                baseProducer.randomBetween(1, 12));
    }

    public EfinPayment efinPayment(){
        return new EfinPayment(fairy.iban().getAccountNumber(),
                baseProducer.randomElement(EfinPayment.EfinType.class));
    }

}
