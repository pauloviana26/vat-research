package com.viana.vatresearch.domain.repositories;

import com.viana.vatresearch.domain.entities.RegistrationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RegistrationInfoRepository extends JpaRepository<RegistrationInfo, UUID> {
}
