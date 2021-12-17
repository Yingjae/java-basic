package game.inheritance;

public class Main02 {

	public static void main(String[] args) {
		// Warrior 생성을 하나 해주세요.
		Warrior w1 = new Warrior("이전사");
		             // 생성자는 객체 생성시 한번만 생성
		// 정보 조회를 해보시고, 호출 순번도 고려 해보세요.
		w1.getInfo();
		// Main -> Warrior -> Commoner -> Warrior -> Main 순으로 코드 호출
		

	}

}
