package e_oop;

public class AirCon {

	
	/*
	 * 에어컨의 변수 : 전원, 온도, 풍향, 풍속, 설정
	 * 에어컨의 메서드 : 변수를 조작할 수 있는 명령어
	 *  - 전원을 키거나 끄는
	 *  - 온도를 올리거나 내리는
	 *  - 풍향을 변경하는
	 *  - 설정을 조절하는
	 *   - 클래스를 만드는 방법
  		-> 클래스 : 변수(속성) + 메서드
  		-> 속성 : 대상이 가지고 있는 특징 중 변할 수 있는 것
  		-> 메서드 : 대상이 하는 동작, 행동
	*/
	
	
	final
	//변수를 만들었을 때 변수에 있는 값이 저장되면 변경이 안되게 한다, 상수라고 부른다.
	
	
	
	
}

//변수 만들기
//에어컨이 꺼져 있을 때 온도를 변경하지 못한다.
//에어컨의 온도가 최대, 최솟값이 있다.
//풍향의 설정을 5개의 설정을 반복하며 돌아가야 된다.
//풍속은 4가지 설정을 반복하며 돌아가야 된다.
//설정은 : 냉방, 제습, 난방이 3가지의 옵션이 있다.
class Control{
	boolean Power = true; // 전원, 기본값 : false
	int temper = 20; // 온도(최소 18, 최대 32)
	String windway;//풍향
	int speed;//풍속
	String option = "냉방";//설정
	
	//전원 메서드
	void power() {
		Power = false;
	}
	
	//온도 조절 메서드
	//온도를 올리는 메서드
	void temperControlP() {
		if(temper < 32) {
			temper++;
			}
		}
	
	//온도를 낮추는 메서드
	void tmperControlM() {
		if(temper > 18) {
		temper--;
		}
	}
	
	//풍향설정 메서드
	void windwayControl() {
		int a = 0;
		a++;
		
		if(a == 0) {
			System.out.println("상");
		}else if(a == 1) {
			System.out.println("중상");
		}else if(a == 2) {
			System.out.println("중");
		}else if(a == 3) {
			System.out.println("중하");
		}else if(a == 2) {
			System.out.println("하");
		else a = 0;
		return 
	}
	
	//풍속설정 메서드
	int speedControl() {
		if(speed > 5) {
			speed = 0;
		}else speed++;
	}
	
	//설정 매서드
	void optionControl() {
		int b = 0;
		b++;
		
		if(b == 0) {
			System.out.println("제습");
		}else if(b == 1) {
			System.out.println("난방");
		}else {
			b = 0;
			System.out.println("냉방");
		}		
	}
}


