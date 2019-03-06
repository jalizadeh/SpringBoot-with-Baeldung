package com.jalizadeh.basa.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
	@Value("${spring.application.name}")
	String appName;
	
	@Value("${welcome.message}")
	String welcomeMsg;
	
	@Value("${welcome.message.fa}")
	String welcomeMsgFa;
	
	@GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("wm", welcomeMsg);
        model.addAttribute("wmfa", welcomeMsgFa);
        model.addAttribute("serverTime", new Date());
        return "home";
    }
}
