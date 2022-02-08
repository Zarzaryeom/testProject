package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - <, >, <=, >=, ==, !=(다르다는 의미)
		 * - 문자열 비교 : equals()
		*/	
		
	
		
		int x = 10;
		int y = 20;
		
		boolean b = x < y;
		System.out.println(b);
		
		b = x <= y - 15; //산술연산자가 비교연산자에 비해 우선순위가 높다.
		System.out.println(b);
	
		
		String str1 = "abc";
		String str2 = "ABC";
		
		b = str1 == str2; //문자열이기에 ==로 비교할 수 없다.
		System.out.println(b);
		
		b = str1.equals(str2); // !str1.equals(str2), 느낌표를 사용해서 연산의 결과를 뒤집을 수 있다. 
		System.out.println(b);
		
		
		//다음의 문장들을 코드로 작성해주세요.
		//x는 y보다 작거나 같다.
		b = x <= y;
		//x + 5와 y는 같다.
		b = x + 5 == y;
		//y는 홀수이다.
		b = 1 == y % 2;
		//"기본형"과 "참조형"은 다르다.
		String st1 = "기본형";
		String st2 = "참조형";
		b = !st1.equals(st2);
		
		
		
	}
	

}
