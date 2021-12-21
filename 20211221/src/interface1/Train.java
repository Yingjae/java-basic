package interface1;

// Vehicle을 구현하기 위해 implements 를 활용합니다.
public class Train implements Vehicle {
	
	// 속도, 연료량, 기관사명을 선언합니다.
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = MIN_SPD;
		this.gas = MAX_GAS;
		this.name = name;
	}
	
	// 오버라이드 해서 사용해야 하는 구현메서드
	public void accel() {
		if(speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPD) {
			speed = TRAIN_MAX_SPD;
		} else {
			speed += TRAIN_INCREASE_SPD;
		}
		gas -= TRAIN_DECREASE_GAS;
	}
	public void breakSpeed() {
		if(speed - TRAIN_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
		} else {
			speed -= TRAIN_DECREASE_SPD;
		}
	}
	public void reFuel() {
		if(gas + TRAIN_INCREASE_GAS > MAX_GAS) {
			gas = MAX_GAS;
		} else {
			gas += TRAIN_INCREASE_GAS;
		}
	}
	public void showStatus() {
		System.out.println("기관사명 : " + name);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료량 : " + gas);
		System.out.println("-------------------------");
	}
}
