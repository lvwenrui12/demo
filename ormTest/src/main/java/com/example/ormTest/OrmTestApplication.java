package com.example.ormTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class OrmTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmTestApplication.class, args);
	}

}
