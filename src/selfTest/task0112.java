package selfTest;

import java.util.Arrays;
import java.util.Scanner;

public class task0112 {

	public static void main(String[] args) {

		
		//배열을 만들어 25칸짜리 문자열을 저장할 수 있도록 한다.
		//배열에는 이름을 저장한다.
		//그중에서 랜덤으로 몇명을 뽑고(몇명을 뽑을지는 사용자에게 입력을 받는다.) 뽑은 사람을 출력
		//뽑는 사람은 중복이 되면 안된다!
		//이러한 프로그램을 완성하라
		Scanner s = new Scanner(System.in);
		
		String[] array = {"김0", "김1", "김2", "김3", "김4","김5","김6",
				"김7","김8","김9","김10","김11","김12","김13","김14","김15"
				,"김16","김17","김18","김19","김20","김21","김22","김23","김24"};
		
		//랜덤하게 0~24명의 사람을 뽑는 명령어
		int random = (int)(Math.random() * 100)/5;
		
		//배열을 중복되지 않게 뽑을 명령어
		//배열(array) 자체를 섞어주고 앞에서부터 사람을 뽑는다.
		String temp = null;
		for(int i = 0; i < array.length * 10; i++) {
			int x = (int)(Math.random() * 100)/5;
			temp = array[x];
			array[x] = array[0];
			array[0] = temp;				
		}
		System.out.println(Arrays.toString(array));
		
		
		
	}

}
