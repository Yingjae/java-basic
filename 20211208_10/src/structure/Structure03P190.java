package structure;

public class Structure03P190 { // cat의 실행부
	
	public static void getInfo(Cat c) {
		System.out.println(c.name + " 의 정보입니다.");
		System.out.println("이름 : " + c.name + ", 나이 : " + c.age + ", 몸무게 : " + c.weight + "kg");
	}

	public static void main(String[] args) {
		
		Cat a = new Cat();
		
		a.name = "삼색이";
		a.age = 2;
		a.weight = 3;
		
		Cat b = new Cat();
		
		b.name = "나비";
		b.age = 4;
		b.weight = 4;
		
		getInfo(a);
		getInfo(b);
	}
}