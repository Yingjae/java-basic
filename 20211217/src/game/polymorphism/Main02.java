package game.polymorphism;

public class Main02 {
	public static void main(String[] args) {
		Commoner c2 = new Commoner("전사");
		Monster g1 = new Goblin();
	    Monster k1 = new Kobold();
	    Monster s1 = new Slime();
	    
	    c2.hunt(s1);
	    c2.hunt(s1);
	    c2.hunt(k1);
	    c2.hunt(k1);
	    c2.hunt(g1);
	    c2.hunt(g1);
	}
}
