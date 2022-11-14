package com.shdh.yousinsa.adapter.shipping.out.persistence;

import com.shdh.yousinsa.application.shipping.port.out.ReadShippingOutPort;
import com.shdh.yousinsa.domain.shipping.Shipping;
import com.shdh.yousinsa.domain.shipping.ShippingId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ReadShippingPersistenceAdapter implements ReadShippingOutPort {
    // jpa, jdbc, ...
    // mapper
    @Override
    public Shipping getShipping(ShippingId shippingId) {
        // var row = jpa.read(id);
        // var domain = mapper.convert(row);
        // return domain;
        return null;
    }
}
