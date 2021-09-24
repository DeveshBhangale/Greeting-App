package com.bridgelabz.greetingapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GreetingController")
public class GreetingController {
    
    @GetMapping("/jsonObject")
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("foo", "foo");
        map.put("aa", "basdb");
        return map;
    }

    @RequestMapping("/hello")
	public String home(@RequestParam String name) {
		return "Hello "+name;
	}

}
