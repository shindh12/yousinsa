package com.shdh.yousinsa.domain.payment;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.BaseProducer;
import com.devskiller.jfairy.producer.text.TextProducer;

public enum PaymentMethodFixture  {
    INSTANCE;

    private static final BaseProducer baseProducer = Fairy.create().baseProducer();
    private static final TextProducer textProducer = Fairy.create().textProducer();

    public PaymentMethod cardPaymentMethod() {
        return new PaymentMethod(baseProducer.randomElement(PaymentType.class),
                PaymentFixture.INSTANCE.cardPayment());
    }
    public PaymentMethod efinPaymentMethod() {
        return new PaymentMethod(baseProducer.randomElement(PaymentType.class),
                PaymentFixture.INSTANCE.efinPayment());
    }

}
