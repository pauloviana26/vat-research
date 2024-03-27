package com.viana.vatresearch.service.impl;

import com.viana.vatresearch.client.VatApiClient;
import com.viana.vatresearch.client.model.VatInfoResponse;
import com.viana.vatresearch.service.VatService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VatServiceImpl implements VatService {

    private final VatApiClient vatApiClient;

    @Value("${vat.api.apiKey}")
    private String apiKey;

    public VatServiceImpl(VatApiClient vatApiClient) {
        this.vatApiClient = vatApiClient;
    }


    @Override
    public VatInfoResponse validateVatNumber(String vatNumber, String countryCode) {
        return vatApiClient.checkVatNumber(apiKey, vatNumber, countryCode);
    }
}
