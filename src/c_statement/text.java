package c_statement;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제 : 1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
		//먼저 출력 함수를 만들고, 랜덤한 숫자가 차례로 들어가는 함수를 만들어라
		int x = (int)(Math.random() * 100) + 1;
		int y = (int)(Math.random() * 100) + 1;
		int z = (int)(Math.random() * 100) + 1;
		
		if(x > y) {
			int temp = x;
			x = y;
			y = temp;
		}
		
		if(x > z) {
			int temp = x;
			x = z;
			z = temp;
		}
		
		if(y > z) {
			int temp = y;
			y= z;
			z = temp;
		}	
				
		System.out.print("오름차순 : " + x + y + z);
		
		
	}

}
