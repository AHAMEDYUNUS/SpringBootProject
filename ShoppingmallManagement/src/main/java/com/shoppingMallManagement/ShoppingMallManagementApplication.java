package com.shoppingMallManagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@ComponentScan(basePackages = "com.shoppingMallManagement")
public class ShoppingMallManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingMallManagementApplication.class, args);
	}

}
