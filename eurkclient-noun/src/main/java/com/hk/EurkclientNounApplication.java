package com.hk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurkclientNounApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurkclientNounApplication.class, args);
	}
}
