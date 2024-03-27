package com.viana.vatresearch.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VatInfoResponse {

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("vat_number")
    private String vatNumber;

    @JsonProperty("format_valid")
    private boolean formatValid;

    @JsonProperty("checksum_valid")
    private boolean checksumValid;

    @JsonProperty("registration_info")
    private RegistrationInfoResponse registrationInfoResponse;

    public VatInfoResponse() {
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public boolean isFormatValid() {
        return formatValid;
    }

    public boolean isChecksumValid() {
        return checksumValid;
    }

    public RegistrationInfoResponse getRegistrationInfoResponse() {
        return registrationInfoResponse;
    }
}
