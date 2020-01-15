package com.soretrak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SoretrakApplication {

	
	@RequestMapping("/")
	String home() {
		return ("Hello Fakhri, This is spring Boot app &&&");
	}
	
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(SoretrakApplication.class, args);
    }

}
