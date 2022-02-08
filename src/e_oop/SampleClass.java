package e_oop;

public class SampleClass {
	/*
	 * - 매서드 : 변수를 가지고 할 일
	 * - 선언 방법 : 리턴타입 매서드명(파라미터){}
	 * - 파라미터(매개변수) : 실행에 필요한 정보
	 * - 리턴타입(반환타입) : 실행 후 돌려줘야하는 결과물
	*/
	
	String method(int parameter, String str) {
		return parameter + " 를 받아 명령을 수행하고 결과를 리턴하는 매서드";
	}
	
	void method2(){
		System.out.println("파라미터도 리턴타입도 없는 메소드");
	}
	
	
	void flowTest1() {
		System.out.println("flowTest1 시작 : 1");
		flowTest3();
		System.out.println("flowTest1 종료 : 6");
	}

	void flowTest2() {
		System.out.println("flowTest2 시작 : 3");
		System.out.println("flowTest2 종료 : 4");
	}
	
	void flowTest3() {
		System.out.println("flowTest3 시작 : 2");
		flowTest2();
		System.out.println("flowTest3 종료 : 5");
	}
	
	
	
}
