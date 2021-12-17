package interaction;

public class Buyer {
	private int money;
	private int mango;
	private int banana;
	
	// 생성자에 돈을 받아서 소지 금액을 초기화 해주고 바나나는 0으로 초기화 합니다.
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.banana = 0;
	}
	public void buyMango(Seller seller,int mango) {
		if((mango*3000) > this.money) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
			return;
		}
		if(seller.getMango() < mango) {
			System.out.println("망고 재고가 부족합니다. 망고 재고 : " + seller.getMango());
			return;
		}
		this.mango += mango;
		this.money -= mango * 3000;
		
		seller.sellMango(mango);
	}
	
	public void buyBanana(Seller seller,int banana) {
		if((banana*2000) > this.money) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
		    return;
		}
		if(seller.getBanana() < banana) {
			System.out.println("바나나 재고가 부족합니다. 바나나 재고 : " + seller.getBanana());
			return;		
		}
		this.banana += banana;
		this.money -= banana * 2000;

		seller.sellBanana(banana);		
	}
	public void showBuyer() {
		System.out.println("---------------구매자정보---------------");
		System.out.println("소지중인 망고 갯수 : " + this.mango + ", 소지중인 바나나 갯수 : " + this.banana + ", 잔여 소지금 : " + this.money);
		System.out.println("--------------------------------------");
	}
}