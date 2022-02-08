package e_oop_score2;

public class Game {		

		int BOSS[] = {100, 200, 350, 550, 800, 1050};
		int a = 0;
		boolean Start = false; //게임 스타트
		boolean AttStart = false; //전투 돌입
		
		void Starts() {
			Start = !Start;
			System.out.println(Start ? "**** 게임 시작 ****" : "**** 게임 종료 ****");
			if(Start = true) {
				System.out.println("--- 던전에 진입하였습니다. 주사위를 던져 보스를 물리치세요! ---");
			}else System.out.println("--- 아쉽군요 다음에 다시 도전해보세요! ---");
		}
						
		//공격 방식 선택
		void choice(){
			//공격 방식 선택
			if(Start) {
			System.out.println("---------공격 방식을 선택하세요---------");
			System.out.println("4.발차기(13점 이상)\t5.휘두르기(11점 이상)\t6.찌르기(8점 이상)");
			}
		}
		
		
		//랜덤 주사위 굴리기(앞으로 굴리기, 옆으로 굴리기, 던지기)
		int Dice;
		int Att; //다이스 3번 던져 나온 숫자의 합
		int i = 1;
		void DiceControl() {
			if(Start) {
			while(i < 4) {
//			System.out.println("---------주사위를 던질 방법을 선택하세요---------");
//			System.out.println("오른쪽으로 던지기\t\t중앙으로 던지기\t\t왼쪽으로 던지기");
//			System.out.println("   1   \t\t\t   2   \t\t\t   3   ");
			Dice = (int)(Math.random() * 6.1);
			Att += Dice;
			System.out.println(i + "횟차 누적 주사위 점수 : " + Att);
			i++;			
			}
			}
		}
		
		//공격 테이블(3개의 공격 방식)		
		int damage; // 공격 데미지		
		//1번 방식 : 50 ~ 100사이 랜덤한 공격 13점 이상
		void AtackTable1() {
			if(Start) {				
			if(Att > 12) {
				damage = 100 - (int)(Math.random() * 50);
				System.out.println(damage + "의 데미지를 주었습니다!");
			}else {
				damage = 0;
				System.out.println("공격이 빗나갔습니다!!");
			}
			}
		}		
		//2번 방식 : 10 ~ 100사이 랜덤한 공격 11점 이상
		void AtackTable2() {
			if(Start) {				
			if(Att > 10) {
				damage = 100 - (int)(Math.random() * 90);
				System.out.println(damage + "의 데미지를 주었습니다!");
			}else {
				damage = 0;
				System.out.println("공격이 빗나갔습니다!!");
			}
			}
		}
		//3번 방식 : 20 ~ 50사이 랜덤한 공격 8점 이상
		void AtackTable3() {
			if(Start) {
			if(Att > 7) {
				damage = 50 - (int)(Math.random() * 30);
				System.out.println(damage + "의 데미지를 주었습니다!");
			}else {
				damage = 0;
				System.out.println("공격이 빗나갔습니다!!");
			}
			}
		}		
		
		//보너스 카드
		/*
		 * 확정 공격 +30(1회)
		 * 공격력 업그레이드 +10(지속)
		 * 공격 테이블 기회 +1(1회)
		*/
		
		
		//전투 메서드
		void Fight() {
			if(Start) {
			
			if(a > 6) {
				System.out.println("******축하합니다!! 승리하셨습니다!!!*****");
			}else {
				int result = BOSS[a] - Att;
				System.out.println("보스 남은 체력 : " + result);			
				if(result < 0) {
					System.out.println("축하합니다!! 다음레벨로 진행합니다!");
					a++;			
					}
				}
			}
		}
		
		

		
		
		

	//주사위 던전 게임
	public static void main(String[] args) {
		Game gm = new Game();
		System.out.println("시작 하시려면 1번을 입력해주세요");
		
		while(true) {
			int intput = ScanUtil.nextInt();			
			System.out.println("\n\n\n");
			System.out.println("단축키 : 1.게임종료 2.공격방식보기 3.주사위 4.전투 5.공격1 6.공격2 7.공격3");
			
			switch(intput) {
			case 1: gm.Starts(); break;
			case 2: gm.choice(); break;
			case 3: gm.DiceControl(); break;
			case 4: gm.Fight(); break;
			case 5: gm.AtackTable1(); break;
			case 6: gm.AtackTable2(); break;
			case 7: gm.AtackTable3(); break;
						
			}		
		}		
	}
	
	
	
}
