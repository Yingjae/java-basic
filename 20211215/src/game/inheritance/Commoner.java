package game.inheritance;

 public class Commoner {
     
	 // 레벨, 체력, 아이디, 마나
	 protected int lv;
     protected int hp;
     protected String id;
     protected int mp;
     
     // 생성자는 레벨1, 체력 20, 마나10을 기본으로, 아이디는 입력받아 처리
     public Commoner(String id) {
         // 생성자 내부에서 멤버변수를 초기화할때는 this.을 붙이는 경우가 많습니다.
         this.id = id;
         this.hp = 20;
         this.lv = 1;
         this.mp = 10;
     }
     
     public void getInfo() {
         System.out.println("레벨 : " + lv + ", 체력 : " + hp 
		         + ", 마나 : " + mp + ", 아이디 : " + id);
     }
}