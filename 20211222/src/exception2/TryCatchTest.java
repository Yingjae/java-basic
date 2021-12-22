package exception2;

public class TryCatchTest {

	public static void main(String[] args) {
		
		String[] name = {"김자바", "제이에스피", "박스프링"};
		try {
			// 0, 1, 2번인덱스 까지 가는데 3까지 조회하도록 반복문 작성
			//for(int i = 0; i <4; i++) {
			//	System.out.println(name[i]);
			// }
			for(String n : name) {
				System.out.println(n);
			}
			System.out.println("이상 모든 학생 목록입니다.");
		} catch (Exception e) {
			System.out.println("더 이상 학생이 없는데 초과 인덱스를 조회했습니다.");
		}finally {
			System.out.println("집계가 끝났습니다.");
		}
	}
}
