package com.pro.jung;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@RequestMapping(value="/", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String index() {
		return "Hello World";
	}

}
