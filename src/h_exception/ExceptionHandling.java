package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {

	/*
	 * 에러
	 * - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄)
	 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
	 * - 런타임 에러 : 실행 시에 발생되는 에러(콘솔창 빨간글씨)
	 * 
	 * 런타임 에러
	 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
	 * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류
	 * - 예외 : 프로그럼 코드에 의해서 수습될 수 있는 다소 미약한 오류
	 * 
	 * 예외
	 * - 모든 예되는 Exception 클래스의 자식 클래스이다.
	 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.
	 * - [RuntimeException 클래스와 그 자식들을 제외한]
	 *   Exception 클래스의 자식들은 예외처리가 강제된다.
	 *   
	 * 
	 * 예외처리(try-catch)
	 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
	 * - try{} catch(Exception e) {}
	 *  -> try에서 예외가 발생하면 catch가 예외 클래스를 적어준다.
	 *     이때 예외의 타입과 발생한 오류의 타입이 일치하면 빠져나간다.
	 *     일치하지 않으면 에러가 발생된다.
	 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
	 * - catch의 파라미터로 처리할 예외를 지정해줄 수 없다.
	 * - 발생한 예외와 일치하는 catch블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
	 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
	 * 
	*/
		//try catch로 잡아만 줘도 프로그램은 실행이 된다.
//		try {		
//		int result = 10 / 0;
//		System.out.println(result);
//		} catch(ArithmeticException e) {
//			e.printStackTrace(); //예외 메세지를 똑같이 출력하는 메서드
//		}
		
		//try안에 여러개의 예외처리가 필요할 때 방법 1
//		try {		
//			int result = 10 / 0;
//			System.out.println(result);
//			} catch(ArithmeticException | IndexOutOfBoundsException e) {
//				e.printStackTrace(); //예외 메세지를 똑같이 출력하는 메서드
//			}

		//try안에 여러개의 예외처리가 필요할 때 방법 2
//		try {		
//			int result = 10 / 0;
//			System.out.println(result);
//			} catch(ArithmeticException e) {
//				e.printStackTrace(); //예외 메세지를 똑같이 출력하는 메서드
//			} catch(NullPointerException e) {
//				
//			} catch(Exception e) {
//				//변수에 Exception을 넣으면 모든 예외를 다 처리할 수 있다.
//				//Exception은 부모 케이스이기에 다용성 성질로 인해 가능한 방법
//			}

		//예외문 분석
//		java.lang.ArithmeticException: / by zero
//		 ->예외가 발생하여 타입을 부여			 -> 예외가 발생한 이유
//		at h_exception.ExceptionHandling.main(ExceptionHandling.java:39)
//		 -> 예외가 발생한 위치
		
		
		test1();
		
		
	}

	private static void test1() {
		test2();
	}

	private static void test2() {
//		System.out.println(10 / 0);
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	//예외 메세지
//	메서드가 실행된 순서대로 출력
//	가장 위에있는 위치에 들어가면 그곳에 문제가 있을 가능성이 제일 높다.
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at h_exception.ExceptionHandling.test2(ExceptionHandling.java:83)
//	at h_exception.ExceptionHandling.test1(ExceptionHandling.java:79)
//	at h_exception.ExceptionHandling.main(ExceptionHandling.java:73)


}






