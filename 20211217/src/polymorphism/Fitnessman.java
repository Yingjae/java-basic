package polymorphism;

public class Fitnessman extends Person {
	private int kg;
	
	public Fitnessman(String name, int age, int kg) {
		super(name,age);
		this.kg = kg;
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("운동선수의 3대 중량 : " + kg);
	}

}
