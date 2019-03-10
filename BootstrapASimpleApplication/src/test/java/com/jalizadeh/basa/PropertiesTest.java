package com.jalizadeh.basa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.web.server.LocalManagementPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.jalizadeh.basa.properties.TestProperties;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { TestProperties.class }, 
	loader = AnnotationConfigContextLoader.class)
public class PropertiesTest {

	/*
	@LocalServerPort
	int serverPort;
	
	@Value("${port}")
	int port;

	@LocalManagementPort
	int managementPort;
	
	@Test
	public void test() {
		System.out.println(serverPort + " - " + managementPort + port);
	}
	*/
	
	@Autowired
    private Environment env;

    @Value("${my.name}")
    private String injectedProperty;

    @Test
    public final void givenContextIsInitialized_thenNoException() {
        System.err.println("in test via @Value: " + injectedProperty);
        System.err.println("in test Environment: " + env.getProperty("my.name"));
}

}
