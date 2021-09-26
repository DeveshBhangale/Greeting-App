package com.bridgelabz.greetingapp.Services;

import java.util.ArrayList;
import java.util.List;

public class GreetingService {    
    public static List<Greeting> list = new ArrayList<Greeting>();

    public String addData(Greeting greeting) {
        list.add(greeting);
        return list.toString();
    }

    public String greetingMessageByID(int id) {
        return list.get(id-1).getMessage();
    }

    public String editMessageByid(int id, String message) {
        if(list.get(id-1).setMessage(message))return "Success";
        return "Failed";
    }

    
    
}
