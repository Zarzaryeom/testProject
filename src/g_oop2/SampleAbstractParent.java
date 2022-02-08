package g_oop2;

//추상클래스
public abstract class SampleAbstractParent {

	//내용이 없다는 내용이 있는 메서드
	void method() {
		
	}
	
	//추상메서드
	abstract void abstractMethod();
	
}


class SampleAbstractChild extends SampleAbstractParent {

	@Override
	void abstractMethod() {
		
	}
	
}
