package com.rmnprime.cloud.helloserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/hello/server")
public class NewResourceServer {

	@GetMapping
	public String hello() {
		return "Here we get the mapping";
	}
}
