package com.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	@GetMapping(path = "/getMsg")
	public String getOutput() {
		return "Hello sujananthini";
	}

}
