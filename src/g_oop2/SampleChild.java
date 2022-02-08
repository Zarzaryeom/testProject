package g_oop2;

public class SampleChild extends SampleParent{

	void childmethod() {
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var); //상속받은 변수
		System.out.println(method(7,13)); // 상속받은 메서드
	}
	
	//상속으로 인해 추가되는 개념
	//오버라이딩 : 상속받은 메서드의 내용을 바꾸는 것
	//super : 부모클래스의 멤버와 자식클래스 멤버의 이름이 같은 때
	//super() : 자식클래스의 생성자에서 부모클래스의 생성자를 호출할 때 
	//다형성 : 부모타입의 변수로 자식타입의 객체를 사용하는 것
	
	
	
	
	//오버라이딩 : 상속받은 매서드의 내용을 재정의 하는 것
	@Override //어노테이션 : 클래스, 변수. 메서드 등에 표시해 놓는 것
	int method(int a, int b) {//리턴타입, 매서드명 파라미터 모두 같아야 한다.
		return a*b;
	}
	
	//super, super()
	int var;
	
	void test(double var) {
		System.out.println(var); //지역변수
		System.out.println(this.var); // 인스턴스 변수
		System.out.println(super.var); // 부모 클래스의 인스턴스 변수
		//super : 부모 클래스의 멤버와 자식클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
	}
	
	
	SampleChild(){
//		this(); // 같은 클래스 내에 있는 다른 호출자 호출
		super(); //부모클래스의 생성자 호쿨
		//this와 super는 모두 생성자 첫줄에 생성해야 한다.
		//그렇기에 둘이 한번에 같이 사용할 수 없다.(this가 없는 생성자에서만 super()을 호출한다.)
		}
	
	
	//다형성 : 부모타입의 변수로 자식타입의 객체를 사용하는 것
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		
		SampleParent sp = new SampleChild(); //다형성
		//변수(부모)의 타입에 있는 멤버만 사용할 수 있다.
		System.out.println(sp.var);
		sp.method(10, 20);
		
		//객체(자식)의 타입에 있는 멤버는 사용할 수 없다.
//		sp.childMethod(); //사용불가
//		sp.test(); //사용불가
		
	}
	
	
}
