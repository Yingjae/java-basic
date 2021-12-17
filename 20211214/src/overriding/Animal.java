package overriding;

public class Animal {
	
	public String name;
	public int weight;
	public String habitat;
	
	public void howl() {
		System.out.println("동물이 웁니다.");
	}
	public void getInfo() {
		System.out.println("이름 : " + name + ", 무게 : " + weight + "kg, 서식지 : " + habitat);
	}
}