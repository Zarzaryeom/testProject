package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * - &&(AND), ||(OR), !(NOT)
		 * - and와 or은 비교연산자를 연결하는 역활
		 * - 피연사자로 boolean만 허용한다. 
		*/
		
	
	
		int x = 10;
		int y = 20;
		
		boolean b = 0 < x && x < 10 || x < y; 
		//비교연산이 논리연산보다 우선순위가 높다.
		//&&와 || 중 위치에 상관없이 &&가 먼저 실행된다.
		
		b =!(x < y); //조건식의 결과를 반대로 저장한다.
					 //!의 범위를 지정하기 위해 항상 괄호가 필요하다.
		
		//효율적 연산
		b = true && true; // true
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
		//&&경우 왼쪽에 false인 경우 오른쪽을 확인하지 않고 false를 답한다.
		
		b = true || true; //true
		b = true || false; //true
		b = false || true; //true
		b = false || false; //true
		
		
		int a = 10;
		b = a < 5 && 0 < a++;
		System.out.println(a);
		//의도대로 작동하지 않는 예, 오른쪽의 a++은 작동하지 않고 작업이 수행된다
		
		
		
		//다음의 문장들을 코드로 작성하시오.
		//1. x가 y보다 크고 x가 10보다 작다.
		b = x > y && x < 10;
        //2. x가 짝수이고 y보다 작거나 같다.
		b = x % 2 == 0 && x <= y;
		//3. x가 3의 배수이거나 5의 배수이다.
		b = x % 3 == 0 || x % 5 == 0;
		
	
	}

}
