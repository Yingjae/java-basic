package gmae.interaction;

public class Main03 {

	public static void main(String[] args) {
		Magician m1 = new Magician();
		Orc o1 = new Orc();
		
		m1.huntOrc(o1);
		
		Archer a1 = new Archer();
		Troll t1 = new Troll();
		
		a1.huntTroll(t1);
		a1.huntTroll(t1);
	}

}
