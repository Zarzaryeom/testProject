package e_oop;

public class ClassMaker {

	//전역변수(메소드 밖의 변수) 하나를 선언 및 초기화 해주세요.
	int num = 5;
	
	//리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 출력해주세요.
	void example() {
		System.out.println(num);
	}
	
	
	
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 리턴해주세요.
	int method() {
		return num;
	}
	//리턴을 설정한 후 리턴이 지정되지 않으면 컴파일 에러 표시가 뜬다.

	//리턴타입은 없고 파라미터가 있는 메서드 하나 만들어주세요.
	//메서드 안에서 파라미터를 출력해주세요.
	void method2(int num2){		
		System.out.println(num2);
		return; // 메서들를 종료시키는 역할
	}
	
	void method3(int num2){
		if(num2 == 2) {
			return; // 메서드를 중간에 종료시킬 수도 있다
		}
		System.out.println(num2);
	}

	
	//int타입의 리턴타입과 int타입의 파라미터 두개가 있는 매서드 하나를 만들어주세요
	//메서드 안에서 두 파라미터를 곱한 결과를 리던해주세요.
	int method3(int num3, int num4) {
		return num4 * num3;
	}
	
	
	
	
	
	
	
}
