package e_oop;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 +654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
				
		Calculator cal = new Calculator();
		Scanner s = new Scanner(System.in);
		
		double A = cal.Sum(1234567,7654321);
		double B = cal.time(A, 1234567);
		double C = cal.div(B, 1234567);
		double D = cal.subtra(C, 7654321);
		double E = cal.remain(D, 1234567);
		
		System.out.printf("%f%n",B);
		System.out.println(A + "\n" + B + "\n" + C + "\n" + D + "\n" + E);
		
		System.out.println("숫자를 입력해 주세요 : ");
		double num1 = s.nextDouble();
		
		System.out.println("두번째 숫자를 입력해 주세요 : ");
		double num2 = s.nextDouble();
		
		System.out.println("연산자에 해당하는 숫자를 입력해 주세요 : "
							+ "	\n 덧셈(1), 뺼셈(2), 곱셈(3), 나눗셈(4), 나머지(5)");
		int calcu = Integer.parseInt(s.nextLine());
		
		if(calcu == 1) {
			
		}
		
		
		
		
		
		
		
		
	}

}
