package gmae.interaction;

public class Main02 {

	public static void main(String[] args) {
		Warrior w2 = new Warrior();
		Troll t1 = new Troll();
		w2.huntTroll(t1);
		w2.huntTroll(t1);
		w2.huntTroll(t1);
	}
	/* 프로그램 시작
	 * main지역 생성후 main:6의 우변에 의해 warrior:10으로 이동
	 * (Warrior 형식을 힙에 작성한 후)
	 * Warrior:10~16 실행 후 main:6으로 복귀한 뒤 좌변에 대입
	 * main:7의 우변에 의해 Troll:8로 이동
	 * (Troll 형식을 힙에 작성한 후)
	 * Troll:8~12 실행 후 main:7로 복귀한 뒤 좌변에 대입
	 * main:8에 의해 Warrior:29로 이동(200번지 같이 전송)
	 * Warrior:28에 의해 Troll:13로 이동(정수 4 같이 전송)
	 * Troll:13~16 실행 후 Warrior:28으로 복귀
	 * Warrior:30에 의해서 체력 18로 갱신
	 * Warrior:32 도달 후 main:8로 복귀
	 */
}
