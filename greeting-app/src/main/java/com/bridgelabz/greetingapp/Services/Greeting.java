package com.bridgelabz.greetingapp.Services;

public class Greeting {
    private int id;
	private String firstName;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMessage() {
		return message;
	}

	public boolean setMessage(String message) {
		this.message = message;
		return true;
	}

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
