package interaction;

public class Seller {
	// 변수로 int money(매출), int banana(재고)를 가집니다.
	private int money; // 매출금액 
	private int banana; // 재고(개수)
	
	// 생성자에서 money는 초기값은 0이고, banana는 입력받도록 해주세요
	public Seller(int banana) {
		this.money = 0;
		this.banana = banana;
	}
	
	// sellBanana(int banana)를 이용해서 바나나개수를 입력받으면(doBattle과 유사)
	public void sellBanana(int banana){
		// 바나나가 모자라면 "바나나가 모자랍니다." 라고 하고 메서드를 종료합니다.
		if(this.banana < banana) {
			System.out.println("바나나가 모자랍니다. 현재 재고 : " + this.banana);
			return; //메서드 강제종료 구문
		}
		// 자신의 this.banana는 갯수만큼 차감하고, this.money는 바나나갯수 * 가격 만큼 증가합니다.
		this.banana -= banana;
		this.money += banana * 2000; 
	}
	
	// showSeller()를 이용해 현재 소지금, 바나나 갯수를 볼 수 있습니다.
	public void showSeller() {
		System.out.println("-------상인정보-------");
		System.out.println("현재 소지금 : " + this.money + ", 현재 바나나 재고 : " + this.banana);
		System.out.println("--------------------");
	}
	public int getBanana() {
		return banana;
	}
}
