package com.jalizadeh.basa.error;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class MyCustomErrorController implements ErrorController {
	  
    private static final String PATH = "/error";
     
    @GetMapping(value=PATH)
    public String error() {
        return "Error haven";
    }
 
    @Override
    public String getErrorPath() {
        return PATH;
    }
    
    @GetMapping("/errorHaven")
    String errorHeaven() {
        return "You have reached the haven of errors!!!";
    }
}
