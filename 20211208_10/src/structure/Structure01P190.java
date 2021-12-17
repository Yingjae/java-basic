package structure;
// 현실세계에서 일어나는 사건들을 컴퓨터 내부에서 묘사하기 위해
// 1. 컴퓨터에선 사람의 모든 정보를 저장 할 수 없기 때문에
// 식별성 여부를 따져서 일부를 저장하게됨 

public class Structure01P190 {

	public static void main(String[] args) { // 실행부
		// 이제부터는 실행코드와 정의 코드를 분리합니다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른 .java파일에 저장합니다.
		
		// *커스텀디자인 자료형+은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		Person p1 = new Person();
     // 자료형  변수 = new 자료형 (); 
		// Scanner scan = new Scanner(System.in);
		// 과 유사함
		// p1 내부에 정의한 변수를
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name = "임재원";
		System.out.println(p1.name);
		p1.age = 26;
		System.out.println(p1.age);
		p1.pNum = "01067779004";
		System.out.println(p1.pNum);
		p1.uNum = 183;
		System.out.println(p1.uNum);
		
		// 또 다른 사람을 하나 만들어 봅니다.
		Person p2 = new Person();
		// p2에도 name, age, pNum, uNum을 부여해서
		// 콘솔에 찍어주세요.
		p2.name = "잉재";
		System.out.println(p2.name);
		p2.age = 26;
		System.out.println(p2.age);
		p2.pNum = "01066669004";
		System.out.println(p2.pNum);
		p2.uNum = 381;
		System.out.println(p2.uNum);		
		
		Person p3 = new Person();
		
		p3.name = "이성민";
		System.out.println(p3.name);
		p3.age = 26;
		System.out.println(p3.age);
		p3.pNum = "01062229888";
		System.out.println(p3.pNum);
		p3.uNum = 176;
		System.out.println(p3.uNum);
		
		System.out.println(p1.name + "의 정보입니다.");
		System.out.println("이름 : " + p1.name + ", 나이 : " + p1.age + ", 연락처 : " + p1.pNum + ", 번호 : " + p1.uNum);
		System.out.println(p3.name + "의 정보입니다.");
		System.out.println("이름 : " + p3.name + ", 나이 : " + p3.age + ", 연락처 : " + p3.pNum + ", 번호 : " + p3.uNum);
	}
}
