package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		//탄수화물 자가진단 테스트제작하여 결과가 나올 수 있도록 만들어라
		
		
		System.out.println("======== 탄수화물 중독 자가진단 테스트========");
		//탄수화물 중독 자가진단 테스트 알림
		
		System.out.println("아침을 배불리 먹은 후 점심시간 전에 배가 고프다.(o/x) : ");
		String result1 = s.nextLine();
		
		System.out.println("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다.(o/x) : ");
		String result2 = s.nextLine();
		
		System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다.(o/x) :");
		String result3 = s.nextLine();
		
		System.out.println("정말 배고프지 않더라도 먹을 때가 있다.(o/x) : ");
		String result4 = s.nextLine();
		
		System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다.(o/x) : ");
		String result5 = s.nextLine();
		
		System.out.println("스트레스를 받으면 자꾸 먹고 싶어진다.(o/x) : ");
		String result6 = s.nextLine();
		
		System.out.println("책상이나 식탁위에 항상 과자, 초콜릿 등이 놓여있다.(o/x) : ");
		String result7 = s.nextLine();
				
		System.out.println("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안잡힌다.(o/x) : ");
		String result8 = s.nextLine();
		
		System.out.println("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다.(o/x) :");
		String result9 = s.nextLine();
		
		System.out.println("다이어트를 위해 식이조절을 하는데 3일도 못 간다(o/x) : ");
		String result10 = s.nextLine();		
		//메세지를 하나씩 받아서 o/x를 판별
		
		int num1 = result1.equals("o") ? 1 : 0;
		int num2 = result2.equals("o") ? 1 : 0;
		int num3 = result3.equals("o") ? 1 : 0;
		int num4 = result4.equals("o") ? 1 : 0;
		int num5 = result5.equals("o") ? 1 : 0;
		int num6 = result6.equals("o") ? 1 : 0;
		int num7 = result7.equals("o") ? 1 : 0;
		int num8 = result8.equals("o") ? 1 : 0;
		int num9 = result9.equals("o") ? 1 : 0;
		int num10 = result10.equals("o") ? 1: 0;
		//출력된 값을 숫자로 변환
		
		int x = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		//o/x의 숫자를 센다.
		
		
		if(7 <= x) {
			System.out.println("======중독! 전문가의 상담이 필요함======");
		}else if(4 <= x) {
			System.out.println("======위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함======");
		}else {
			System.out.println("======주위! 위험한 수준은 아니지만 관리 필요=======");
		}
		//숫자에 따라 결과값 출력

	}

}
