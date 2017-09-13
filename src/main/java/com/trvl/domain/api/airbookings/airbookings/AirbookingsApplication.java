package com.trvl.domain.api.airbookings.airbookings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//ComponentScan("com.trvl.domain.api.airbookings.airbookings")
@EntityScan(basePackages = {"com.trvl.domain.api.airbookings.airbookings.domains"} ) //This is required when entity and repo are in different packages
@EnableJpaRepositories(basePackages = {"com.trvl.domain.api.airbookings.airbookings.repositories"})
public class AirbookingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirbookingsApplication.class, args);
	}
}
