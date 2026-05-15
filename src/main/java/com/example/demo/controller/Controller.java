package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Controller {

	  @GetMapping
	  public String m1() {
		  return "hello welcome to controller git practice";
	  }
	  
	  @GetMapping
	  public String m2() {
		  return "hello welcome to controller m2 git practice welcome m22";
	  }

	  @GetMapping
	  public String m3() {
		  return "hello welcome to controller m2 git practice welcome m33 added devloper 2";
	  }

       @GetMapping
	  public String m4() {
		  return "hello welcome to controller m2 git practice welcome m33 added devloper 1";
	  }
}
