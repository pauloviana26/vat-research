package com.viana.vatresearch.controller;

import com.viana.vatresearch.client.model.VatInfo;
import com.viana.vatresearch.service.VatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vat")
public class VatController {

    private final VatService vatService;

    public VatController(VatService vatService) {
        this.vatService = vatService;
    }

    @GetMapping
    public VatInfo validateVat(@RequestParam String vatNumber, @RequestParam(required = false) String countryCode) {
        return vatService.validateVatNumber(vatNumber, countryCode);
    }
}
