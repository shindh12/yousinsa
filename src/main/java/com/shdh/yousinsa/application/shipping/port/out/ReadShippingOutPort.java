package com.shdh.yousinsa.application.shipping.port.out;

import com.shdh.yousinsa.domain.shipping.Shipping;
import com.shdh.yousinsa.domain.shipping.ShippingId;

public interface ReadShippingOutPort {
    Shipping getShipping(ShippingId shippingId);
}
