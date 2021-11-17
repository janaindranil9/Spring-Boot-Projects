package com.plural.conference.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@GetMapping("hello")
public String hello(Map<String,Object> model) {
		model.put("name","Hello Indra");
	return "hello";
	
}
}
