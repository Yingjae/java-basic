package overriding;

public class Whale extends Animal {
	
	public String stapleFood;
	
	// 오버라이딩 요건
	// 이름과 같은 리턴자료형 등이
	// 같은 부모쪽 메서드를
	// 중복해서 작성함
	public void howl() {
		System.out.println("끼이이");
	}
	public void getInfo() {
		System.out.println("이름 : " + name + ", 무게 : " + weight 
				+ "kg, 서식지 : " + habitat + ", 주식 : " + stapleFood);
	}
}