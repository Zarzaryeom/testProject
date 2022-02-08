package selfTest;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		//
		/* 문1)
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 :5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 * 
		 */
//		int money = (int)(Math.random() * 500) * 10;
//		int[] coin = {500, 100, 50, 10 };
//		
//		System.out.println("거스름돈 : " + money);
//		
//		//거스름돈의 갯수 : money / 인덱스
//		
//		
//		for(int i = 0; i < 4; i++) {
//			int x = money / coin[i];			
//			System.out.println(coin[i] + "원 : " + x);			
//			money = money - coin[i]*x;
//		}
		
				
		
		
		
		
		
		//문2)
				/*
				 * 1~5사이의 숫자가 발생된 횟수 만큼 *을 사용해 그래프를 그려주세요
				 * 
				 * 1 : ***3
				 * 2 : ****4
				 * 3 : **2
				 * 4 : *****5
				 * 5 : ******6		
				*/
//		int[] arr = new int[20];
//		for(int i = 0;i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 5) +1;			
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		//인덱스 하나씩 전부 체크하면서 숫자를 세보자
//		//1~5까지 숫자를 체크해 볼 for문
//		int[] answer = new int[5];
//		for(int i = 0; i < 5; i++) {
//			int count = 0;
//			for(int j = 0; j < arr.length; j++) {
//				if(i+1 == arr[j]) {
//					count++;
//				}				
//			}
//			answer[i] = count; 
//		}
//		System.out.println(Arrays.toString(answer));
		
		
		
		
		
		
		
		
		//문3)
		/*
		 * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어라
		 * [4, 4, 3, 3, 4, 5, 5, 2, 3, 5]
		 * [4, 3, 5, 2]
		 * 값이 들어간 순서가 바뀌면 안된다!		
		*/
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5) +1;
		}
		System.out.println(Arrays.toString(arr));
		
		//하나씩 확인해보고 중복이 아닐 시 값을 저장한다.
//		int[] x = new int[5];
//		int count = 0;
//		for(int i = 0; i < arr.length; i++) {
//			boolean flag = true;
//			for(int j = 0; j < x.length; j++) {
//				if(arr[i] == x[j]) {
//					flag = false;
//				}
//			}
//			if(flag) {
//				x[count++] = arr[i];
//			}
//		}
//		System.out.println(Arrays.toString(x));
//		System.out.println(count);
//		
//		int[] answer = new int[count];
//		for(int i = 0; i < x.length; i++) {
//			if(x[i] != 0) {
//				answer[i] = x[i];
//			}
//				
//		}
//		System.out.println(Arrays.toString(answer));
		
		
		
	}

}
