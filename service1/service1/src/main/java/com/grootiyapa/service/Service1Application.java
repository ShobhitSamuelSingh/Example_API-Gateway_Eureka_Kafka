package com.grootiyapa.service;

import com.grootiyapa.service.entity.UserData;
import com.grootiyapa.service.service.ProducerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}

	@Bean
	CommandLineRunner runner (ProducerService service) {
		return args -> {
			UserData user = new UserData();
			user.setUserId(101);
			user.setUsername("sss");
			service.sendUserData(user);
		};
	}

}
