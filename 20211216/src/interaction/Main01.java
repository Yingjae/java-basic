package interaction;

public class Main01 {

	public static void main(String[] args) {
		// 판매자 생성
		Seller s1 = new Seller(30); // 상인1
		Seller s2 = new Seller(5); // 상인2
		// 구매자 생성
		Buyer b1 = new Buyer(50000); // 구매자1
		
		s1.showSeller(); // 상인1 정보
		s2.showSeller(); // 상인2 정보
		b1.showBuyer(); // 구매자정보
		
		System.out.println("============s2에게구매============");
		// 구매자가 상인2를 좋아합니다. 그래서 상인2한테 사러갑니다.
		b1.buyBanana(s2, 5);
		
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
		b1.buyBanana(s2, 10); // 재고없음
		System.out.println("============s1에게구매============");
		b1.buyBanana(s1, 10);
		s1.showSeller();
		s2.showSeller();		
		b1.showBuyer();
	}
}
// 프로그램 시작(스택에 메인생성)
// main:7 우변에 의해 Seller:9로 이동 (정수 30 전달)(힙에 정보 입력)
// Seller:9~12 실행 후 main:7로 돌아가서 좌변 s1에 대입(힙 정보를 스택 메인 s1에 대입)
// main:8 우변에 의해 Seller:9로 이동 (정수 5 전달)(힙에 정보 입력) 
// Seller:9~12 실행 후 main:8로 돌아가서 좌변 s2에 대입(힙 정보를 스택 메인 s2에 대입)
// main:10 우변에 의해 Buyer:9로 이동(정수 50000 전달)(힙에 정보 입력)
// Buyer:9~12 실행 후 main:10으로 돌아가서 좌변 b1에 대입(힙 정보를 스택 메인 b1에 대입)
// main:12에 의해서 Seller:27로 이동해서 Seller:27~31 실행 후 main:12로 복귀
// main:13에 의해서 Seller:27로 이동해서 Seller:27~31 실행 후 main:13으로 복귀
// main:14에 의해서 Buyer:38로 이동해서 Buyer:38~42 실행 후 main:14로 복귀
// main:16에 의해서 콘솔창에 구매 안내
// main:18에 의해서 Buyer:15번으로 이동(Seller s2, 정수를 5 전달)
// Buyer:34에 의해서 Seller:15번으로 이동(정수 5 전달)
// Seller:24를 만나서 Buyer:34로 복귀
// Buyer:34를 만나서 main:18로 복귀
// main:20에 의해서 Seller:27로 이동해서 Seller:27~31 실행 콘솔창에 안내
// 바나나 갯수 감소와 금액증가 확인
// main:22에 의해서 Buyer:38로 이동해서 Buyer:38~42 실행 후 콘솔창에 안내
// 바나나 갯수 증가와 소지금액 감소 확인