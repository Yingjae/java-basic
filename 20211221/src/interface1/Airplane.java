package interface1;

public class Airplane implements Vehicle {
	
	private int speed;
	private int gas;
	private String name;
	
	public Airplane(String name) {
		this.name = name;
		this.speed = MIN_SPD;
		this.gas = AIRPLANE_MAX_GAS;
	}

	@Override
	public void accel() {
		if(speed + AIRPLANE_INCREASE_SPD > AIRPLANE_MAX_SPD) {
	    	speed = AIRPLANE_MAX_SPD;
		} else {
	        speed += AIRPLANE_INCREASE_SPD;
		}
	    gas -= AIRPLANE_DECREASE_GAS;
	}

	@Override
	public void breakSpeed() {
		if(0 > speed - AIRPLANE_DECREASE_SPD) {
			speed = MIN_SPD;
		} else {
			speed -= AIRPLANE_DECREASE_SPD;
		}
		
	}

	@Override
	public void reFuel() {
		if(gas + AIRPLANE_INCREASE_GAS > AIRPLANE_MAX_GAS) {
			gas = AIRPLANE_MAX_GAS;
		} else {
			gas += AIRPLANE_INCREASE_GAS;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("현재 기장 : " + name);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료량 : " + gas);
		System.out.println("-------------------------");
	}
}
