package com.requestfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableScheduling
@SpringBootApplication
public class RequestFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestFilterApplication.class, args);
	}
}
