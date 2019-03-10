package com.jalizadeh.basa.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
 
@Component
@Endpoint(id = "javad", enableByDefault = true)
public class MyCustomEndpoint {
     
    @ReadOperation
    public String json() {
        return "{"
        		+ "\"status\" : \"Javad is brilliant\""
        		+ ","
        		+ "\"name\"   : \"Javad Alizadeh\""
        		+ "}";
    }
}