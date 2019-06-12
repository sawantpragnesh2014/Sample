package com.spring.two;

public class Reservation {
	private String firstName;  
    private String lastName; 
    private String gender;
    private String[] meal;
    private String goingTo;  
    public String getGoingTo() {
		return goingTo;
	}
	public void setGoingTo(String goingTo) {
		this.goingTo = goingTo;
	}
	public String[] getMeal() {
		return meal;
	}
	public void setMeal(String[] meal) {
		this.meal = meal;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Reservation()  
    {         
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

}
