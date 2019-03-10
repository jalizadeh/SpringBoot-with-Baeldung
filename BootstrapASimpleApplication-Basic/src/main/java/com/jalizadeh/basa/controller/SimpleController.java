package com.jalizadeh.basa.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
@PropertySource(ignoreResourceNotFound = true, 
	value = "classpath:configprops.properties")
public class SimpleController {
	@Value("${spring.application.name}")
	String appName;

	@Value("${welcome.message}")
	String welcomeMsg;

	@Value("${welcome.message.fa}")
	String welcomeMsgFa;

	// if `jdbc.url` is not found, it will show `aDefaultUrl`
	@Value("${jdbc.url:aDefaultUrl}")
	String jdbc;

	@Value("${mail.hostname}")
	String mail_hostname;

	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		model.addAttribute("wm", welcomeMsg);
		model.addAttribute("wmfa", welcomeMsgFa);
		model.addAttribute("jdbc", jdbc);
		model.addAttribute("mail_hostname", mail_hostname);
		model.addAttribute("serverTime", new Date());
		return "home";
	}
}
