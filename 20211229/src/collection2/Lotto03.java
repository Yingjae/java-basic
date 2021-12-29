package collection2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복회수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사
		List<Integer> lotto = new LinkedList<>();
		List<Integer> myLotto = new LinkedList<>();
		
		int getNum = 0;
		int myNum = 0;
		
		while(lotto.size() != 6) {
			getNum = (int)(Math.random() * 45) + 1;
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}						
		}
		Collections.sort(lotto);
		System.out.println("당첨 번호 : " + lotto);
		
		// 아래 6개 뽑고 비교하는 부분을 반복문으로 처리해야 합니다.
		// 조건식은 당첨인 경우 탈출로 해주시면 됩니다.
		int count = 0;
		while(!lotto.equals(myLotto)) {
			// 6개가 이미 뽑혀있는 상황이라면 당첨번호를 어떻게 해 줘야 할지?
			myLotto.clear();
			
			while(myLotto.size() != 6) {
				myNum = (int)(Math.random() * 45) + 1;
				if(!myLotto.contains(myNum)) {
					myLotto.add(myNum);
				}
				count ++;
			}
			Collections.sort(myLotto);
			System.out.println("내 추첨 번호 : " + myLotto);
		}
		System.out.println(count + "회 만에 당첨 되었습니다.");
		// 반복문이 몇 바퀴 돌았는지 카운팅 하는 로직을 위에 추가해주세요
		// 저의 경우는 반복문 진입 전에 int count = 0; 을 만들어놓고
		// 반복문이 한바퀴 돌 때 마다 count++;를 이용해 1씩 증가시켜놓고
		// 탈출 후에 콘솔에 최종 횟수만 찍히도록 합니다.
	}
}
