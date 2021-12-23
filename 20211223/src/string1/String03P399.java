package string1;

import java.util.Scanner;

public class String03P399 {

	public static void main(String[] args) {
		// Scanner를 통해서 전체 문장을 입력받으세요.
		// 다음으로 문장내에서 찾고싶은 단어를 추가로 입력 받으세요
		// 문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출 되었는지
		// 출력해주는 코드를 작성해 보세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전체 문장을 입력해주세요.");
		String sentence = scan.nextLine();
		
		System.out.println("문장 내에서 카운팅 할 단어를 입력 해주세요.");
		String searchVoca = scan.nextLine();
		
		// 갯수 카운팅
		int count = 0;
		// 반복문 추가 실행 여부
		boolean bool = true;
		// 마지막으로 발견된 지점
		int fidx = -1;
		while(bool) {
			int get = sentence.indexOf(searchVoca, fidx + 1);
			if(get == -1) {
				bool = false;
			} else {
				fidx = get;
				count++;// 글씨 카운트 증가
				System.out.println(get + "번에서 " + count + "번째 " 
				                  + searchVoca + "이(가) 검출 되었습니다.");
				}
		}
		System.out.println(searchVoca + "의 총 출현 횟수는 " 
		                  + count + "회 입니다.");
		scan.close();
	}
}
