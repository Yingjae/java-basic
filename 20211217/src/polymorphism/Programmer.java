package polymorphism;

public class Programmer extends Person {
	private int money;
	
	public Programmer(String name, int age, int money) {
		super(name, age);
		this.money = money;
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("프로그래머의 연봉 :" + money);
	}

}
