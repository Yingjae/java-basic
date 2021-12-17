package game.accessmodifier;

public class Main01 {

	public static void main(String[] args) {
		// Magician을 생성해주세요.
		Magician m1 = new Magician("이성민");
		// 교전 전에 getInfo()로
		// 정보부터 조회 해주세요.
		m1.getInfo();
		// hunt()로 사냥해주세요.
		m1.hunt();
		m1.hunt();
		m1.hunt();
		// 사냥이 끝난 후 다시
		// 정보를 조회 해주세요.
		m1.getInfo();
		m1.fireball();
		m1.getInfo();
		m1.heal();
		m1.getInfo();
	}
	/* 프로그램 시작
	 * Main:7 우변 실행
	 * Magician:5로 이동(같이 전달되는 문자열 "이성민")
	 * Magician:6에 의해서 다시 Commoner 생성자 호출("이성민" 전달)
	 * Commoner:15로 이동한 후 21번까지 그대로 실행
	 * Magician:6로 복귀 후 7번라인에 의해서 종료(Main:7번으로 복귀)
	 * Main:7우변의 결과를 좌변에 대입합니다.
	 * Main:10에 의해서 Magician:21로 이동합니다.
	 * Magician:39에 의해서 Commoner:26으로 이동합니다.
	 * Commoner:27에 의해서 hp값(20)을 돌려줄 준비를 합니다.
	 * Commoner:28에 도달 후 Magician:39으로 돌아가되, hp값(20)을 호출위치에 넣습니다.
	 */
}
