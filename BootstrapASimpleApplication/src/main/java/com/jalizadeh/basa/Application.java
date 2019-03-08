package com.jalizadeh.basa;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.jalizadeh.basa.persistance.repository")
@EntityScan("com.jalizadeh.basa.persistance.entity")
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
	    System.setProperty("server.servlet.context-path", "/javad");
		
		//and the class 'com.jalizadeh.basa.configuration.ServerPortCustomizer'
		//has precedence over the 'application.properties'
		SpringApplication app = new SpringApplication(Application.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        app.run(args);
	}

}
