package com.src.docker.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringbootJenkinsApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "Deploy project to Dockerhub via git hub";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootJenkinsApplication.class, args);
	}

}
