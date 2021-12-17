package gmae.interaction;

public class Ogre {
	private int hp;
	private int atk;
	private int def;
	
	public Ogre() {
		this.hp = 10;
		this.atk = 3;
		this.def = 0;		
	}
	public void doBattle(int uAtk) {
		hp = (hp + def) - uAtk;
		if(hp <= 0) {
			hp = 0;
			System.out.println("오거가 죽어서 반응하지 않습니다.");
			return;
		}
		System.out.println("오거의 남은 체력 : " + hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

}
