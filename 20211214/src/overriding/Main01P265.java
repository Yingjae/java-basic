package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 말과 고래를 생성해보겠습니다.
		Horse h1 = new Horse();
		h1.howl();
		h1.name = "조랑말";
		h1.weight = 350;
		h1.habitat = "초원";
		h1.rank = 1;
		h1.getInfo();
		
		Whale w1 = new Whale();
		w1.howl();
		w1.name = "범고래";
		w1.weight = 180;
		w1.habitat = "바다";
		w1.stapleFood = "해양포유동물";
		w1.getInfo();
	}
}