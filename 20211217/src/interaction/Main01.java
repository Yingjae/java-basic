package interaction;

public class Main01 {

	public static void main(String[] args) {
		Seller s1 = new Seller(30,20);
		Buyer b1 = new Buyer(60000);
		
		s1.showSeller();
		b1.showBuyer();
		
		b1.buyBanana(s1, 4);
		b1.buyMango(s1, 6);
		
		s1.showSeller();
		b1.showBuyer();
	}
}