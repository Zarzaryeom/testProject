package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudent {

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
//		for(int i= 0; i < 25; i++) {
//			array[i] =("김" + i);			
//		}
		//이름 25개 만들고 저장하기
//		System.out.println(Arrays.toString(array));
		
		System.out.print("몇명의 사람을 뽑겠습니까?(숫자 제한 : 0~25) : ");
		int num = Integer.parseInt(s.nextLine());
		//사용자가 뽑을 숫자를 입력 받을 수 있는 명령
		
		int[] ary;
		ary = new int[num];
		int ex = ary[0];
		
		for(int i = 0; i < num; i++) {
			int random = (int)(Math.random() * 100)/5;
			//랜덤으로 0~24사이의 숫자를 뽑는다.
			for(int j = 0; j < i; j++) {
				if(ary[i] == ary[j]) i--;
			}
			//중복제거 미완
			ary[i] = random;
			//앞에서 같은 숫자인걸 확인하려면?
			//앞에서 같은 숫자의 랜덤이 나왔으면 다시 변수를 만들어라			
		}
		
//		for(int i = 0; i < num; i++) {
//			for(int j = 0; j < num; j++) {
//				if(ary[i] == ary[j+1]) {
//					ary[i] = (int)(Math.random() * 100)/5;
//			}else break;
//			}
//		}
		//중복제거 미완
		for(int i = 0; i < num; i++) {
			System.out.print(array[ary[i]]+"  ");
		}		
		//랜덤 배열에서 숫자를 하나씩 뽑아 이름 배열에서 이름을 뽑아내는 명령
		//배열을 만들어 25칸짜리 문자열을 저장할 수 있도록 한다.
		
	}

}
