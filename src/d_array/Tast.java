package d_array;

import java.util.Arrays;

import javax.security.auth.Subject;

public class Tast {

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

		
		//점수 랜덤 발생
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				int random = (int)(Math.random()*101);
				score[i][j] = random;
			}
		}
				
		//합계 평균(score을 이용하여 합계 평균 구하기)
		int[] nameSum = new int[names.length];
		double[] nameAvg = new double[names.length];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];				
			}
			nameAvg[i] = Math.round((double)nameSum[i]/subjects.length *100)/100.0 ;
		}
		
		//과목별 합계 평균(score을 이용하여 과목별 합계 평균 구하기)
		int[] subSum = new int[subjects.length];
		double[] subAvg = new double[subjects.length];
		
		for(int i = 0; i < score[i].length; i++) {
			for(int j = 0; j < score.length; j++) {
				subSum[i] += score[j][i];
			}
			subAvg[i] = Math.round((double)subSum[i] / names.length*100)/100.0;
		}
		
		
		//석차(합계를 비교해서 합계가 낮으면 석차가 추가되는 함수)
		int[] nameRank = new int[names.length];
		for(int i = 0; i < nameSum.length; i++) {
			int rank = 1;
			for(int j = 0; j < nameSum.length; j++ ) {
				if(nameSum[i] < nameSum[j]) {
					rank++;
				}
			}
			nameRank[i] = rank;
		}		
		
		//석차순으로 정렬(시험에 출제되지 않음)
		
		//출력(1행 출력)
		System.out.print("이름" + "\t");
		for(int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + "\t");
		}
		System.out.print("합계\t" + "평균\t"+ "석차\n");
		
		
		//(이름, 과목별 성적, 합계, 평균, 석차 출력)
		for(int i = 0; i < score.length; i++) {
			System.out.print(names[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(nameSum[i] + "\t" + nameAvg[i] + "\t" + nameRank[i]);
			System.out.print("\n");
		}		
		
		
		//(과목 합계 출력)
		System.out.print("과목합계"+ "\t");
		for(int i = 0; i < subSum.length; i++) {
			System.out.print(subSum[i]+ "\t");
		}
		
		//(과목 평균 출력)
		System.out.print("\n과목평균"+ "\t");
		for(int i = 0; i < subAvg.length; i++) {
			System.out.print(subAvg[i] + "\t");
		}
		
	}

}
