package com.markey.markeyauth.markeyauth_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages ="com.markey.markeyauth.domain")
@ComponentScan(basePackages={"com.markey.markeyauth.controller",
		"com.markey.markeyauth.service.impl"})
@EnableJpaRepositories(basePackages="com.markey.markeyauth.repository")
public class MarkeyauthSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarkeyauthSpringbootApplication.class, args);
	}
}
