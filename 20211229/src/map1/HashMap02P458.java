package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어 보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어 주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("제육볶음", 7000);
		map.put("순대국밥", 6000);
		map.put("콩나물국밥", 5000);
		map.put("오징어볶음", 7000);
		map.put("뚝배기불고기", 7000);
		System.out.println(map);
		
		System.out.println(map.get("제육볶음"));
		System.out.println(map.get("오징어볶음"));
		System.out.println(map.get("뚝배기불고기"));
		
		
	}

}
