package structure;

public class Structure02P190 {
	
	// person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 연락처 : " + p.pNum + ", 번호 : " + p.uNum);
	}

	public static void main(String[] args) {
		// 사람을 두명 만들어보세요(a,b)
		
		Person a = new Person();
		
		a.name = "임재원";
		a.age = 20;
		a.pNum = "01066667777";
		a.uNum = 176;
		
		Person b = new Person();
		
		b.name = "김아무개";
		b.age = 22;
		b.pNum = "01066669999";
		b.uNum = 170;
		
		getInfo(a);
		getInfo(b);
	}
}