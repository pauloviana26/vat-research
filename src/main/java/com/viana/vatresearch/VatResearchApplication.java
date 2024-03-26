package com.viana.vatresearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VatResearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(VatResearchApplication.class, args);
	}

}
