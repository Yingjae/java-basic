package structure;

public class ClassMaino2P196 {

	public static void main(String[] args) {
		
		Car a = new Car();
		
		a.model = "amg 63";
		a.price = 24960;
		a.owner = "이성민";
		
		Car b = new Car();
		
		b.model = "cayenne";
		b.price = 17100;
		b.owner = "임재원";
		
		a.getInfo();
		b.getInfo();
	}
}