package model;

public class AwesomePerson extends Person {
	//Create another class named AwesomePerson that extends Person. 
	//AwesomePerson should declare a method talk() that prints its name and age properties. 
	//AwesomePerson should also have its own default, no-arg constructor. 
	
	public AwesomePerson() {
		this.age = 21;
		this.name = "Bob";
	}
	
	public void talk() {
		System.out.println("Name: "+ this.name+ " Age: "+ this.age );
	}
}
