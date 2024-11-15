package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class UserController {
	
	@GetMapping("/api")
	public String getname() {
		return "i am docker pipeline";
	}

}
