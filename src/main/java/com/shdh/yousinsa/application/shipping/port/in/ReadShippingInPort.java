package com.shdh.yousinsa.application.shipping.port.in;

import com.shdh.yousinsa.domain.shipping.Shipping;
import com.shdh.yousinsa.domain.shipping.ShippingId;

public interface ReadShippingInPort {
    Shipping getShipping(ShippingId shippingId);
}
