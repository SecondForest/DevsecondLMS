package com.bach.devsecondlms;

import com.bach.devsecondlms.global.config.CorsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

// exclude 부분은 security 적용시 삭제
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan("com.bach.devsecondlms")
@Import(CorsConfig.class)
public class DevsecondlmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevsecondlmsApplication.class, args);
	}
}
