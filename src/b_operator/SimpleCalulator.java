package b_operator;

import java.util.Scanner;

public class SimpleCalulator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		//산술명령을 수행하는 계산기
		
		
		Scanner sc = new Scanner(System.in);
		//스캔명령을 사용할 수 있도록 하는 함수
				
		System.out.println("=============== 간이 계산기 ===============");
		//무슨 프로그램인지 알려주는 안내문
		
		System.out.print("연산자에 해당하는 번호를 입력하세요\n + = 1\n - = 2\n * = 3\n / = 4\n : ");
		float operater = sc.nextFloat();
		//연산자를 입력받는 명령
		
		System.out.print("첫번째 입력 숫자 : ");
		float num1 = sc.nextFloat();
		//첫번째 연산자를 입력받는 명령
		
		System.out.print("두번째 입력 숫자 : ");
		float num2 = sc.nextFloat();
		//두번째 연산자를 입력받는 명령
		
		String A = String.valueOf(num1 + num2);
		String B = String.valueOf(num1 - num2);
		String C = String.valueOf(num1 * num2);
		String D = String.valueOf(num1 / num2);
		//연산한 값들을 String으로 변환

		String result = operater == 1 ? A :(
							operater == 2 ? B :(
								operater == 3 ? C :(
									operater == 4 ? D : "연산자 확인 불가")));
		//입력된 변수에 따라 연산(삼항연산 : +과정, -과정, *과정, /과정, 확인불가)
		
		System.out.println("연산 결과 : " + result);
		//연산 결과 출력

	}
	
}


