package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		Webtoon a = new Webtoon("쇼미더럭키짱","만신김성모");
		
		a.getInfo();
		
		a.uploadWebtoon();
		a.uploadWebtoon();
		a.uploadWebtoon();
		a.uploadWebtoon();
		a.getInfo();
		a.completeWebtoon();
		a.getInfo();
	}
}