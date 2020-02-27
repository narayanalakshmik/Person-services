package com.anirban.product.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/wish")
	public String wish() {
		
		return "Hello, welcome to sping boot API";
	}
}
