package gmae.interaction;

public class Main04 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		
		Archer a1 = new Archer();
		
		Magician m1 = new Magician();
		
		Ogre o1 = new Ogre();
		Ogre o2 = new Ogre();
		Ogre o3 = new Ogre();
		
		w1.huntOgre(o1);
		w1.huntOgre(o1);
		
		a1.huntOgre(o2);
		a1.huntOgre(o2);
		
		m1.huntOgre(o3);
		

	}

}
