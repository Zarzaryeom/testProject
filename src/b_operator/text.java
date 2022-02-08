package b_operator;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		//산술명령을 수행하는 계산기
		
		
		Scanner sc = new Scanner(System.in);
		//스캔명령을 사용할 수 있도록 하는 함수
				
		System.out.println("=============== 간이 계산기 ===============");
		//무슨 프로그램인지 알려주는 안내문
		
		System.out.print("첫번째 입력 숫자 : ");
		double num1 = sc.nextDouble();
		//첫번째 연산자를 입력받는 명령
		
		System.out.print("두번째 입력 숫자 : ");
		double num2 = sc.nextDouble();
		//두번째 연산자를 입력받는 명령
		
		System.out.print("연산자를 입력하세요(*주의! : +,-,*,/만 가능) : ");
		String operater = sc.nextLine();
		//연산자를 입력받는 명령
		
		System.out.print(operater + "\t" + num1 + "\t" + num2);
		
	}
	
}
		/*
		String A = String.valueOf(num1 + num2);
		String B = String.valueOf(num1 - num2);
		String C = String.valueOf(num1 * num2);
		String D = String.valueOf(num1 / num2);
		
		String result = operater == "+" ? A :(
							operater == "-" ? B :(
								operater == "*" ? C :(
									operater == "/" ? D : "연산자 확인 불가")));
		//연산과정(삼항연산 : +과정, -과정, *과정, /과정, 확인불가)
		//분모가 0이 안되어야되나? - 상관 무
		
		System.out.println("연산 결과 : " + result);
		//결과를 보여주는 명령
	}
	*/


//  - 연산자를 왜 확인하지 못하지? 
//  --> 참조하는 데이터 주소를 가져온거라 스트링으로는 비교할 수 없다.
