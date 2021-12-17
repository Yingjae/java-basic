
public class Casting46P {

	public static void main(String[] args) {
		// 원래는 서로 다른 자료형간에는 연산이 불가능 하지만
		// 편의상 컴퓨터가 자동으로 자료형을 보정해주는 경우가 있는데
		// 이를 가리켜 자료형변환 이라고 합니다.
		// 자동 형 변환인 Promotion과 강제 형 변환인 Casting이 있습니다.
		// 자동 형 변환은 작은 데이터를 큰 데이터로 바꿀 때 발생하고
		// 강제 형 변환은 큰 데이터를 작은 데이터로 바꿀 때 주로 사용합니다. 데이터가 소실 될 우려가 있습니다.
		int a =5;
		double b = 7.12;
		System.out.println(a + b);// 자동 형 변환, int -> double
		// 강제 형 변환을 하고 싶은 자료 왼쪽에 (바꿀자료형)자료
		// 형식으로 작성하면 됩니다.
		System.out.println(a + (int)b);
	}

}
