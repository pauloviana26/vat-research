package com.viana.vatresearch.domain.repositories;

import com.viana.vatresearch.domain.entities.VatInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VatInfoRepository extends JpaRepository<VatInfo, UUID> {
}
