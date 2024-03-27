package com.viana.vatresearch.dtos;

import java.util.UUID;

public class VatInfoDto {

    private String id;

    private String countryCode;

    private String vatNumber;

    private boolean formatValid;

    private boolean checksumValid;

    private RegistrationInfoDto registrationInfo;

    public VatInfoDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public boolean isFormatValid() {
        return formatValid;
    }

    public void setFormatValid(boolean formatValid) {
        this.formatValid = formatValid;
    }

    public boolean isChecksumValid() {
        return checksumValid;
    }

    public void setChecksumValid(boolean checksumValid) {
        this.checksumValid = checksumValid;
    }

    public RegistrationInfoDto getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(RegistrationInfoDto registrationInfo) {
        this.registrationInfo = registrationInfo;
    }
}
