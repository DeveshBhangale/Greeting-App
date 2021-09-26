package com.bridgelabz.greetingapp.controller;

import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.greetingapp.Services.Greeting;
import com.bridgelabz.greetingapp.Services.GreetingService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GreetingController")
public class GreetingController {
    public GreetingService gService = new GreetingService();
    private static int id;

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

    @PostMapping("/addData")
    public String addData(@RequestParam String fName,@RequestParam String lName ){
        id +=1;
        return gService.addData(new Greeting(id, fName, lName));
    }

    @PostMapping("/addfName")
    public String addfName(@RequestParam String fName){
        id +=1;
        return gService.addData(new Greeting(id, fName, ""));
    }
    @PostMapping("/addDatalName")
    public String addDatalName(@RequestParam String lName ){
        id +=1;
        return gService.addData(new Greeting(id, "", lName));
    }

}
