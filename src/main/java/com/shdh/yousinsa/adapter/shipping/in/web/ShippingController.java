package com.shdh.yousinsa.adapter.shipping.in.web;

import com.shdh.yousinsa.application.shipping.port.in.ReadShippingInPort;
import com.shdh.yousinsa.domain.shipping.ShippingId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipping")
@RequiredArgsConstructor
public class ShippingController {

    private final ReadShippingInPort readShippingInPort;

    @GetMapping("/{id}")
    public ReadShippingViewModel getShipping(@PathVariable Long id) {
        final var shipping = readShippingInPort.getShipping(new ShippingId(id));
        return new ReadShippingViewModel(shipping.getId().value());
    }
}
