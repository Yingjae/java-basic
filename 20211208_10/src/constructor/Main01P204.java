package constructor;

public class Main01P204 {

	public static void main(String[] args) {
		
		Car a = new Car(100, 0, "임재원");
		// 생성자로 gas, speed, owner를 처리
		// a.gas = 100;
		// a.speed = 0;
		// a.owner = "임재원";
		
		// 차를 뽑자마자 먼저 상태 확인
		a.getInfo();
		// 엑셀을 두 번 밟아주세요
		a.accelSpeed();
		a.accelSpeed();
		// 상태 다시 확인
	    a.getInfo();
	    // 브레이크를 밟아주세요
	    a.breakspeed();
	    // 상태 다시 확인
	    a.putGas();
	    a.getInfo();
	}
}