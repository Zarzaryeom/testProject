package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
         * 비트 연산자
         * - |, &, ^, ~, <<, >>
         * - 비트 단위로 연산한다.
         * 
         * 기타 연산자
         * - .(참조연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다.
         * - ?:(삼항연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장
         * 						: 조건식이 거짓일 경우 수행할 문장				
		
		*/
		
		
		//1byte : 01010101, 1바이트는 0또는 1의 숫자 8개가 모여있다.
		//					0과 1을 각각 1bit라고 한다.
		//비트가 둘 다 0인 경우 0을 결과로, 둘 다 0이 아닌 경우는 1로
		System.out.println(10 | 15);
		//10 : 00001010
		//15 : 00001111
		//결과 : 00001111
		//실제로 잘 사용되지 않는다.
		
		
		
		
		//삼항연산자
		int x = 10;
		int y = 20;
		
		int result = x > y ? 34 : 53;
		//조건식은 반드시 boolean 타입이 와야한다.
		System.out.println(result);
		
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 2;
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println(gender);
		
		//삼항연산자 2개를 중첩하기
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println(gender);
			
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 :");
		int _x = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자를 입력하세요 :");
		int _y = Integer.parseInt(sc.nextLine());
		
		int compare = _x > _y ? _x : _y;
		System.out.println(compare);
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그외의 숫자를 입력하면 확인불가를 출력해주세요.
		
		System.out.print("주민번호 뒷자리의 첫번째 숫자를 입력해주세요 :");
		int num = Integer.parseInt(sc.nextLine());
		
		String result1 = num == 1 || num == 3 ? "남자" : 
			(num == 2 || num == 4 ? "여자" : "확인불가");
		System.out.println(result1);
		//논리연산자는 반드시 좌우에 boolean 타입!!
		//result1 = num == 1 || 3 은 성립하지 않음.
	}

}
