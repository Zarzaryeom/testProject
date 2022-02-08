package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 *  - if문
		 *  - switch문
		 *  
		 * if문
		 *  - if(조건식){} : 조건식의 결과가 true이면 불럭안의 문장을 수행한다.
		 *  - else if(조선식){} : 다수의 조건이 필요할때 if 뒤에 추가한다.
		 *  - else{} : 조건식 이외의 경우를 위해 추가한다.
		*/	
		
	
		int a = 4;
		
		if(a == 1) {
			System.out.println("조건식의 연산결과가 ture이면 수행된다.");			
		}
			
		if(a == 1) {
			System.out.println("a == 1");
		}else if(a == 2) {
			System.out.println("a == 2");
		}else if(a == 3) {
			System.out.println("a == 3");
		}else {
			System.out.println("else");
		}
		
		
		//점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 80;
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	
		
		//점수에 등급을 부여
		score = 90;
		String grade = null;
		//null : 값이 없다는 의미, 참조형 타입의 기본값
		//기본값 : 자동으로 저장되는 값
		//참조형 타입이 아닌 기본형 타입에는 0이 기본으로 들어간다.
		//boolean 타입의 기본값 : false
		
		if(score >= 90 && score <=100) {
			grade = "A";			
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println(score + "점 : " + grade);
		
			
		//점수에 등급을 좀 더 디테일하게 넣어보자
		
		score = 90;
		grade = null;
		
		if(90 <= score && score <= 100) {
			grade = "A";
			if(97 <= score) {
				grade += "+";
			}else if(score <= 93) {
				grade += "-";
			}
		}else if(80 <= score) {
			grade = "B";
			if(87 <= score) {
				grade += "+";
			}else if(score <= 83)
				grade += "-";
		}else if(70 <= score) {
			    grade = "C";
			if(77 <= score) {
				grade += "+";
			}else if(score <= 73)
				grade += "-";
		}else if(60 <= score) {
			    grade = "D";
		    if(67 <= score) {
			    grade += "+";
		    }else if(score <= 67)
			    grade += "-";
		}else {
			grade = "F";
		}
		System.out.println(score + "점 : " + grade);
		
		
		/*
		 * switch문
		 * - switch(int/String){ case 1 : break; }
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		*/
		
		a = 30;
		switch(a) {
		case 10:
			System.out.println("a == 10");
			break;
		case 20:
			System.out.println("a == 20");
			break;
		default :
			System.out.println("defaut");
		
		}
		
		//월에 해당하는 계정을 출력
		int month = 1;
		String season = null;
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "강을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		}
			
		System.out.println("해당하는 계절은 : " + season);
		
		
		
		//점수의 등급을 
		score = 95;
		grade = null;
		
		switch(score / 10) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println("점수 : " + score + "\n등급 : " + grade);
		
		
		
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 :");
		int num1 = Integer.parseInt(sc.nextLine());
		
	    //null은 참조형에만 사용할 수 있기에 기본형 타입에 들어갈 수 없다.
		if(num1 % 2 == 0 ) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
		switch(num1 % 2) {
		case 0:
			System.out.println("짝수");
			break;
		default:
			System.out.println("홀수");
		}
		
		
		
		
		//문제 : 1~100 사이의 랜덤한 값을 3개 발생시키고 합계, 평균, 등급을 출력해주세요.
		
		int random1 = (int)(Math.random()*100) + 1;
		int random2 = (int)(Math.random()*100) + 1;
		int random3 = (int)(Math.random()*100) + 1;
		//랜덤한 값을 3개 발생시키는 함수
		
		int sum = random1 + random2 + random3;
		double avg = Math.round(sum / 3.0 * 10) / 10.0;
		//math.round : 반올림을 하기위한 함수
		String grade1 = null;
		
		if(90 <= avg) {
			grade1 = "A";
		}else if(80 <= avg) {
			grade1 = "B";
		}else if(70 <= avg) {
			grade1 = "C";
		}else if(60 <= avg) {
			grade1 = "D";
		}else {
			grade1 = "F";
		}
		
		System.out.println("합계 : " + sum + "평균 : " + avg + "등급 : " + grade1 );
		//합계, 평균, 등급을 출력하는 함수
		
		

		
		

		
		
		//삼항연산 : a = b가 참이면 ? 00 불이면: 00
		//경우의 수 : x>y>z, x>z>y, y>x>z, y>z>x, z>x>y, z>y>x
		//x >=y 경우, z가 x보다 크거나 y보다 크거나 작거나
		
		
		
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












