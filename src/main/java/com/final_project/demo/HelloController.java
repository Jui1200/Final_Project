package com.final_project.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.final_project.model.Fund;

@RestController
public class HelloController {
	@RequestMapping(value = "/")
	public String spring() {
		return "Spring Boot!!";
	}
	
	@RequestMapping(value = "/hello")
	public String hello() {
		return "Hello World!!";
	}
	
	@RequestMapping(value = "/json")
	public Fund id() {
		Fund fund = new Fund();
		fund.setFundID(12);
		return fund;
	}
}