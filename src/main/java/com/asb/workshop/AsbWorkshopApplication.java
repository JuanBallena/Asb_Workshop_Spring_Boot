package com.asb.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.asb.workshop.repository.CustomRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories (repositoryBaseClass = CustomRepositoryImpl.class)
public class AsbWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsbWorkshopApplication.class, args);
	}

}
