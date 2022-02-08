package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Finally {

	public static void main(String[] args) {
		
		/*
		 * finally
		 * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
		 * - finally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
		 * 
		 * 자동 자원 반환
		 * - try(변수 선언; 변수 선언) {} catch(Exceptionin e) {}
		 * - 사용 후 반환이 필요한 객체를 try ()안에 선언하면 try 블럭 종료시 자동으로 반환된다.
		 * 
		*/
		
		
		FileInputStream fis = null; //파일 읽기
		
		try {
			fis = new FileInputStream("d:/file.txt");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close(); //파일을 읽고 반환하는 메서드
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		//반드시 예외처리를 해야되는 경우이기에 컴파일 에러 발생 -> suround / try 사용
		
		
		
		
		
		//자동 자원 반환(JDK1.7)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
			String str = "저녁 뭐 먹지";
			
			byte[] bytes = str.getBytes();
			
			for(int i = 0; i < bytes.length; i++) {
				fos.write(bytes[i]);
			}					
		}catch(Exception e) {
			e.printStackTrace();
		}
		// FileOutputStream : 파일을 쓰기(만들기) 위한 클래스
		
		
		
		
		
		
		
	}

}
