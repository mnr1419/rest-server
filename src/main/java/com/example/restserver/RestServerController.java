package com.example.restserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restserver")
public class RestServerController {
	
	@GetMapping("/getMessage")
	public String getMessage(){
		return "Hi, this is from RestServerController";
	}

}
