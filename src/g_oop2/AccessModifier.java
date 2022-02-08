package g_oop2;

public class AccessModifier {
	
	public String publicVar = "public : 접근제한이 없음";
	protected String protectedVar
		= "protected : 같은 패키지 + 상속받은 클래스에서 접근 가능";
	String defaultVar = "default : 같은 패키지에서만 접근 가능";
	private String privateVar = "private : 클래스 내에서만 접근 가능";
	
	public void publicMethod() {
		System.out.println(publicVar);
	}
	
	protected void protectedMethod() {
		System.out.println(protectedVar);
	}
	
	void defaulMethod() {
	System.out.println(defaultVar);
	}

	private void privateMethod() {
		System.out.println(privateVar);
	}
	
	
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaulMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		//데이터를 보호하기 위한 예
		Time t = new Time();
		
//		t.hour = 14;
//		t.minute = 9;
//		t.second = 99;
		t.setHour(16);
		t.setMinute(9);
		t.setSecond(-7);
		
		System.out.println(t);
		
		
		//사용하는데 불필요한 멤버를 숨기기 위해
		t.clock();
		
		
		
		
		
	}
	

	
	
}



