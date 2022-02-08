package selfTest;

import java.util.Scanner;

public class task0106 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String answer = null;
		int sum = 0;
		
		System.out.print("아침");
		answer = s.nextLine();
		if(answer.equals("Y")) sum++;
		
		if(sum < 3) {
			System.out.println("안전!");
		}else if(sum == 3) {
			System.out.println("주의!");
		}else {
			System.out.println("중독!");
	}
}
}

