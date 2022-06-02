package com.letscode.santander.ecommercemandioca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MandiocaUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MandiocaUsersApplication.class, args);
		System.out.println("\n\nMandiocaUsers rodando!!!\n\n");
	}

}
