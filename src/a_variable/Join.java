package a_variable;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		//다음과 같은 프로그램을 작성해주세요
		/*
		 * =====================회원가입 =======================
		 * 아이디>admin
		 * 비밀번호(4자리숫자)>1234
		 * 이름>홍길동
		 * 나이>99
		 * 키>185.5
		 * 
		 * ==================================================
		 * 회원가입 완료!!
		 * ===================== 내 정보 ======================
		 * 아이디 : admin
		 * 비밀번호 : 1234
		 * 이름 : 홍길동
		 * 나이 : 99세
		 * 키 : 185.5cm
		 * ==================================================
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============== 회원가입 ===============");
		//회원가입을 알려주는 명령
		System.out.print("아이디>");
		String userId = sc.nextLine();
		//유저 아이디를 입력
		System.out.print("비밀번호(4자리숫자)>");
		int pass = Integer.parseInt(sc.nextLine());
		//유저 비밀번호를 입력
		System.out.print("이름>");
		String userName = sc.nextLine();
		//유저 이름을 입력
		System.out.print("나이>");
		int userAge = Integer.parseInt(sc.nextLine());
		//유저 나이를 입력
		System.out.print("키>");
		float userHeight = sc.nextFloat();
		//유저 키를 입력
		
		System.out.println("\n=====================================");
		System.out.println("회원가입 완료!!");
		System.out.println("=============== 내 정보 ===============");
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + pass);
		System.out.println("이름 : " + userName);
		System.out.println("나이 : " + userAge);
		System.out.println("키 :" + userHeight);
		System.out.println("=====================================");
		//사용자에게 입력된 정보들을 한눈에 보여주기 위한 명령어 집단
		
		
	}

}

