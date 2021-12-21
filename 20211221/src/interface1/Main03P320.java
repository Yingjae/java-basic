package interface1;

public class Main03P320 {

	public static void main(String[] args) {
		Vehicle a1 = new Airplane("임재원");
		
		a1.accel();
		a1.accel();
		a1.accel();
		a1.showStatus();
		a1.breakSpeed();
		a1.showStatus();
		a1.reFuel();
		a1.showStatus();
	}
}
