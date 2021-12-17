package game.polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		Commoner c1 = new Commoner("초보자");
		Monster o1 = new Orc();
		
		c1.hunt(o1);
		c1.hunt(o1);
		

	}

}
