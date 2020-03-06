package org.algoritmed.jast001algoritmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:config-app-spring.xml")
public class Jast001algoritmedApplication {

	public static void main(String[] args) {
		SpringApplication.run(Jast001algoritmedApplication.class, args);
	}

}
