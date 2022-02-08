package f_game_task;

import java.util.Arrays;

import e_oop_score2.ScanUtil;

public class Bonus {

	int level = 1; //던전 레벨	
	int bAtt; // 보너스 확정 공격
	String  sbAtt; //보너스 확정 공격 설명
	static int bContineAtt; // 보너스 지속 공격
	String  sbContineAtt; //보너스 지속 공격 설명
	int bAttchance; // 보너스 공격 테이블 기회
	String  sbAttchance; // 보너스 공격 테이블 기회 설명
	int ebAtt; //이벤트 - 확정 공격
	String sebAtt;
	int ebDice; //이벤트 - 주사위 점수 추가
	static String sebDice;
	int trapBossHP; //이벤트 패널티 - 보스 체력
	static String strapBossHP;

	static String[] items =new String[5]; // 인벤토리 크기

	
	//Exception in thread "main" java.lang.StackOverflowError
	//무슨 오류인가?
	//자식 클래스 -> 부모클래스 -> 제3의 클래스 구조?
	
	//보너스 부여 메서드	
	void bossBonusCard() {		
		while(true) {
		System.out.println("*********************************************************");
		System.out.println("\t보스가 사라진 자리에 반짝이는 3개의 카드가 생성되었습니다.");
		System.out.println("*********************************************************\n");
		System.out.println("\t      - 당신은 하나의 카드를 선택할 수 있습니다. -\n");
		System.out.println("  반짝이는 파란색 카드      반짝이는 노란색 카드\t 반짝이는 빨간색 카드");
		System.out.println("       (1)\t\t   (2)\t\t       (3)");
		int input = ScanUtil.nextInt();		
		if(input == 1 || input == 2 || input == 3) {
			int bossBonusRandom = (int)(Math.random() * 3) + 1;		
			switch(bossBonusRandom) {
			case 1:
				bossBonus1();
				System.out.println("\t@@@   " + sbAtt +"   @@@");
				inveninput(sbAtt);
				inven();
				return;
			case 2:
				bossBonus2();
				System.out.println("\t@@@   " + sbContineAtt +"   @@@");
				return;
			case 3:
				bossBonus3();
				System.out.println("\t@@@   " + sbAttchance +"   @@@");
				inveninput(sbAttchance);
				inven();
				return;
				}			
			}
		}
	}
	
	void eventBonusCard() {
		while (true) {
			System.out.println("*********************************************************");
			System.out.println("\t\t 빛나는 3개의 카드를 발견하었습니다.");
			System.out.println("*********************************************************\n");
			System.out.println("\t      - 당신은 하나의 카드를 선택할 수 있습니다. -\n");
			System.out.println("   빛나는 파란색 카드\t      빛나는 노란색 카드\t  빛나는 빨간색 카드");
			System.out.println("       (1)\t\t   (2)\t\t       (3)");
			int input = ScanUtil.nextInt();
			if (input == 1 || input == 2 || input == 3) {
				int eventBonusRandom = (int) (Math.random() * 2) + 1;
				switch (eventBonusRandom) {
				case 1:
					eventBonus1();
					System.out.println("\t@@@   " + sebAtt + "   @@@");
					inveninput(sebAtt);
					inven();
					return;
				case 2:
					eventBonus2();
					System.out.println("\t@@@   " + sebDice + "   @@@");
					inveninput(sebDice);
					inven();
					return;
				}
			}
		}
	}
	
	
	//아이템을 인벤토리에 넣은 메서드
	void inveninput(String a) {
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = a;
				break;
				}
			}		
		}
	
	//인벤토리 정보 메서드
	void inven() {
		System.out.println("\n");
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				System.out.println("나머지 인벤토리가 비어있습니다.");
				break;
			}
			System.out.println("인벤토리 칸 " + (i+1) + " : " + items[i]);
		}
		System.out.println("최대 인벤토리 공간 : 5\n (전투로 돌아가기 : 0)\n");
	}

	
	//확정 공격 +30(1회)
	void bossBonus1() {
		bAtt = 30;
		sbAtt = "확정 공격 +30 카드(1회용) 획득!";
		}

	//공격력 업그레이드 +10(지속)
	void bossBonus2() {
		bContineAtt += 10;
		sbContineAtt = "공격력 업그레이드 +10 카드(패시브) 획득!";
		}
	
	//공격 테이블 기회 +1(1회)
	void bossBonus3() {
		bAttchance = 1;
		sbAttchance = "공격 횟수 +1 카드(1회용) 획득!";
		}
	
	
	//이벤트 보상
	//확정 공격 +20(1회)
	void eventBonus1() {
		ebAtt = 20;
		sebAtt = "확정 공격 +20 카드(1회용) 획득!";
	}
	
	// 주사위 점수 +4
	void eventBonus2() {
		ebDice = 4;
		sebDice = "주사위 점수 보너스 +4 (1회용, 보스전용) 획득!";
	}

	
	//이벤트 패널티
	// 보스 체력 +
	void trap() {
		trapBossHP = 75;
		strapBossHP = "다음 보스의 체력이 +75 증가합니다.";
	}

	
	
		
	}