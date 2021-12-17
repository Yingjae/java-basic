package game.inheritance;

public class Magician extends Commoner {
	
	private int mDam;
	
	public void getInfo() {
		System.out.println("레벨 : " + lv + ", 체력 : " + hp + ", 마나 : " + mp + ", 마법데미지 : " + mDam + ", 아이디 : " + id );
	}
		public Magician(String name) {
		super(name);
		this.mDam = 10;
	}
		// 프로그램 시작 -> Main:6의 우변 실행에 따른 이동 ->
		// Magician:7로 이동한 후 name에 변수를 받음
		// Magician:8에서 name과 함께 이동
		// Commoner:12가 변수를 받아 내부 초기화 후 18번 라인 도달
		// Magician:8로 복귀후 진행완료 확인 후 9번 라인으로 mDam에 변수대입
		// Magician:10 도달 후 main:6의 우변으로 돌아갑니다.
		// main:6의 좌변인 m1 변수에 생성한 자료의 주소값을 대입합니다.
		// main:7로 넘어가서 m1의 getInfo()를 호출하면
		// Magician:12로 넘어가고, 13번 라인에 의해 자료 호출 후
		// Main:7로 넘어온 뒤 Magician 관련 코드는 종료됩니다.
}