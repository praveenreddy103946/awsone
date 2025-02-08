package com.pwc_interview.awsone;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("aws")
@Slf4j
public class AwsoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsoneApplication.class, args);
	}


	@GetMapping("/prawin")
	public String testaws(){
		System.out.println("Inside test aws method latest");
		log.info("checking logs for path /prawin latest");
		return "application successfully deployed to aws latest";


	}

}
