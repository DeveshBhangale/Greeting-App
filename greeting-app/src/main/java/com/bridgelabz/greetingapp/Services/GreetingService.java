package com.bridgelabz.greetingapp.Services;

import java.util.ArrayList;
import java.util.List;

public class GreetingService {
    
    public static List<Greeting> list = new ArrayList<Greeting>();

    
    public String addData(Greeting greeting) {
        list.add(greeting);
        return list.toString();
    }

    
    
}
