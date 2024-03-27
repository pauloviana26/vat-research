package com.viana.vatresearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.viana.vatresearch.domain.entities")
@EnableJpaRepositories("com.viana.vatresearch.domain.repositories")
@SpringBootApplication
@EnableFeignClients
public class VatResearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(VatResearchApplication.class, args);
	}

}
