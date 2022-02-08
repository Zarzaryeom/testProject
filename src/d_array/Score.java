package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Orcale, Java 점수를
		 * 0~100사이의 랜덤한 점수로 생성해주시고, 아래과 같이 출력해주세요.
		 * 
		 * 
		 * 이름	국어	영어	수학	사회	과학	Oracle	Java	합계	평균		석차
		 * 홍길동 90	90	90	90	90	90		90		630	90.00	1
		 * 홍길동 90	90	90	90	90	90		90		630	90.00	1
		 * 홍길동 90	90	90	90	90	90		90		630	90.00	1
		 * 홍길동 90	90	90	90	90	90		90		630	90.00	1
		 * 홍길동 90	90	90	90	90	90		90		630	90.00	1
		 * 과목합계 450   ....                450
		 * 과목평균 90.00   ....                90.00
		*/		

//	0~100사이 랜덤한 점수 : Math.round((int)(Math.random() * 100));
//	double[][] objPoint = new double[5][10];
	//숫자가 들어갈 배열 [2][2] ~ [11][8];
	
	String[] name = {"이름","국어", "영어", "수학", "사회", "과학",
						"Oracle", "Java", "합계", "평균", "석차"};
	String[] name2 = {"홍1","홍2","홍3","홍4","홍5","홍6","홍7","홍8","홍9","홍10","홍11","홍12","홍13","홍14","홍15",
					  "홍16","홍17","홍18","홍19","홍20","홍21","홍22","홍23","홍24","홍25"};
	int[] Sname = new int[name2.length];
	double[][] objPoint = new double[name2.length][name.length-1];
	
//	System.out.println(Arrays.toString(name));
//	for(int i = 0; i < name.length; i++) {
//		System.out.print("\t" + name[i]);	
//	}
//	
//	for(int i = 0; i < name2.length; i++) {
//		System.out.print("\n" + name2[i]);	
//	}
	

	
	//점수 배열 (5명 학생, 7개 과목)
	int[][] point = new int[name2.length][7];
	//학생별 점수 합계, 평균, 석차
	int[] sum = new int[name2.length];
	double[] avg = new double[name2.length];
	int[] level = new int[name2.length];
	//가로 합계, 평균
	for(int i = 0; i < point.length; i++) {
		int temp = 0;
		int temp2 = 0;
		 for(int j =0; j < point[i].length; j++) {
			int random = Math.round((int)(Math.random() * 100));
			point[i][j] = random;
			temp += point[i][j];
			objPoint[i][j] = point[i][j];
		}		
		sum[i] = temp;
		avg[i] = Math.round((double)sum[i]/point[i].length * 100)/100.00;
		objPoint[i][7] = sum[i];
		objPoint[i][8] = avg[i];		
	}


				
//		objPoint[7][i] = sum[i];
//		objPoint[8][i] = avg[i];
//	}
//	System.out.println(Arrays.toString(objPoint[1]));
//	System.out.println(Arrays.toString(objPoint[7]));
//	System.out.println(Arrays.toString(objPoint[8]));
	

	//석차	
	for(int i = 0; i < sum.length; i++) {
		int temp = 1;
		for(int j = 0; j < sum.length; j++) {
			if(sum[i] < sum[j]) {
				temp++;
			}
		}
		level[i] = temp;
		objPoint[i][9] = level[i]; 
	}	
	//석차를 기준으로 오름차순으로 정렬
	for(int i = 0; i < objPoint.length; i++) {
		double[] temp = new double[objPoint[i].length];
		String temp2 = null;
		for(int j = 0; j < objPoint.length; j++) {			
			if(objPoint[i][9] < objPoint[j][9]) {
				temp2 = name2[i];
				name2[i] = name2[j];
				name2[j] = temp2;
				for(int l = 0; l < objPoint[i].length; l++) {
					temp[l] = objPoint[i][l];
				}
				for(int l = 0; l < objPoint[i].length; l++) {
					objPoint[i][l] = objPoint[j][l];
				}
				for(int l = 0; l < objPoint[i].length; l++) {
					objPoint[j][l] = temp[l];
				}				
			}
		}
	}
//	for(int i = 0; i < objPoint.length; i++) {
//		System.out.println(Arrays.toString(objPoint[i]));		
//	}

//	System.out.println(Arrays.toString(sum));
//	System.out.println(Arrays.toString(avg));
//	System.out.println(Arrays.toString(level));
//	System.out.println(Arrays.toString(objPoint[9]));
	
	//과목합계, 과목평균
	int[] Osum = new int[7];
	double[] Oavg = new double[7];
	for(int i = 0; i < Osum.length; i++) {
		int temp = 0;
		for(int j = 0; j < point.length; j++) {
			temp += point[j][i];			
		}
		Osum[i] = temp;
		Oavg[i] = (double)Osum[i]/point.length;
		
//		System.out.println(Arrays.toString(Osum));
//		System.out.println(Arrays.toString(Oavg));
	}
//	System.out.println(Arrays.toString(Osum));
//	System.out.println(Arrays.toString(Oavg));
	

	for(int i = 0; i < name.length; i++) {
		System.out.print(name[i] + "\t");	
	}
	
	for(int i = 0; i < objPoint.length; i++) {
		System.out.print("\n" + name2[i]);	
		for(int j = 0; j < objPoint[i].length; j++) {
			System.out.print("\t" + objPoint[i][j]);
		}		
	}
	
	
	String[] name3 = {"과목합계", "과목평균"};
	for(int i = 0; i < name3.length; i++) {
		System.out.print("\n");
		System.out.print(name3[i] + "\t");
		for(int j = 0; j < Osum.length; j++) {
			if(i == 0) {
				System.out.print(Osum[j] + "\t");
				}else {
					System.out.print(Oavg[j] + "\t");
					}
			}
		}

	
	
	
	
	
	
	
	
	
	}
	

}
