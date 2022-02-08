package j_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {

		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Orcale, Java 점수를 0~100사이의 랜덤한 점수로 생성해주시고, 아래과 같이
		 * 출력해주세요.
		 * 
		 * 이름	국어	영어	수학	사회	과학	Oracle	Java	합계	평균		석차
		 * 홍길동 90	90	90	90	90	90		90		630	90.00	1
		 * 홍길동 90	90	90	90	90	90		90		630	90.00	1
		 * 홍길동 90	90	90	90	90	90		90		630	90.00	1
		 * 홍길동 90	90	90	90	90	90		90		630	90.00	1
		 * 홍길동 90	90	90	90	90	90		90		630	90.00	1
		 * 과목합계 450   ....                450
		 * 과목평균 90.00   ....                90.00
		 * 과목합계 450 .... 450 과목평균 90.00 .... 90.00
		 */

		// 2차원 ArrayList
		ArrayList<ArrayList<Integer>> student = new ArrayList<ArrayList<Integer>>();

		// 25명 학생 ArrayList
		ArrayList studentname = new ArrayList();
		int a = 1;
		for(int i = 0; i < 5; i++) {			
			studentname.add("김" + a);
			a++;			
		}		

		// 학생마다 과목 점수, 과목 합계, 평균
//		ArrayList<Integer> subject = new ArrayList<Integer>();
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Double> avgs = new ArrayList<Double>();

		for (int i = 0; i < 5; i++) {
			student.add(new ArrayList()); // student ArrayList에 subject 저장
			int sum = 0;
			for (int j = 0; j < 7; j++) {
				student.get(i).add((int) (Math.random() * 101));
				sum += student.get(i).get(j); // 학생마다 과목 합계 합산
			}
			sums.add(sum); // 합산한 합계 sums ArrayList에 저장
			avgs.add(Math.round((double) sum / student.get(i).size() * 100) / 100.0);
		}

		student.add(sums);		
//		System.out.println(sums);
////		System.out.println(student);
//		System.out.println(avgs);

		// 석차
		ArrayList<Integer> temps = new ArrayList<Integer>();
		ArrayList<Integer> ranks = new ArrayList<Integer>();
		ArrayList<Integer> rankas = new ArrayList<Integer>();
		int temp = 0;
		double temp2 = 0;
		for (int i = 0; i < student.get(i).size(); i++) {
			int ranka = 1;
			for (int j = i; j < (student.size() - 1); j++) {
				//student.size() - 1 : 현재 student에 sums가 추가되어 있어서
				if (sums.get(i) < sums.get(j)) {
					temp = sums.get(i);
					sums.set(i, sums.get(j));
					sums.set(j, temp);
					
					temp2 = avgs.get(i);
					avgs.set(i, avgs.get(j));
					avgs.set(j, temp2);				

					temps = student.get(i);
					student.set(i, student.get(j));
					student.set(j, temps);
				}
			}
		}
//		System.out.println(sums);
//		System.out.println(avgs);
//		System.out.println(student);
		
		
		//과목 합계, 평균
		ArrayList<Integer> subsums = new ArrayList<Integer>();
		ArrayList<Double> subavg = new ArrayList<Double>();
		
		for(int i = 0; i < student.get(0).size(); i++) {
			int subsum = 0;
			for(int j = 0; j < (student.size() -1); j++ ) {
				subsum += student.get(j).get(i);				
			}
			subsums.add(subsum);
			subavg.add(Math.round((double)subsum / (student.size() -1) * 100) / 100.0);
		}
		
		
		
		
		
		int rank = 1;
		
		
		System.out.print("이름\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차");
		System.out.println();
		for(int i = 0; i < (student.size() - 1); i++) {
			System.out.print(studentname.get(i) + "\t");
			for(int j = 0; j < student.get(0).size(); j ++) {
				System.out.print(student.get(i).get(j) + "\t");
				}
			System.out.print(student.get(5).get(i) + "\t");
			System.out.print(avgs.get(i) + "\t");
//			System.out.println(ranks.get(i));
			System.out.print(rank);
			System.out.println();
			rank++;
		}		
	
		
		for(int i = 0; i < student.get(0).size(); i++) {
			System.out.print("\t" + subsums.get(i));			
		}
		System.out.println();
		for(int i = 0; i < student.get(0).size(); i++) {
			System.out.print("\t" + subavg.get(i));
		}
		
		
		ArrayList<ArrayList> sample = new ArrayList<ArrayList>();
		sample.add(studentname);
		sample.add(student);
		sample.add(avgs);
		sample.add(ranks);
			

		System.out.println();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(sample.get(i).get(j));
			}
			System.out.println();
		}
			
		
		

	}

}
