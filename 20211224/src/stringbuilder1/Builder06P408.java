package stringbuilder1;

public class Builder06P408 {

	public static void main(String[] args) {
		// setCharAt()은 문자열에서 입력한 인덱스 번호의 문자를
		// 다른 문자로 교체해줍니다.
		// insert()는 뒤로 밀어내 공간을 확보했지만, setCharAt()은
		// 그냥 그 위치의 문자를 덮어 씌워 버립니다.
		// setCharAt()도 역시 한 번에 한 글자에 대해서만 교체가 가능합니다.
		StringBuilder str = new StringBuilder("abcdefg");
		System.out.println(str);
		
		// setCharAt()으로 변경하는 단일 문자는 홑따옴표(')로 여닫는 부분을 작성해야 합니다.
		str.setCharAt(5, 'z');
		System.out.println(str);
	}
}
