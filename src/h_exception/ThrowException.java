package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {

		/*
		 * 예외 발생시키기
		 * - throw new Exception();
		*/
		
		//예외 클래스의 객체 생성
		try {
			throw new IOException();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//자주 발생되는 예외 예시
//		1. NullPointerException : null 값을 참조했다.
//		String str = null;
//		System.out.println(str.equals("abc"));
		
//		2. ArrayIndexOutOfBoundsException : 배열이 인덱스의 범위를 벗어났다.
		int[] arr = new int [10];
		
		for(int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
