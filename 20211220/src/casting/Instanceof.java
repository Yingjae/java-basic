package casting;

public class Instanceof {

	public static void main(String[] args) {
		// Animal로 Cat을 받아서 생성
		Animal a1 = new Cat("삼색이",2);
		// a변수와 연결된 heap쪽 자료가 Cat인지 확인
		System.out.println(a1 instanceof Cat);
		// a변수와 연결된 heap쪽 자료가 Dog인지 확인
		System.out.println(a1 instanceof Dog);
		// a변수와 연결된 heap쪽 자료가 Animal인지 확인
		System.out.println(a1 instanceof Animal);
	}
}