package com.getinfy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestcontroller {
	
	@GetMapping("/")
	public String sayHi() {
		
		return "hi GoodMorning..";
	}

}
