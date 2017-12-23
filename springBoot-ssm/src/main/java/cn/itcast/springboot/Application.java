package cn.itcast.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.itcast.springboot.service.NoticeService;

@SpringBootApplication
public class Application {
	
	@Autowired
	private NoticeService noticeService;
	
	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
		
	}
	
}
