package com.SearchFunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.SearchFunction.models")
@EnableJpaRepositories(basePackages = "com.SearchFunction.repository")
public class SearchFunction {

	public static void main(String[] args) {
		SpringApplication.run(SearchFunction.class, args);
	}

}
