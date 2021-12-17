package overriding;

public class Horse extends Animal {
	
	public int rank;
	
	public void howl() {
		System.out.println("히히힝");
	}
	public void getInfo() {
		System.out.println("이름 : " + name + ", 무게 : " + weight 
				+ "kg, 서식지 : " + habitat + ", 등급 : " + rank + "등급");
	}
}