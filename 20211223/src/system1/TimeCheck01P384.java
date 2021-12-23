package system1;

public class TimeCheck01P384 {

	public static void main(String[] args) {
		// currentTimeMills의 자료는 long형에 저장해야 합니다.
		// 시작지점
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : " + start);
		
		long all = 0;
		
		for(int i = 0; i < 2000000001; i++) {
			all += i;
		}
		System.out.println("1부터 20억까지 다 더하면 : " + all);
		
		// 끝나는 시점
		long end = System.currentTimeMillis();
		System.out.println("끝난 시간 : " + end);
		System.out.println("소요 시간 : " + (end - start));

	}

}
