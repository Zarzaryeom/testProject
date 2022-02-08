package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * - for문
		 * - while문
		 * - do-while문
		 * 
		 * for문
		 * - for(초기화; 조건식; 증감식) {}
		 * - 포함하고 있는 문장들을 정해진 횟수만큼 반복시키는 문장
		 */		
		
//	
//		for(int i = 1; i <= 10; i++) {
//			//초기화 : 조건식과 증감식에 사용할 변수를 초기화한다.(변수를 지정하는 공간)
//			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행한다.
//			//증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
//			System.out.println(i + "번째 반복");
//		}
//		
		int sum = 0; //1부터 10까지 합계를 저장
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		sum = 0;
		for(int i = 10; i >= 1; i--) {
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
//		
//		
//		
//		//문1) 1부터 100까지 짝수의 합을 출력해주세요
//		
		sum = 0; 
		for(int x = 1; x <= 100; x++) {
			if(x % 2 == 0) sum += x;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 2; i <=100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
//		
//		
//		//문2) 1부터 100까지 홀수의 합을 출력해주세요.
		sum = 0;
		for(int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		 
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
//		
//		//문3) 구구단 출력
//		/*
//		 * 2 * 1 = 2
//		 * 2 * 2 = 4
//		 * 2 * 3 = 6
//		 * ....
//		*/
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + "=" + i * 2);
		} // 2단
		
		for(int i = 1; i <=9; i++) {
			System.out.println("6 * " + i + " = " + i * 6);
		} // 9단
		
		for(int i = 1; i <= 9; i++) {
			for(int a = 1; a <= 9; a++){
				System.out.println(i + " * " + a + " = " + i * a);
			}
		} // 1 ~ 9단을 한번에 출력
		
		for(int i = 1; i <= 9; i++) {
			for(int a = 1; a <= 9; a++) {
				System.out.print(a + " * " + i + " = " + i * a + "\t");
				if(a == 9) {
					System.out.print("\n");				
				}
			}			
		} // 1 ~ 9 단을 우측으로 나열되도록(1)
		System.out.print("\n\n");
		
		for(int i = 1; i <=9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}// 1 ~ 9 단을 우측으로 나열되도록(2)
//		
//		
//		
//		
//		
//		/*
//		 * while문
//		 * - while(조건식){}
//		 * - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
//		 * - 반복횟수가 정확하지 않은 경우에 주로 사용한다.
//		*/
		
		Scanner s = new Scanner(System.in);
		int input = 0;
		while(input != 3) {
			System.out.print("1.선택1 2.선택2 3.종료>");
			input = Integer.parseInt(s.nextLine());
		}
		
//		
//		/*
//		 * do-while
//		 * - do {} while(조건식);
//		 * - 최소한 한번의 수행을 보장한다.
//		*/
//		
//		//숫자 맞추기 게임
		int answer = (int)(Math.random() * 100) + 1;
		input = 0;
		
		do {
			System.out.print("1~100 사이의 수를 맞춰주세요>");
			input = Integer.parseInt(s.nextLine());
			
			if(answer < input) {
				System.out.println(input + "보다 작습니다.");
			}else if(input < answer) {
				System.out.println(input + "보다 큽니다.");
			}else {
				System.out.println("정답입니다.");
			}
		}while(input != answer);
//		
//		
		//이름붙은 반복문
		outer : for(int i = 2; i<= 9; i ++) {
			for(int j = 1; j <= 9; j++) {
				if(j == 5) {
//					break; //가장 가까운 반복문 하나를 빠져나간다.
//					break outer; //outer라는 이름의 반복문을 빠져나간다.
//					continue; // 가장 가까운 반복문의 현재 반복회차를 빠져나간다.
//					continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다.
				}
				System.out.println(i + " * " + j + " = " + i * j );
			}
			System.out.println();
		}
		
		

		//별 찍기
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		
//		for(int i = 1; i <= 3; i++) {
//			for(int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		outer :for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j <= 10; j++) {				
//				if(i == j)
//					break;				
//				System.out.print("*");				
//				}						
//			System.out.println();
//			} //트리만들기 1
//		
//		outer :for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j <= i; j++) {						
//				System.out.print("*");				
//				}						
//			System.out.println();
//			} //트리만들기 2
		
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 10; j >= i; j--) {
				System.out.print("*");				
			}
			System.out.println();
		} //역 트리만들기 1
		
		for(int i = 10; i <= 1; i++) {
			for(int j = 10; j <= i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		} //역 트리만들기 2

//		for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j <= i; i++) {
////				if(j >= 5) {
////					continue;
////				}
//				System.out.print("*");
//			}
//			System.out.println();
//		} // 삼각형 만들기
		
		
		
	}
	
}



		
