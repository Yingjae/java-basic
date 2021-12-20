package static2;

public class Main01P276 {

	public static void main(String[] args) {
		// Asean 조원 생성 없이도 팀 점수는 public으로 처리된 경우 바로 조회 가능
		// System.out.println(Asean.presentationScore);
		Asean.showPre();
		
		Asean a1 = new Asean(12, 15, 15);
		a1.showAseanInfo();
		/*
	    Asean a2 = new Asean(12, 10, 16);
		Asean a3 = new Asean(10, 15, 17);
		Asean a4 = new Asean(10, 13, 18);		
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
		*/
	}
}
