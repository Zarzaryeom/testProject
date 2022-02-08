package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - 사칙연산 : +, -, *, /, %(나머지)  
		 * - 복합연산 : +=, -=, *=, /=, %=
		 * - 증감연산 : ++, --
		*/
		
		
		 int result = 10 + 20 - 30 * 40 / 50 % 60; System.out.println(result); result
		 = 10 / 3;  //변수를 부여하지 않고 숫자를 쓰면 int로 계산 System.out.println(result); result =
		 System.out.println(result);
		  
		  
		 //5개의 산술연사자를 사용해 5개의 연산을 수행 후 결과를 출력
		  
			/*
			 * float x = 242 + 3453231 * 341 / 23143 + 341; System.out.println(x);
			 * 
			 * double y = 142 + 413423 * 41231 / 231422 / 2313; System.out.println(y);
			 */
		
		//복합연산
		result = result + 3;
		result += 3;
		result -= 5;
		result *= 2;
		System.out.println(result);
	
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result +10;
		//result = result %5;
		//result = result -2 *3;
		
		result += 10;
		result %= 5;
		result -= 2*3;
		
		//증감연산
		//증감연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다.
		
		int i = 0;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		--i;
		i--;
		
		i = 0;
		System.out.println("++i =" + ++i);
		i = 0;
		System.out.println("i++ =" + i++);
		System.out.println(i);
	
		//피연산자의 타입이 서로같아야만 연산이 가능하다.
		//단, 작은 변수가 큰 변수로 형변환시 자동으로 입력되기에 아래와 같은 식이 성립할 수 있다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double;
		
		//최소 4바이트 이상은되야 컴퓨터가 연산이 가능하기에 byte와 short는 연산 전 int타입으로 형변환이 먼저 일어난다.
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; //연산 전 형변환이 수행된다.
	
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2; 
		//char타입도 2바이트 크기를 갖기에 연산 전 int타입으로 형변환된다.
		System.out.println(_int);
		
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할때 생기는 현상
		byte b = 127;
		b++;
		System.out.println(b); //오버플로우 : 가장 큰 값을 벗어난 경우
		b--;
		System.out.println(b); //언더플로우 : 가장 작은 값을 벗어난 경우
		
		
		//임의의 숫자를 연산한 후 char 타입으로 변환하면 문자가 나올 수 있나?
		int x = 39 + 44;
		char y = (char)x;
		System.out.println(y);

		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 +654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long _x = 123456 + 654321;		
		_x *= 123456;
		_x /= 123456;		
		_x -= 654321;		
		_x %= 123456;
		System.out.println(_x);
		
		
		//3개의 int타입 변수를 선언 및 초기화 한 후 합계와 평균을 구해주세요.
		
		int _a = 5151;
		int _b = 3342;
		int _c = 12;
		int sum = _a + _b + _c;
		double avg = sum / 0.3;
		System.out.println("sum :" + sum +"\t/ avg :" + avg);
		
		
		//반올림
//		avg = Math.round(avg); //소수점 첫째자리에서 반올림해준다.
//		System.out.println(avg);
		avg = Math.round(avg * 10) / 10.0; //소수점 첫째자리를 보고 싶을 때
		System.out.println(avg);
		
		//랜덤값 발생 : Math.random() - 0.0 ~ 1.0 미만
		int random = (int)(Math.random() * 100) + 1; //1~100 사이의 랜덤값을 얻기 위해
		System.out.println(random);
		
		
		
		
		
	}

}
