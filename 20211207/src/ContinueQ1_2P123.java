import java.util.Scanner;

public class ContinueQ1_2P123 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("목표 정수를 입력해주세요.");
		int n = scan.nextInt();
		
		int total = 0;
		
		for(int a = 1; a < n; a++) {
			if(a % 2 == 0) {
				continue;
			}
			total += a;
		
			System.out.println("현재 1부터 " + a + " 까지 더했습니다.");
			System.out.println("총합은 " + total + " 입니다.");
		}
		scan.close();
    }
}