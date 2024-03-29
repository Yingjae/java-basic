package gmae.interaction;

public class Warrior {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior() {
		this.hp = 20;
		this.mp = 10;
		this.atk = 6;
		this.def = 1;
		this.exp = 0;
	}
	
	// 교전을 할 경우 상호간에 수치값이 교환되어야 합니다.
	// Warrior쪽에서 Orc쪽의 수치를 깎아주고
	// Orc쪽에서 Warrior쪽의 수치를 깎아야 합니다.
	public void huntOrc(Orc orc) {
		// 전사가 오크를 때리기 위해서 먼저 Orc의 doBattle을 호출합니다.
		orc.doBattle(this.atk);
		// 전사도 오크에게 공격을 받습니다.
		this.hp = this.hp + this.def - orc.getAtk();
		System.out.println("교전 결과 전사의 체력 : " + this.hp);
	}
	public void huntTroll(Troll troll) {
		troll.doBattle(this.atk); // 트롤을 전사가 공격하는 로직
		if(troll.getHp() > 0) { // 트롤 체력이 0보다 큰지 검사(0보다 크다면)
		this.hp = this.hp + this.def - troll.getAtk();// 정상 교전 진행
		} else {// 0보다 작거나 같다면
			System.out.println("트롤이 죽어서 교전이 끝났습니다.");// 트롤이 죽었음을 알림
		}
		System.out.println("교전 결과 전사의 체력 : " + this.hp);// 교전 결과 브리핑
	}
	public void huntOgre(Ogre ogre) {
		ogre.doBattle(this.atk); 
		if(ogre.getHp() > 0) { 
			this.hp = this.hp + this.def - ogre.getAtk();
		} else {
			System.out.println("오거가 죽어서 교전이 끝났습니다.");
		}
		System.out.println("교전 결과 전사의 체력 : " + this.hp);
	}
	 
    // getter/setter를 Warrior,Orc에 만들어 주세요.
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