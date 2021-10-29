package com.simplilearn.capestone.Foodbox;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.simplilearn.capestone.Foodbox.Models.RegisterUser;
import com.simplilearn.capestone.Foodbox.Services.RegisterUserService;



@SpringBootApplication
public class FoodboxApplication implements CommandLineRunner {
	
	
	
	@Autowired
	RegisterUserService registerUserService;
	

	public static void main(String[] args) {
		SpringApplication.run(FoodboxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	RegisterUser registerUser = new RegisterUser();

	/*	registerUser.setFirstName("David");
		registerUser.setLastName("Rogers");
		registerUser.setEmail("Admin@foodbox.com");
		registerUser.setRole("Admin");
		registerUser.setPassword("Admin@123");

		registerUserService.saveUser(registerUser);*/
		
	}
	

	
	

}
