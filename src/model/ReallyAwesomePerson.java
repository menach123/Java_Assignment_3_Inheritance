package model;

//Create a class named ReallyAwesomePerson that extends AwesomePerson. 
//Overload the inherited talk() method to print a statement of your choice. 
//Update the constructors of Person, AwesomePerson and ReallyAwesomePerson to print a message of your choice.  
//
//Update the Application class from the above assignment to instantiate a ReallyAwesomePerson and run its talk() method that you overloaded.  
// 
//Notice the order of the constructors executed when you run the application. 
// 
//ReallyAwesomePerson.java should be in the package, model.

public class ReallyAwesomePerson extends AwesomePerson{
	
	public ReallyAwesomePerson() {
		System.out.println("Really Awesome Person");
	}
	
	public void talk(String message) { 
		System.out.println(message);
	}

}
