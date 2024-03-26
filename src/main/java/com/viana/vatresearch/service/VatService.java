package com.viana.vatresearch.service;

import com.viana.vatresearch.client.model.VatInfo;

public interface VatService {

    VatInfo validateVatNumber(String vatNumber, String countryCode);
}
