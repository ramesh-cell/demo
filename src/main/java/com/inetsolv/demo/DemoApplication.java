package com.inetsolv.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.inetsolv.demo.repositories")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Spring");
		System.out.println("Hello Spring again");
		System.out.println("Hello Spring 1001 test");
		System.out.println("Hello Spring 1001 test added from git in 1001 branch");
		System.out.println("Hello Spring 1001 test added from Intellij 1001_test branch");
	}

}
