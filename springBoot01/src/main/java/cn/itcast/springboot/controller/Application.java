package cn.itcast.springboot.controller;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}
	
	@GetMapping("/user")
	public String user(){
		return "/html/user.html";
	}
	
	
}
