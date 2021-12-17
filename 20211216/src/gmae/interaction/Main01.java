package gmae.interaction;

public class Main01 {

	public static void main(String[] args) {
		// 전사를 만들어 주세요.
		Warrior w1 = new Warrior();
		// 오크를 만들어 주세요.
		Orc o1 = new Orc();
		// 전사의 huntOrc를 호출해주세요.
		w1.huntOrc(o1);
	}
	/* 프로그램 실행
	 * main지역 생성 후 main:7에 의해 Warrior:10으로 이동
	 * Warrior:10~16 실행 후 main:7의 우변값을 좌변에 대입
	 * main:9에 의해서 Orc:8로 이동
	 * Orc:8~12 실행후 main:9의 우변값을 좌변에 대입
	 * main:11에 의해 Warrior:21로 이동
	 * Warrior:23에 의해 Orc:15로 이동
	 * 
	 */

}
