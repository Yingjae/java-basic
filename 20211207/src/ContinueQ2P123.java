
public class ContinueQ2P123 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 수학(math) 평균 점수를 내주시되, 합격자 평균만 내주세요.
		// 합격 점수는 60점 이상입니다.
		
        int[] math = {96, 23, 52, 82, 72, 31, 58};
        int[] eng = {62, 42, 68, 31, 80, 77, 45};
        int[] com = {10, 28, 39, 74, 65, 90, 98};
        
        int total = 0;
        int count = 0;
        for(int score : math) {
        	 if(score < 60) {
                 continue;
             }
            count += 1;
            total += score;
        }
            System.out.println("수학 평균 : " + total / count);  
            
            total = 0;
            count = 0;
            for(int score : eng) {
            	if(score < 60) {
            		continue;
            	}
            	count += 1;
            	total += score;
            	}
            System.out.println("영어 평균 : " + total / count);
            
            total = 0;
            count = 0;
            for(int score : com) {
            	if(score <  60) {
            		continue;
            	}
            	count += 1;
            	total += score;
            }
            System.out.println("컴퓨터 평균 : " + total / count);
  }
}
