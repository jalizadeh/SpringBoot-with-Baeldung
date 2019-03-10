package com.jalizadeh.basa.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-test.properties")
public class TestProperties {

	public TestProperties() {
		super();
	}
	
}
