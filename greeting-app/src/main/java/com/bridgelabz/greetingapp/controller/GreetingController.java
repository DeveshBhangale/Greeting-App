package com.bridgelabz.greetingapp.controller;

import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.greetingapp.Services.Greeting;
import com.bridgelabz.greetingapp.Services.GreetingService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    public GreetingService gService = new GreetingService();
    private static int id;

    
    @RequestMapping("/jsonObject")
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("foo", "bar");
        map.put("aa", "bb");
        return map;
    }

    @RequestMapping("/hello")
	public String home(@RequestParam String name) {
		return "Hello "+name;
	}

    @PostMapping("/addData")
    public String addData(@RequestParam String fName,@RequestParam String lName,@RequestParam String message){
        id +=1;
        return gService.addData(new Greeting(id, fName, lName,message));
    }

    @PostMapping("/addfName")
    public String addfName(@RequestParam String fName,@RequestParam String message){
        id +=1;
        return gService.addData(new Greeting(id, fName, "",message));
    }
    @PostMapping("/addDatalName")
    public String addDatalName(@RequestParam String lName,@RequestParam String message){
        id +=1;
        return gService.addData(new Greeting(id, "", lName,message));
    }

    @GetMapping("/msgbyID")
    public String greetingMessageByID(@RequestParam int id){     
        return gService.greetingMessageByID(id);
    }

    @GetMapping("/getData")
    public String getData(){
        return GreetingService.list.toString();
    }

    @PutMapping("/setMessage")
    public String editMessageByid(@RequestParam int id,@RequestParam String message){
        return gService.editMessageByid(id,message);
    }

    @DeleteMapping("/deleteData")
    public String deleteData(@RequestParam int id){
        return gService.deleteData(id);
    }
}
