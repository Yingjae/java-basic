package gmae.interaction;

public class Troll {
	private int hp;
	private int atk;
	private int def;
	
	public Troll() {
		this.hp = 7;
		this.atk = 3;
		this.def = 1;
	}
	public void doBattle(int uAtk) {
		hp = (hp + def) - uAtk;
		if(hp <= 0) {// 전사의 공격 결과 트롤이 죽었다면 (체력이 0 이하라면)
			hp = 0;// 필수는 아니고, 죽은 몬스터 체력을 0으로 보정
			System.out.println("트롤이 죽어서 반응하지 않습니다.");
			return; // 메서드를 여기서 종료합니다.
		}
		System.out.println("트롤의 남은 체력 : " + hp); // 트롤이 안 죽어야 실행
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