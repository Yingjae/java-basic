package accessmodifier;

public class MainP197 {

	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 하세요.
		Warrior z = new Warrior("카카로트");
		// hp가 package friendly 일때
		// package가 달라서 hp 변경 불가
		z.hunt();
		z.hunt();
		z.hunt();
	}
}