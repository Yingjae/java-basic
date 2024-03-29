package interaction;

public class Buyer {
	// 구매자는 int money(소지금액), int banana(소지바나나개수)를 멤버변수로 가집니다.
	private int money; // 소지금
	private int banana; // 소지 바나나 갯수
	
	// 생성자에 돈을 받아서 소지 금액을 초기화 해주고 바나나는 0으로 초기화 합니다.
	public Buyer(int money) {
		this.money = money;
		this.banana = 0;
	}
	
	// buyBanana(Seller seller, int banana)를 정의하는데 어떤 상인에게, 몇개를 살지 이며
	public void buyBanana(Seller seller,int banana) {
		// 구매하려는 바나나총액이 내 소지금을 넘어서면 "돈이 모자랍니다." 라고만 알리고 메서드를 중지시킵니다.
		if((banana*2000) > this.money) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
		    return;
		}
		// 판매자의 바나나가 내가 구매하려는 바나나보다 적은 경우도 역시 " 바나나재고가 부족합니다" 라고만 알리고 메서드를 중지시킵니다.
		if(seller.getBanana() < banana) {
			System.out.println("바나나 재고가 부족합니다. 바나나 재고 : " + seller.getBanana());
			return;		
		}
		// 이 모든 경우의 수를 통과한 경우만 망고 구매가 가능합니다.
		
		// 바나나 갯수를 입력 받으면 소지금을 갯수 * 가격 만큼 차감해주고 바나나 갯수는 올라갑니다.
        // 내 금액은 차감되고 바나나가 늘어나는 로직
		this.banana += banana;
		this.money -= banana * 2000;
	    // 이때 seller쪽에서도 sellBanana()가 호출되도록 처리하며
		// seller의 바나나를 차감하고 돈을 올려주는 로직
		seller.sellBanana(banana);		
	}
	
	// showBuyer()를 이용해 소지 바나나, 소지금을 볼 수 있습니다.
	public void showBuyer() {
		System.out.println("------구매자정보------");
		System.out.println("소지중인 바나나 갯수 : " + this.banana + ", 잔여 소지금 : " + this.money);
		System.out.println("----------------------");
	}
}
