package com.shdh.yousinsa.application.shipping.usecase;

import com.shdh.yousinsa.application.shipping.port.in.ReadShippingInPort;
import com.shdh.yousinsa.application.shipping.port.out.ReadShippingOutPort;
import com.shdh.yousinsa.domain.shipping.Shipping;
import com.shdh.yousinsa.domain.shipping.ShippingId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReadShippingUsecase implements ReadShippingInPort {

    private final ReadShippingOutPort readShippingOutPort;

    @Override
    public Shipping getShipping(ShippingId shippingId) {
        final var shipping = readShippingOutPort.getShipping(shippingId);
        // TODO : logic 추가
        return shipping;
    }
}
