package com.viana.vatresearch.domain.entities;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "vat_info")
public class VatInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 2)
    private String countryCode;

    @Column(nullable = false, length = 11, unique = true)
    private String vatNumber;

    @Column
    private boolean formatValid;

    @Column
    private boolean checksumValid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registration_info_id", referencedColumnName = "id")
    private RegistrationInfo registrationInfo;

    public VatInfo() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public RegistrationInfo getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(RegistrationInfo registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

    public boolean isChecksumValid() {
        return checksumValid;
    }

    public void setChecksumValid(boolean checksumValid) {
        this.checksumValid = checksumValid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VatInfo vatInfo = (VatInfo) o;
        return Objects.equals(id, vatInfo.id) && Objects.equals(vatNumber, vatInfo.vatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vatNumber);
    }
}
