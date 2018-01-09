package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController("/users")
public class UsersDemoCmdApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersDemoCmdApplication.class, args);
	}

    @RequestMapping
    public String e() {
	    return "cmd";
    }
}
