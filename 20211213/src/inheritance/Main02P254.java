package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 역에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		Salaryman m1 = new Salaryman();
	    m1.name = "임재원";
		m1.age = 26;
		m1.salary = 3800;
		
		m1.getInfo();	
	    m1.getSalarymanInfo();
			
		Student s1 = new Student();
		s1.name = "이성민";
		s1.age = 19;
		s1.stuNum = 20;
		
		s1.getInfo();
		s1.getStudentInfo();
	}
}