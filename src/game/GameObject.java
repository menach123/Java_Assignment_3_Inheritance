package game;
//Create a class named GameObject that declares an update() 
//method with a void return type. Place this in a new package
//called, game. Create two other classes, Player and Enemy that
//both extend GameObject. Place them in the same package as 
//GameObject. Override the update() method for both Player 
//and Enemy to do print a message of your choice. 

public class GameObject {
	
	public void update() {
		System.out.println("This is a update ...");
	}

}
