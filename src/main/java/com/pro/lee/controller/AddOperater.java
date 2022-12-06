package com.pro.lee.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddOperater {

	@RequestMapping("/add/{num1}/{num2}/{num3}")
		public int addOperator(@PathVariable int num1, @PathVariable int num2, @PathVariable int num3) {
		return num1 + num2 + num3;
	}
}
