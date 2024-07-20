package com.nit.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping
	public String getWelcome() {
		return "<a href='welcom'><h1 style=color:red;text-align:Center>Hi this is our first demo project</h1></a>";
	}
	
	@GetMapping ("/welcom")public String getHi() {
		return "<a href='./' style=underline:none><h1 style=color:red;text-align:Center>Welcome to Spring boot</h1></a>";
	}

}
