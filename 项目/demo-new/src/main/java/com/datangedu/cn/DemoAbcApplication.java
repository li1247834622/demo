package com.datangedu.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("com.datangedu.cn.*")
public class DemoAbcApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DemoAbcApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoAbcApplication.class);
		
	}

}
