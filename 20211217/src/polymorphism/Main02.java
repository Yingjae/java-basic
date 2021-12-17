package polymorphism;

public class Main02 {

	public static void main(String[] args) {
		Person s1 = new Programmer("임재원", 26, 4800);
		Person f1 = new Fitnessman("이성민", 26, 510);
		
		s1.showPerson();
		f1.showPerson();
	}
	

}
