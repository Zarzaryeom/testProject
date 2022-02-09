package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/*
		 * 서로 중복되지 않는 3자리 숫자
		 * ex) 123
		 * 	   145 : 1S 1B 1O
		 * 숫자랑 자릿수가 동일하면 : 스트라이크
		 * 숫자는 동일하지만 자릿수가 다르면 : 볼
		 * 일치하는 숫자가 없으면 : 아웃
		 * 
		 * 야구 게임을 만들어라!
		 */	
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("=============== 신나는 야구게임! ===============");
		int answer = (int)(Math.random() * 1000) + 1;
		//3자리 변수 생성
		int input = 0;
		
		System.out.println(answer);
		//구동 확인을 위한 변수 출력 명령
		
		do {			
			System.out.print("3자리 숫자를 입력하세요 : ");
			input = Integer.parseInt(s.nextLine());
			//사용자에게 변수를 입력 받는 명령어			
			
			int A = input / 100;
			int B = (input / 10) - (A * 10);
			int C = input - (input / 10) * 10;
			
			int a = answer /100;
			int b = (answer / 10) - (a * 10);
			int c = answer - (answer / 10) * 10;
			//숫자를 하나씩 비교할 수 있도록 분해
			
			String resualt1 = null;
			String resualt2 = null;
			String resualt3 = null;
			
			if(A == a) resualt1 = "S";
			else if(A == b)	resualt1 = "B";
			else if(A == c) resualt1 = "B";
			else resualt1 = "O";
			//첫번째 자리 숫자의 야구 점수 확인
			
			if(B == b) resualt2 = "S";
			else if(B == a) resualt2 = "B";
			else if(B == c) resualt2 = "B";
			else resualt2 = "O";
			//두번째 자리 숫자의 야구 점수 확인
			
			if(C == c) resualt3 = "S";
			else if(C == a) resualt3 = "B";
			else if(C == b) resualt3 = "B";
			else resualt3 = "O";
			//세번째 자리 숫자의 야구 점수 확인
			
				
			int sumS = 0;
			int sumB = 0;
			int sumO = 0;
			
			if(resualt1.equals("S")) sumS++;
			else if(resualt1.equals("B")) sumB++;
			else sumO++;
			
			if(resualt2.equals("S")) sumS++;				
			else if(resualt2.equals("B")) sumB++;
			else sumO++;
			
			if(resualt3.equals("S")) sumS++;
			else if(resualt3.equals("B")) sumB++;
			else sumO++;
			//야구게임 함수의 결과를 한번에 보여주기 위한 명령어
			
			System.out.println("이번 라운드 점수 : " + sumS + " S\t" + sumB + " B\t" + sumO + " O");
			
				
			if(resualt1.equals("S") && resualt2.equals("S") && resualt3.equals("S")) {
				System.out.print("=============== 승리하셨습니다!!!!! ===============");				
			}else {
				System.out.println("====== 아쉽네요. 다시 도전하세요! =====\n");
			}
			//결과값 출력 창
			
		}while(answer != input);
			//정답이 나올 때 까지 반복
	}

}

// 모범답안
//
//   while(a1 == a2 || a1 == a3 || a2 == a3)
//   int count = 0;
//   whlie(true){
//	   System.out.print("3자리의 숫자>");
//	   int input(Integer.parseInt(s.nextLine());int i3 = input % 10;
//	   input /= 10;
//	   int i2 = input % 10;
//	   input /= 10;
//	   int i1 = input % 10;
//	   
//	   int strike = 0;
//	   int ball = 0;
//	   int out = 0;
//	   
//	   if(a1 == i1) strike++;
//	   if(a2 == i2) strike++;
//	   if(a3 == i3) strike++;
//	   
//	   if(a1 == i2 || a1 == i3) ball++;
//	   if(a2 == i1 || a2 == i3) ball++;
//	   if(a3 == i1 || a3 == i2) ball++;
//	   
//	   out = 3 - strike - ball;
//	   
//	   System.out.println(++count + "차 시도(" + i1 + i2 + i3 +") :"
//			   + strike + "S " + ball + "B " + out + "O");
//	   System.out.println("---------------------");
//	   if(strike == 3) {
//		   System.out.println("정답입니다!");
//		   break;
//	   }
