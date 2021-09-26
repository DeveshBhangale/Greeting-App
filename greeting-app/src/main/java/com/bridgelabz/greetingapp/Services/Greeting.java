package com.bridgelabz.greetingapp.Services;

public class Greeting {
    private int id;
	private String firstName;
	private String lastName;
	private String message;
	
	public Greeting(int id,String firstName, String lastName,String message) {
        this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Greetings [id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", message = "+this.message+"]\n";
	}


  

    

    
    
    
    

}
