package g_oop2.test;

import g_oop2.AccessModifier;
import g_oop2.Time;

public class AccessTest extends AccessModifier{

	public static void main(String[] args) {

		
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
		//상속을 받아도 자기 내용처럼 사용을 해야 접근이 가능하다(예시1에 사용 방법)
		
//		System.out.println(am.defaultVar);
//		am.defaulMethod();
		
//		System.out.println(am.privateVar); 접근 불가능
//		am.privateMethod();
		
		
		//예시1
		AccessTest at = new AccessTest();
		
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
		/*
		 * 접근제어자를 사용하는 이유
		 * - 데이터를 보호하기 위해
		 * - 사용하는데 불필요한 멤버를 숨기기 위해
		*/

	}

}
