package inheritance;

// Person을 상속해서 Salaryman을 만들어보세요.
// Salaryman은 연봉(salary)를 가집니다.
// getSalarymanInfo()로 상태를 조회할 수 있습니다.
public class Salaryman extends Person {
	
	public int salary;
	
	public void getSalarymanInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 연봉 : " + salary);
	}
}