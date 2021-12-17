package structure;

public class ClassMain01P196 {
	// PersonClass의 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어 보세요.
        PersonClass a = new PersonClass();
        
		a.name = "임재원";
		a.age = 26;
		a.pNum = "01067779000";
		a.uNum = 183;
		a.hobby = "헬스";
				
		PersonClass b = new PersonClass();
		
		b.name = "이성민";
		b.age = 26;
		b.pNum = "01062229888";
		b.uNum = 176;
		b.hobby = "농구";
		// 만든 사람 두명의 정보를 콘솔에 찍어보세요.
		
		a.getInfo();
		b.getInfo();
	}
}
