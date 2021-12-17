package structure;
/* Car.java를 만들어주세요.
 * 
   Car는 내부요소로
   변수는 model(모델명),price(가격),owner(주인)을 가집니다.
   
   그리고 메서드는 getInfo()를 가져서
   위 정보를 콘솔창에 "ㅇㅇㅇ의 차 정보입니다."
   "모델명 : ㅇㅇㅇ, 가격 : ㅇㅇㅇ " 라고 출력합니다.
   
   그리고 ClassMain02P196.java를 실행부로 해서
   차 2대 생성 후 정보를 콘솔에 찍는 코드를 만들고
   main 지역이 사라지기 직전 메모리 구조를 그림으로 그려서 제출해주세요.
 */
public class Car {
	// 멤버 변수
	// 멤버 변수는 어떤 특정한 사물이나 객체의 "정보 혹은 상태"를 나타냅니다.
	public String model;
	public int price;
	public String owner;
	
	// 멤버 메서드 어떤 특정한 사물이나 객체의 "동작"을 나타냅니다.
	public void getInfo() {
		System.out.println(owner + "의 차 정보입니다.");
		System.out.println("모델명 : " + model +
				           ", 가격 : " + price + " 만원");
		System.out.println("================================");
	}
}