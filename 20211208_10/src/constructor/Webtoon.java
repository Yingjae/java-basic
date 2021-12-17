package constructor;

public class Webtoon { 
	
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	// 생성자
	public Webtoon(String n, String p) {
		name = n;
		series = 1; // 웹툰의 첫 화는 1회차부터
		painter = p;
		complete = false; // 연재작은 처음에는 미완결 상태임
	}
	
	// 클래스 내부에서 메서드 만드는 방법
	// public 리턴자료형(int, void등) 메서드명(요구할 자료들...){
	    // 실행항 내용들...;
	// }
	public void getInfo() {
		System.out.println("제목 : " + name + ", 회차 : " + series 
		                 + ", 작가 : " + painter + ", 완결여부 : " + complete);	
	}
	public void uploadWebtoon() {
		// 회차가 진행될 때 마다 series를 1씩 올려줍니다.
		series += 1;
	}
    public void completeWebtoon() {
    	complete = true;
    }
}
