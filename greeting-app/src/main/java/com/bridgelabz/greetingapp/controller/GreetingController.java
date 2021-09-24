package com.bridgelabz.greetingapp.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    // private static final String template = "Hello, %s!";
    // private final AtomicLong counter = new AtomicLong();
    @RequestMapping("/jsonObject")
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("foo", "bar");
        map.put("aa", "bb");
        return map;
    }
}
