package interaction;

public class Seller {
	private int money;
	private int mango;
	private int banana;
	
	public Seller (int banana, int mango) {
		this.money = 0;
		this.banana = banana;
		this.mango = mango;
	}
	public void sellMango(int mango) {
		if(this.mango < mango) {
			System.out.println("망고가 모자랍니다. 현재 재고 : " + this.mango);
			return;
		}
		this.mango -= mango;
		this.money += banana * 3000; 
	}
	public void sellBanana(int banana) {
		if(this.banana < banana) {
			System.out.println("바나나가 모자랍니다. 현재 재고 : " + this.banana);
			return; 
		}
		this.banana -= banana;
		this.money += banana * 2000;
	}
	public void showSeller() {
		System.out.println("-----------------상인정보-----------------");
		System.out.println("현재 소지금 : " + this.money 
				+ ", 현재 망고 재고 : " + this.mango 
				+ ", 현재 바나나 재고 : " + this.banana);
		System.out.println("----------------------------------------");
	}

	public int getMango() {
		return mango;
	}

	public int getBanana() {
		return banana;
	}
}
