package f_game;

public class Item {

	String name;   //이름
	int hp;		   //체력
	int mp;		   //마나
	int att;	   //공격력
	int def;	   //방어력
	
	Item(String name, int hp, int mp, int att, int def){
		this.name =name;
		this.hp = hp;
		this.mp = mp;
		this.att = att;
		this.def = def;
	}
	
	//아이템의 정보를 제공하는 메서드
	//toString 객체의 주소가 아닌 값을 출력하게 해주는 메서드, return된 정보가 출력된다.
	public String toString() {
		String info = name + " :";
		if(0 < hp) info += " 체력+" + hp;//문자열과 숫자 변수가 합쳐져 문자열로 취급
		if(0 < mp) info += " 마나+" + mp;
		if(0 < att) info += " 공격력+" + att;
		if(0 < def) info += " 방어력+" + def;
		//아이템이 늘려주는 능력치가 0보다 큰 경우만 보여주도록

		return info;
 	}
	
	
	
	
}
