package constructor;

public class Main02P204 {

	public static void main(String[] args) {
		// 성공사례
		BasketballPlayer a = new BasketballPlayer(183, 120); // 키, 점프력 순으로 전달
		
		a.dunkShoot();
		// 실패사례
		BasketballPlayer b = new BasketballPlayer(176, 120); // 키, 점프력 순으로 전달
		
		b.dunkShoot();
	}
}
