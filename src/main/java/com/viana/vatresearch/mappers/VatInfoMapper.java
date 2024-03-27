package com.viana.vatresearch.mappers;

import com.viana.vatresearch.client.model.RegistrationInfoResponse;
import com.viana.vatresearch.client.model.VatInfoResponse;
import com.viana.vatresearch.domain.entities.RegistrationInfo;
import com.viana.vatresearch.domain.entities.VatInfo;
import com.viana.vatresearch.dtos.RegistrationInfoDto;
import com.viana.vatresearch.dtos.VatInfoDto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VatInfoMapper {

    public static VatInfo toVatInfo(VatInfoDto vatInfoDto) {
        VatInfo vatInfo = new VatInfo();
        vatInfo.setVatNumber(vatInfoDto.getVatNumber());
        vatInfo.setCountryCode(vatInfoDto.getCountryCode());
        vatInfo.setFormatValid(vatInfoDto.isFormatValid());
        vatInfo.setRegistrationInfo(toRegistrationInfo(vatInfoDto.getRegistrationInfo()));
        return vatInfo;
    }

    public static VatInfoDto toVatInfoDto(VatInfo vatInfo) {
        VatInfoDto vatInfoDto = new VatInfoDto();
        vatInfoDto.setRegistrationInfo(toRegistrationInfoDto(vatInfo.getRegistrationInfo()));
        vatInfoDto.setId(vatInfo.getId().toString());
        vatInfoDto.setVatNumber(vatInfo.getVatNumber());
        vatInfoDto.setChecksumValid(vatInfo.isChecksumValid());
        vatInfoDto.setCountryCode(vatInfo.getCountryCode());
        vatInfoDto.setFormatValid(vatInfo.isFormatValid());
        return vatInfoDto;
    }

    public static VatInfoDto toVatInfoDto(VatInfoResponse vatInfoResponse) {
        VatInfoDto vatInfoDto = new VatInfoDto();
        vatInfoDto.setRegistrationInfo(toRegistrationInfoDto(vatInfoResponse.getRegistrationInfoResponse()));
        vatInfoDto.setVatNumber(vatInfoResponse.getVatNumber());
        vatInfoDto.setChecksumValid(vatInfoResponse.isChecksumValid());
        vatInfoDto.setCountryCode(vatInfoResponse.getCountryCode());
        vatInfoDto.setFormatValid(vatInfoResponse.isFormatValid());
        return vatInfoDto;
    }

    private static RegistrationInfo toRegistrationInfo(RegistrationInfoDto registrationInfoDto) {
        RegistrationInfo registrationInfo = new RegistrationInfo();
        registrationInfo.setName(registrationInfoDto.getName());
        registrationInfo.setAddress(registrationInfoDto.getAddress());
        registrationInfo.setCheckedAt(registrationInfoDto.getCheckedAt());
        registrationInfo.setRegistered(registrationInfoDto.isRegistered());
        return registrationInfo;
    }

    private static RegistrationInfoDto toRegistrationInfoDto(RegistrationInfo registrationInfo) {
        RegistrationInfoDto registrationInfoDto = new RegistrationInfoDto();
        registrationInfoDto.setName(registrationInfo.getName());
        registrationInfoDto.setAddress(registrationInfo.getAddress());
        registrationInfoDto.setCheckedAt(registrationInfo.getCheckedAt());
        registrationInfoDto.setRegistered(registrationInfo.isRegistered());
        registrationInfoDto.setId(registrationInfo.getId().toString());
        return registrationInfoDto;
    }

    private static RegistrationInfoDto toRegistrationInfoDto(RegistrationInfoResponse registrationInfo) {
        RegistrationInfoDto registrationInfoDto = new RegistrationInfoDto();
        registrationInfoDto.setName(registrationInfo.getName());
        registrationInfoDto.setAddress(registrationInfo.getAddress());
        registrationInfoDto.setCheckedAt(parseStringToLocalDateTime(registrationInfo.getCheckedAt()));
        registrationInfoDto.setRegistered(registrationInfo.isRegistered());
        return registrationInfoDto;
    }

    private static LocalDateTime parseStringToLocalDateTime(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSZ");
        return LocalDateTime.parse(dateString, formatter);
    }
}
