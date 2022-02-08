package a_variable;//패키지 : 클래스의 위치

import java.util.Scanner;  // 단축키 : Ctrl + Shift + o

public class Variable {//클래스 : 자바 프로그램의 구성요소(데이터)

	public static void main(String[] args) {//메서드 : 명령문의 집합
		// 주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용)
		
	long a = 30000000000000L;
	float b = 3.14f;
	char c = '가';
	boolean d = true; //true, false만 사용 가능
	String e = "가나다라";

	//9가지 타입을 모두 사용해 9개의 변수를 선언(변수를 만들다) 및 초기화(변수의 값을 저장) 하라
	
	byte    f = 2;
	short   g = 15;
	int     h = 43415;
	long    i = 313498102394801923L;
	float   j = 124.3414F;
	double  k = 124398520985.23981023;
	char    l = '나';
	boolean m = false;
	String  n = "자바스터디";
		
	
	int _int = 10;
	long _long = 20L;
	_int = (int)_long;
	_long = _int;
	
	//변수 3개를 선언해 변수의 타입과 다른 타입의 값으로 초기화 해라
	
	float _fla = 2341.523f;
	short _sho = 30;
	double _dou = 4125.341249394;
	char _ch = '위'; 
			
	_fla = _sho;
	_ch = (char)_dou;
	
	//출력(콜솔)
   System.out.print("출력");
   System.out.println("출력 후 줄바꿈");
   System.out.printf("출력 포멧 지정");
	
   //탈출 문자
   System.out.println("탭은\t4칸에 맞춰 띄워줍니다.");
   System.out.println("줄바꿈을\n해줍니다.");
   System.out.println("\"쌍타옴표를 넣어줍니다\"");
   System.out.println("\\역슬래시를 넣어줍니다.");
   
   //입력
   Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
   
	/*
	 * System.out.println("아무 문자열이나 입력해주세요"); 
	 * String str = sc.nextLine();
	 * System.out.println("입력받은 내용 :" + str);
	 */
   
//   System.out.print("숫자를 입력해주세요>");
//   int nextInt = sc.nextInt();
//   System.out.println("입력받은 숫자 : " + nextInt);
//   
//   System.out.print("숫자 입력>");
//   int num = Integer.parseInt(sc.nextLine());
//   System.out.println("입력받은 숫자 :" + num);

	
   //자신의 이름을 저장할 변수를 선언하고 Scanner를 사용해 변수에 이름을 저장해라
   System.out.print("이름을 입력해주세요 :\t");
   String name = sc.nextLine();

   
//   //자신의 나이를 저장할 변수를 선언하고 Scanner를 사용해 변수에 나이를 저장해라
   System.out.print("나이를 입력해주세요 :\t");
   int age = Integer.parseInt(sc.nextLine());
   
   //이름과 나이를 출력해주세요
   System.out.println(" 이름 :" + name + "\n 나이 :" + age);
  

   
   
	}
}

