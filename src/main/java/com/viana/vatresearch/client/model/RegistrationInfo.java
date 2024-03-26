package com.viana.vatresearch.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistrationInfo {

    @JsonProperty("is_registered")
    private boolean isRegistered;

    private String name;

    private String address;

    @JsonProperty("checked_at")
    private String checkedAt;

    public RegistrationInfo() {
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCheckedAt() {
        return checkedAt;
    }
}
