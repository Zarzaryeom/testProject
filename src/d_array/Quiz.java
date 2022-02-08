package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//		//문1 변수
//		int money = (int)(Math.random() * 500) * 10;
//		int[] coin = {500, 100, 50, 10 };
//		
//		System.out.println("거스름돈 : " + money);
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
//		int compaer = 0;
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		
//		do {
//			compaer += 500;
//			a++;			
//		}while(money > compaer);
//		compaer -= 500;
//		a--;
//		
//		do {
//			compaer += 100;
//			b++;
//		}while(money > compaer);
//		compaer -= 100;
//		b--;
//		
//		do{
//			compaer += 50;
//			c++;
//		}while(money > compaer);
//		compaer -= 50;
//		c--;
//		
//		do {
//			compaer += 10;
//			d++;
//		}while(money > compaer);
//		d--;
//		
//		
//		System.out.println("500원 : " + a + "\n100원 : " + b + 
//				"\n50원 : " + c + "\n10원 : " + d);
		
		//큰 숫자부터 비교하면서 하나씩 더한다.
		//하나씩 더하다가 원래 금액보다 커지면 다음 조건으로

		//답안
//		int money = (int)(Math.random() * 500) * 10;
//		int[] coin = {500, 100, 50, 10 };
//		
//		System.out.println("거스름돈 : " + money);
//		//돈 / 배열 : 돈을 낸 횟수
//		// 돈 % 배열 : 다음 돈을 낸 횟수를 보여주기위한 
//		for(int i = 0; i < coin.length; i++) {
//			System.out.println(coin[i] + "원 : "+ money/coin[i] + "개");
//			money %= coin[i];
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
//		
//		for(int j = 0; j < 5; j++) {
//			int x = 0;
//				for(int i = 0; i < arr.length; i++) {
//					if(arr[i] == j+1) {
//						x++;						
//					}
//				}
//				System.out.print((j +1) + " : ");
//				for(int l = 0; l < x; l++) {
//					System.out.print("*");
//				}
//				System.out.println("  " + x);			
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		
//		int[] count = new int[5]; // 배열을 활용하고 if없이 문제 풀어보기!
		
		

		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5) +1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어라
		 * [4, 4, 3, 3, 4, 5, 5, 2, 3, 5]
		 * [4, 3, 5, 2]
		 * 값이 들어간 순서가 바뀌면 안된다!		
		*/
		
		//숫자를 비교해서 중복을 확인
		/*중복 확인방법
		 * 1.arr[i]를 기준으로 arr[j]가 같은게 없어야 한다.
		 * 2.이걸 찾을 때, i != j 이어야한다.
		 * 3.이 과정이 모두 참이면 arr[i]를 변수에 삽입한다.
		*/
		//중복을 확인해서 중복이 없으면 출력
		//출력된 숫자를 모아서 배열
//		int temp = 0;
//		int num[] = new int[arr.length];
//
//		for(int i = 0; i < arr.length; i++) {
//			int x= 0;
//			for(int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					x++;					
//				}				
//			}
//			if(x == 0) {
//				num[i] = arr[i];
//			}	
//		}
//		System.out.println(Arrays.toString(num));
//		
//		int sov = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(num[i] != 0) {
//				sov++;
//			}
//		}
//
//		int[] answer = new int[sov];
//		int count = 0;
//		for(int i = 0; i < num.length; i++) {
//			if(num[i] != 0) {				
//				answer[count] = num[i];
//				count++;				
//			}
//		}
//		System.out.println(Arrays.toString(answer));
		
		//모범답안
		int[] temp = new int[5];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean flag = true;
			
			
			for(int j = 0; j< temp.length; j ++) {
				if(arr[i] == temp[j]) {
					flag =false;					
				}
			}
			
			
			if(flag) {
				temp[count++] = arr[i];
			}
			System.out.println(Arrays.toString(temp));
		}
		System.out.println(Arrays.toString(temp));
		
		int[] result = new int[count];
		for(int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
		
		//배열 순서대로 배열 뽑고 뽑힌 배열들로 배열 만들기

		//뽑은 배열이 뽑힌 배열중에 있으면 건너가기
		
		//뽑힌 배열들로 배열 만들기
		
		//배열을 처음부터 확인하고 중복되지 않은 숫자를 출력한다.
		
		
		//문4)
		/*
		 * 		
		*/
		
		

		}
	}

