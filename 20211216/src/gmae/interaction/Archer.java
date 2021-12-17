package gmae.interaction;

public class Archer {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	public Archer() {
		this.hp = 15;
		this.mp = 15;
		this.atk = 7;
		this.def = 1;
		this.exp = 0;
	}
	public void huntOrc(Orc orc) {
		orc.doBattle(this.atk);
		if(orc.getHp() > 0) {
		this.hp = this.hp + this.def - orc.getAtk();
		} else {
		System.out.println("오크가 죽어서 교전이 끝났습니다.");
		}
		System.out.println("교전 결과 궁수의 체력 : " + this.hp);
	}
	public void huntTroll(Troll troll) {
		troll.doBattle(this.atk); 
		if(troll.getHp() > 0) { 
		this.hp = this.hp + this.def - troll.getAtk();
		} else {
			System.out.println("트롤이 죽어서 교전이 끝났습니다.");
		}
		System.out.println("교전 결과 궁수의 체력 : " + this.hp);
	}
	public void huntOgre(Ogre ogre) {
		ogre.doBattle(this.atk); 
		if(ogre.getHp() > 0) { 
			this.hp = this.hp + this.def - ogre.getAtk();
		} else {
			System.out.println("오거가 죽어서 교전이 끝났습니다.");
		}
		System.out.println("교전 결과 궁수의 체력 : " + this.hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}