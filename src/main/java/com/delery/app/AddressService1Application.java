package com.delery.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;
@SpringBootApplication
@ComponentScan({"com.delery.controller", "com.delery.service"})
@EntityScan("com.delery.entity")
@EnableJpaRepositories("com.delery.repository")
public class AddressService1Application {
	
	@Value("${address.service.url}")
	private String addressServiceUrl;

	public static void main(String[] args) {
		SpringApplication.run(AddressService1Application.class, args);
	}

    @Bean
    WebClient webClient() {
        final WebClient webClient = WebClient.builder().baseUrl(addressServiceUrl)
                .build();
        return webClient;

    }
}
