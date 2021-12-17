package game.accessmodifier;

public class Warrior extends Commoner {
	
	public Warrior(String name) {
		super(name);
	}
	
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp()-2);
		setExp(getExp()+10);
	}
	
	public void doubleAttack() {
		System.out.println("전사가 더블어택을 시전합니다.");
		setHp(getHp()-4);
		// hp값 조정(기존 hp값-4)
		setExp(getExp()+25);
		// 경험치값 조정(기존 경험치값+25)
	}

    public void getInfo() {
	    System.out.println("현재 체력 : " + getHp());
	    System.out.println("현재 마나 : " + getMp());
	    System.out.println("현재 레벨 : " + getLv());
	    System.out.println("현재 경험치 : " + getExp());
	    System.out.println("현재 유저명 : " + getName());
    }
}
