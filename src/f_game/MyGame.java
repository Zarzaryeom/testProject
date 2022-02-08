package f_game;

import e_oop_score2.ScanUtil;

public class MyGame {

	//게임에 등장하는 것들을 변수로 만들기
	Character c;
	Item[] items;
	
	MyGame(){
		c = new Character("가렌", 100, 50, 20, 10);
		
		items = new Item[10];
		items[0] = new Item("무한의대검", 0, 0, 10, 0);
		items[1] = new Item("가시갑옷", 0, 0, 0, 10);
	}
	
	
	
	
	
	public static void main(String[] args) {
		//객체 생성을 해야 클래스에서 메서드들을 쓸 수 있다. : new MyGame().c
//		System.out.println(new MyGame().c);
		
		new MyGame().start(); // 메인 메서드에서 메서드를 호출해서 사용, 
							  //객체를 생성하지 않아도 변수 생성 가능
				
	}
	
	void start() {
		while(true) {
			System.out.println("1.내정보 2.사냥 0.종료>");
			int input = ScanUtil.nextInt(); //사용자에게 입력 받는 명령어
			
			switch(input) {
			case 1: c.status(); break; //정보창
			case 2: hunt(); break; //사냥하는 내용
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0); //프로그램을 종료시키는 메서드(강제 종료)
			}
		}
	}
	
	//사냥 메서드
	void hunt() {
		Monster m = new Monster("고블린", 20, 10, 15, 10, 1, 150,
				new Item[] {items[0], items[1]});
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true) {
			System.out.println("1.공격 2.도망>");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1: //캐릭터가 먼저 공격하고 그 다음 몬스터 공격
				c.attack(m);
				if(m.hp <= 0) {
					System.out.println(m.name + "을 처치하였습니다.");
					c.getExp(m.exp);
					c.getItem(m.itemDrop());
					break battle;
				}
				m.attack(c);
				break;
			case 2:
				System.out.println(m.name + "으로부터 도망쳤습니다.");
				break battle;
			}
		}
	}

	
	
	
	
}


