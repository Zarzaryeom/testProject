package selfTest;

import java.util.Arrays;
import java.util.Scanner;

public class task0110 {

	public static void main(String[] args) {
		//문1)인덱스가 10개인 랜덤한 배열을 만들고 그 합과 평균을 구하시오.
		int[] array;
		array = new int[10];
		int temp = 0;
		
		for(int i = 0; i < array.length; i++) {
			int random = (int)(Math.random() * 10);
			array[i] = random;
			temp += array[i];
		}
		System.out.println(temp);
		//array배열의 랜덤한 인덱스 10개 합
		double temp2 = (double)temp / array.length;
		System.out.println(temp2);
		//array배열의 랜덤한 인덱스 10개 평균		
		
		
		
		//문2)0에서부터 9사이에 랜덤한 인덱스랑 0번 인덱스에 있는 값을 교환
		int[] array2;
		array2 = new int[10];
		
		for(int i = 0; i < array2.length; i++) {
			int random = (int)(Math.random() * 10);
			array2[i] = random;
		}
		
		//배열의 값을 섞어 주세요.
		
		
		//문3)1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
		//1.10과제 모범 답안
		//중복제거 방법 1 : 배열자체를 섞은 뒤 앞에서부터 숫자를 출력
		//중복제거 방법 2 : 이미 뽑은 사람과 뽑힌사람을 비교하면서 중복 확인
			String[] students = {"김1", "김2", "김3", "김4"};
			
			Scanner s = new Scanner(System.in);
			System.out.println("몇명?");
			int count = Integer.parseInt(s.nextLine());
			
			String[] pick = new String[count];
			int pickCount = 0;
			do {
				int random = (int)(Math.random() * students.length);
				
				boolean flag = true;
				for(int i = 0; i <pick.length; i++) {
					if (students[random].equals(pick[i])) {
						flag = false;
					}
				}
				if(flag) {
					pick[pickCount++] = students[random];
				}
			}while(pickCount < count);
			System.out.println(Arrays.toString(pick));
			
			
		
	}

}
