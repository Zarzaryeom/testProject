package f_game_task;

import e_oop_score2.ScanUtil;

public class Game {		

	//게임 설명
	void rule() {
		System.out.println("* 게임 설명 - 주사위를 던져 공격을 시도해 보스를 잡고 스테이지를 클리어 하세요!\n"
				+ "* 게임 룰\r\n"
				+ "  1. 보스와 조우 시 공격을 5회 시도하여 보스의 체력을 깍아라\n"
				+ "  2. 공격 1회를 시도하기 위해 3번의 주사위를 던질 수 있다.\n"
				+ "  3. 한 레벨을 클리어하면 3개의 보상 중 랜덤한 보상을 받을 수 있다.");
	}
		
	//주사위 던전 게임
	public static void main(String[] args) {
		Game g = new Game();
		Dungeon dg = new Dungeon();
		System.out.println("------------------ 주사위 던전에 오신걸 환영합니다. ------------------");		
	Start : while(true) {
			System.out.println();
			System.out.println("\t1.게임방법 설명\t 2.던전 들어가기\t  0.게임 종료");
			int intput = ScanUtil.nextInt();			
			switch(intput) {
			case 1: //게임방법 설명
				g.rule();
				break;
			case 2: //던전 들어가기
				dg.enterStart(); 
				break;
			case 0: //게임 종료
				System.out.println("게임이 종료됩니다.");
				System.exit(0);			
				
			}		
		}		
	}
	
	
	
}
