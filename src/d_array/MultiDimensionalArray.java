package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * - 배열안에 배열이 저장되어 있는 형태이다.
		 * 
		 * 
		 * 			
		*/
//		
//		
//		//2차원
//		int[][] array2;
//		
//		//3차원
//		int[][][] array3;
//		
//		
//		//2차원 배열 만들기 방법 1)
//		int[][] arr = new int[2][3];
//		/*
//		 * 2차원 배열 arr의 구조
//		 * 변수 = 100번지(주소)
//		 * 
//		 * 100번지
//		 * {200번지, 300번지}
//		 * 
//		 * 200번지
//		 * {0, 0, 0}
//		 * 
//		 * 300번지
//		 * {0, 0, 0}
//		 * 					
//		*/
//				
//		//2차원 배열 만들기 방법 2)
//		int arr2[][] = new int[][] {{1, 2, 3}, {4, 5, 6}};
//		
//		//2차원 배열 만들기 방법 3)
//		int[] arr3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//		
//		//2차원 배열 만들기 방법 4)
//		int[][] arr4 = new int[3][]; //가변 배열
//		//가별 배열에 위치하는 배열은 인덱스가 변할 수 있다.
//		//예시
//		arr4[0] = new int[3];
//		arr4[1] = new int[4];
//		arr4[2] = new int[10];
//		
////		arr[0] = 10; //값을 저장할 수 없다.(배열이 들어가야 되는 구조이기 때문에)
//		arr[0] = new int[5]; //1차원은 배열을 저장하는 곳이다.
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[1][0] = 100;
//		
//		System.out.println(arr[0][1]);
//		
//		System.out.println(arr.length); // 1차원의 길이
//		System.out.println(arr[0].length); // 2차원의 길이
//		
//		
//		//2차원 배열에 접근하기
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.println(i + "," + j + ":" + arr[i][j]);
//			}
//		}
		
		//문제 1)
		//0~100사이에 랜덤한 변수를 배열에 저장하고
		//각 학생의 합계와 평균을 각 배열에 저장하라
		//조건	
		int[][] scores = new int[3][5]; //int[학생수][과목수]
		int[] sum = new int[scores.length]; //합계
		double[] avg = new double[scores.length]; //평균
		
		
//		int random = (int)(Math.random() * 100); 0~0.999..사이의 수
		//풀이
		
		//0~100사이에 랜덤한 변수를 배열에 저장
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				int random = Math.round((int)(Math.random() * 100));
				scores[i][j] = random;
			}
		}
		
		//각 학생의 합계와 평균 구하기
		//합계 구하기
		for(int i = 0; i < scores.length; i++) {
			int temp = 0;			
			for(int j = 0; j < scores[i].length; j++) {
				temp += scores[i][j];					
			}
			sum[i] = temp;
			avg[i] = (double)temp/scores[i].length;
			System.out.println("합계 : " + sum[i] + " 평균 : " + avg[i]);
		}
		System.out.print("\n");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
