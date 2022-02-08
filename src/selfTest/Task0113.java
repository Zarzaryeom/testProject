package selfTest;

import javax.security.auth.Subject;

public class Task0113 {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100사이의 랜덤한 점수로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 이름		국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		
		String[] names = {"강동주", "강정인", "강현수", "곽성상", "김기웅"
						, "김민지", "김형돈", "노혜지", "박태정", "서난희"
						, "예현의", "오지현", "오혜지", "유정민", "이병진"
						, "이수민", "이슬기", "이유정", "이의찬", "이정규"
						, "이종민", "장문석", "정다영", "최민규", "최혁진"};
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		int[][] score = new int[names.length][subjects.length];
		
		
		//랜덤한 변수 만들어 score에 저장
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				int random = (int)(Math.random()*101);
				score[i][j] = random;
			}
		}		
		
		//학생별 점수 합계, 평균
		int[] nameSum = new int[score.length];
		double[] nameAvg = new double[score.length];
		for(int i = 0; i < score.length; i++) {			
			for(int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];				
			}
			nameAvg[i] = Math.round((double)nameSum[i] * 100) / 100.0;
		}
		
		//석차
		int[] rank = new int[score.length];
		for(int i = 0; i < score.length; i++) {
			rank[i] = 1;
			for(int j = 0; j < score.length; j++) {
				if(nameSum[i] < nameSum[j]) {
					rank[i]++;
				}
			}			
		}
		
		//과목별 합계, 평균
		int[] subSum = new int[subjects.length];
		double[] subAvg = new double[subjects.length];
		
				
		//출력
		
		
		
		
		
		
		
		
		
	}

}
