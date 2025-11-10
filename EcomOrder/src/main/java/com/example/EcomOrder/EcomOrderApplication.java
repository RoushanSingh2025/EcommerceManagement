package com.example.EcomOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.example.EcomOrder.dao")
public class EcomOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomOrderApplication.class, args);
	}

}
