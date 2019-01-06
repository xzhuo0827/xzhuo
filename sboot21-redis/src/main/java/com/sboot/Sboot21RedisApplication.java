package com.sboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Sboot21RedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sboot21RedisApplication.class, args);
	}

}

