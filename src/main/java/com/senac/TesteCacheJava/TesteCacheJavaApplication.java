package com.senac.TesteCacheJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class TesteCacheJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteCacheJavaApplication.class, args);
	}

}
