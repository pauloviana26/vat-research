package com.viana.vatresearch.service;

import com.viana.vatresearch.client.model.VatInfoResponse;

public interface VatService {

    VatInfoResponse validateVatNumber(String vatNumber, String countryCode);
}
