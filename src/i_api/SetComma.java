package i_api;

import e_oop_score2.ScanUtil;

public class SetComma {

	public static void main(String[] args) {

		// 숫자를 입력받아 입력받은 숫자에 3자리마다 콤마를 붙여 출력해주세요.

		System.out.println("숫자를 입력해주세요>");
		String input = ScanUtil.nextLine();

		int length = input.length();
		int d = 0;
		String c = "";
		String a = "";

		for (int i = length - 1; i >= 0; i--) {
			c += input.charAt(i);
			d++;			
			if (d == 3 && i != 0) {
				c += ",";
				d = 0;
			}
		}
		int length2 = c.length();
		for (int i = length2 - 1; i >= 0; i--) {
			char charAt = c.charAt(i);
			System.out.print(charAt);
		}
		
		System.out.println();
		//교수님 풀이
		int count = 0;
		for(int i = length -1; i >= 0; i-- ) {
			a = input.charAt(i) + a;
			count++;
			if(count % 3  == 0 && count != length) {
				a = "," + a;
			}
		}
		System.out.println(a);
		
		

	}
}
