package game;

//Create a fourth class, Game, in the game package. Write a main() method. In its main() method, 
//create two GameObjects that are a Player and an Enemy.  

public class Game {
	
	public static void main(String[] args) {
		GameObject  one = new Player();
		GameObject  two = new Enemy();
		one.update();
		two.update();
		
		
	}

}
