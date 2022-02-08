package f_game;

public class Monster {

	
	String name;   //이름
	int maxHP;     //최대 체력
	int maxMP;	   //최대 마나
	int hp;		   //체력
	int mp;		   //마나
	int att;	   //공격력
	int def;	   //방어력
	int level;     //레벨
	int exp;	   //경험치
	Item[] items;  //보유아이템
	
	
	//생성자를 만들어 변수 초기화
	Monster(String name, int hp, int mp, int att, int def, int level, int exp, Item[] items){
		this.name = name;
		this.maxHP = hp;
		this.maxMP = mp;
		this.hp = this.maxHP;
		this.mp = this.maxMP;
		this.att = att;
		this.def = def;
		this.level = level;
		this.exp = exp;
		this.items = items;				
	}
	
	
	void attack(Character c) { // 공격 메서드
		int damage = att - c.def;
		damage = damage <= 0 ? 1 : damage; //데미지가 0 이하일 때 최소한 1만큼의 데미지를 줄 수 있게
		c.hp -= damage <= c.hp ? damage : c.hp; //데미지가 체력보다 클 때, 체력만큼의 데미지만 맏을 수 있게
		System.out.println(name + "가 공격으로" + c.name + "에게" + damage + "만큼 데미지를 주었습니다/");
		System.out.println(c.name + "의 남은 체력 : " + c.hp);				
	}
	
	Item itemDrop(){//아이템 드롭 메서드
		return items[(int)(Math.random() * items.length)];
		//아이템을 사용자에게 돌려줘야하기에 return 타입이 있다.
	}	
	
	
}
