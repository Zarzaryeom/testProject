package e_oop.restaurant;

import java.util.Arrays;

public class Alba {

	//주문받는 메서드
	//주문받기 위해 필요한 것? 파라미터 : 없음
	//주문받은 후 보스에게 줄 것? 리턴 : 주문서
	String[] order() {
		System.out.println("주문 하시겠습니까?");
		return new String[] {"짜장면","탕수육"};
	}
	
	
	
	
	//서빙하는 메서드
	//서빙하기 위해 필요한 것? 파라미터 : 음식
	//서빙 후 보스에게 줄 것? 리턴 : 없음
	
	void serving(String[] foods ) {
		System.out.println(Arrays.toString(foods) + " 여기 나왔습니다. 맛있게 드세요.");
	}
	
	
	
	//계산 메서드
	//계산하기 위해 필요한 것? 파라미터 : 주문서
	//계산 후 보스에게 줄 것? 리턴 : 없음
	
	void pay(String[] order) {
		System.out.println("2만원입니다. 안녕히가세요.");
	}
	
	
}
