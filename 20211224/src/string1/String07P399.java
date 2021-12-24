package string1;

public class String07P399 {

	public static void main(String[] args) {
		// toUpperCase() 는 문자열 전체를 대문자로 바꿉니다.
		// 대문자 였던 것은 대문자 유지, 소문자 였던 것은 대문자로 바꿉니다.
		String hello = "Hello Java";
		System.out.println(hello.toUpperCase());
		System.out.println(hello); //영구 적용이 아니라 한번 바꿔주는 개념
		
		// toLowerCase() 는 문자열 전체를 소문자로 바꿉니다.
		// 소문자 였던 것은 소문자 유지, 대문자 였던 것은 소문자로 바꿉니다.
		System.out.println(hello.toLowerCase());
        System.out.println(hello); // 영구 적용이 아니라 한번 바꿔주는 개념
        
	}

}
