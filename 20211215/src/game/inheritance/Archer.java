package game.inheritance;

public class Archer extends Commoner {
	
	private int rDam;
	
	public void getInfo() {
		System.out.println("레벨 : " + lv + ", 체력 : " + hp 
		         + ", 마나 : " + mp + ", 원거리데미지 : " + rDam + ", 아이디 : " + id );
	}
	
	public Archer(String name) {
		super(name);
		this.rDam = 10;
	}

}
