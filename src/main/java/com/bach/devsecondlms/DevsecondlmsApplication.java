package com.bach.devsecondlms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// exclude 구문 시큐리티 사용시 삭제
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DevsecondlmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevsecondlmsApplication.class, args);
	}
}
