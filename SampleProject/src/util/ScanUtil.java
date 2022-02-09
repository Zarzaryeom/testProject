package util;

import java.util.Scanner;

public class ScanUtil {

	private static Scanner s = new Scanner(System.in);
	
	public static String nextLine() {
		String input = null;
		try {
		input = s.nextLine();
		}catch(Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요>");
			input = nextLine();
		}		
		return input;
	}
	
	public static int nextInt() {
		int input = 0;
		try {
		input = Integer.parseInt(s.nextLine());
		}catch(Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요>");
			input = nextInt(); //반복하여 잘못 입력하였을 시 반복해주는 명령어
							//재귀호출 : 메서드 안에서 자기 자신을 호출하는 것
		}
		return input;
	}	
	
}
