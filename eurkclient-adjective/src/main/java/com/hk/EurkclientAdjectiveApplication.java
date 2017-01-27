package com.hk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurkclientAdjectiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurkclientAdjectiveApplication.class, args);
	}
}
