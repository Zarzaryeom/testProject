package f_game;

public class Character {

		
	String name;   //이름
	int maxHP;     //최대 체력
	int maxMP;	   //최대 마나
	int hp;		   //체력
	int mp;		   //마나
	int att;	   //공격력
	int def;	   //방어력
	int level;     //레벨
	int exp;	   //경험치
	Item[] items;  //보유아이템, 아이템을 저장하기 위해 배열 형태로 생성(클래스로 만들 예정)
	
	
	Character(String name, int hp, int mp, int att, int def){
		this.name = name;
		this.maxHP = hp;
		this.maxMP = mp;
		this.hp = this.maxHP;
		this.mp = this.maxMP;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];		
	}
	
	
	void status() {
		System.out.println("============= 상태 ==============");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "(" + exp + "/100");
		System.out.println("체력 : " + hp + "/" + maxHP);
		System.out.println("마나 : " + mp + "/" + maxMP);
		System.out.println("공격력 : " + att);
		System.out.println("방어력 : " + def);
		System.out.println("============= 아이템 =================");
		for(int i = 0 ; i < items.length; i++) {
			if(items[i] != null) { //아이템 창이 비어있지 않은 경우
				System.out.println(items[i]);
				}
		}
		System.out.println("=================================");		
	}
	
	
	
	void attack(Monster m) {
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage; //데미지가 0 이하일 때 최소한 1만큼의 데미지를 줄 수 있게
		m.hp -= damage <= m.hp ? damage : m.hp; //데미지가 체력보다 클 때, 체력만큼의 데미지만 맏을 수 있게
		System.out.println(name + "가 공격으로" + m.name + "에게" + damage + "만큼 데미지를 주었습니다/");
		System.out.println(m.name + "의 남은 체력 : " + m.hp);				
	}
	
	void getExp(int exp) {
		this.exp += exp;
		System.out.println(exp + "의 경험치를 획득하셨습니다.");
		
		while(100 <= this.exp) {
			levelUp();
			this.exp -= 100;
		}
	}
	
	void levelUp(){
		level++;
		maxHP += 10;
		maxMP += 5;
		att += 2;
		def +=2;
		hp = maxHP;
		mp = maxMP;
		System.out.println("레벨업!");	
		
	}
	
	
	void getItem(Item item) {
		System.out.println(item.name + "을 획득하였습니다.");
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				break;
			}
		}
		maxHP += item.hp;
		maxMP += item.mp;
		att += item.att;
		def += item.def;				
	}
	
	
	
}
