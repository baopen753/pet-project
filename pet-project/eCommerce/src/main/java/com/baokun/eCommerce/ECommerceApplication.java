package com.baokun.eCommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ECommerceApplication.class, args);
	}

	public CommandLineRunner commandLineRunner(String agrs)
	{
		return runner -> {
			System.out.println("hello");
		};
	}


}
