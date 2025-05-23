package com.jdbcproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class JdbcSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcSpringBootApplication.class, args);
		//System.out.println("Spring Boot Started..!");
	}

}
