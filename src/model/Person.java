package model;

//Write a class named Person that declares instance variables name (String) and age(int); 
//they should be marked protected. Create a default no-arg constructor for Person. 
//Create another class named AwesomePerson that extends Person. 
//AwesomePerson should declare a method talk() that prints its name and age properties. 
//AwesomePerson should also have its own default, no-arg constructor. 

public class Person {
	
	protected String name;
	
	protected int age;
	
	public Person() {
		System.out.println("This is a person...");
	}

}


