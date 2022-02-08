package f_game_task;

import e_oop_score2.ScanUtil;

public class Dice {

	boolean start; // 게임 스타트
	boolean fight; // 전투 승리,패배 판별
	static boolean trapDice;
	int dice; // 주사위를 던져서 나온 변수
	int dSum; // 다이스 3번 던져 나온 숫자의 합
	int boss1[] = { 100, 100, 100, 100, 100, 100 };
	int boss2[] = new int[100]; // 무한 모드 보스 체력
	int damage; // 공격 데미지
	int bossResult; // 보스 전투 결과
	int i; // 게임 반복 제어
	int d; // 주사위 반복 제어
	int b; // 보스 체력 제어
	int extraDamage; // 보너스 확정 공격
	int extraDice; // 보너스 주사위 점수

	Bonus bo = new Bonus();

	// 일반 모드 전투 함수
	void choice() {
		// 전투 돌입시 5회 반복
		fight = false;
		battle: while (i < 5 && fight != true) {
				int input = 0;
				System.out.println("---------------------- 공격 방식을 선택하세요 ----------------------");
				System.out.println("남은 공격 횟수 : " + (5 - i));
				System.out.println("1.발차기(13점 이상)\t\t2.휘두르기(11점 이상) \t3.찌르기(8점 이상)\t\t4.아이템 사용");
				System.out.println("(Damame:50~100)\t\t (Damame:10~100) \t (Damame:20~50)");
				input = ScanUtil.nextInt();
				switch (input) {
				case 1:
					diceControl();
					atackTable1();
					bossFight();
					break;
				case 2:
					diceControl();
					atackTable2();
					bossFight();
					break;
				case 3:
					diceControl();
					atackTable3();
					bossFight();
					break;
				case 4:
					itemUse();
					continue battle;
				}
				extraDamage = 0; // 1회용 아이템 초기화
				extraDice = 0;
				i++; // 반복 제어
				if (i == 5 && bossResult > 0) {
					System.out.println("\n\n######## 던전에 패배하셨습니다..########");
					System.out.println("          게임이 종료됩니다.");
					System.exit(0);
				}

		}
		i = 0; // i값 초기화
	}

	// 랜덤 주사위 굴리기(앞으로 굴리기, 옆으로 굴리기, 던지기)
	void diceControl() {
		int input = 0;
		dice = 0; // 다이스 점수 초기화
		dSum = 0; // 주사위 합계 초기화
		d = 0; // 주사위 반복 초기화
		// 주사위를 3번 던지는 함수
		dSum += extraDice; // 주사위 보너스 사용시
		while (d < 3) {
			System.out.println("\n");
			System.out.println("------------------- 주사위를 던질 방법을 선택하세요 -------------------");
			System.out.println("오른쪽으로 던지기\t\t중앙으로 던지기\t\t왼쪽으로 던지기");
			System.out.println("   - 1 -   \t\t   - 2 -   \t\t   - 3 -   ");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				dice = (int) (Math.random() * 6) + 1;
			case 2:
				dice = (int) (Math.random() * 6) + 1;
			case 3:
				dice = (int) (Math.random() * 6) + 1;
				dSum += dice;
				System.out.println("\n" + (d + 1) + "횟차 누적 주사위 점수 : " + dSum);
				d++;
				System.out.println();
			}
		}
	}

	// 공격 테이블(3개의 공격 방식)
	// 1번 방식 : 50 ~ 100사이 랜덤한 공격 13점 이상
	void atackTable1() {
		if (dSum > 1) {
			damage = 100 - (int) (Math.random() * 50) + bo.bContineAtt;
			System.out.println(damage + extraDamage + "의 데미지를 주었습니다!");
			System.out.println();
		} else {
			damage = 0;
			System.out.println("공격이 빗나갔습니다!!" + "(미달 점수 : " + (13 - dSum) + ")");
			System.out.println();
		}
	}

	// 2번 방식 : 10 ~ 100사이 랜덤한 공격 11점 이상
	void atackTable2() {
		if (dSum > 1) {
			damage = 100 - (int) (Math.random() * 90) + bo.bContineAtt;
			System.out.println(damage + "의 데미지를 주었습니다!");
			System.out.println();
		} else {
			damage = 0;
			System.out.println("공격이 빗나갔습니다!!" + "(미달 점수 : " + (11 - dSum) + ")");
			System.out.println();
		}
	}

	// 3번 방식 : 20 ~ 50사이 랜덤한 공격 8점 이상
	void atackTable3() {
		if (dSum > 1) {
			damage = 50 - (int) (Math.random() * 30) + bo.bContineAtt;
			System.out.println(damage + "의 데미지를 주었습니다!");
			System.out.println();
		} else {
			damage = 0;
			System.out.println("공격이 빗나갔습니다!!" + "(미달 점수 : " + (8 - dSum) + ")");
			System.out.println();
		}
	}

	// 일반 보스 전투 메서드
	void bossFight() {
		if (i == 0) {
//			System.out.println(trapDice);
			if (trapDice == true) {
				bo.trap();
				trapDice = !trapDice;
			}
			bossResult = boss1[b] - (damage + extraDamage) + bo.trapBossHP;
			System.out.println("현재 보스 남은 체력 : " + bossResult);
			bo.trapBossHP = 0; // 보스체력 보너스 초기화
		} else if (i != 0) {
			if (trapDice == true) {
				bo.trap();
				trapDice = !trapDice;
			}
			bossResult = bossResult - (damage + extraDamage) + bo.trapBossHP;
			if(bossResult > 0) {
			System.out.println("현재 보스 남은 체력 : " + bossResult);
			}
			bo.trapBossHP = 0;
		}
		if (bossResult <= 0) {
			System.out.println("\t    **** 축하합니다! 보스를 처치하였습니다!!! ****");
			b++; // 일반 보스 체력 변경
			bo.bossBonusCard(); // 보스 클리어 보상 클래스
			fight = true; // 전투 반복을 빠져나가기 위한 장치
		}
	}

	// 보너스 아이템 사용 효과
	void itemUse() {
		System.out.println("\n@@@@@ 사용하실 인벤토리의 버튼을 눌러주세요 @@@@@@");
		bo.inven();
		int input = ScanUtil.nextInt();
		if (input == 0)
			return;
		if (bo.items[input - 1] == null) {
			System.out.println("남은 아이템이 없습니다.");
		} else if (bo.items[input - 1] == bo.sbAtt) {
			System.out.println("다음 공격시 +30의 데미지를 추가합니다.");
			bo.items[input - 1] = null;
			extraDamage += bo.bAtt;
		} else if (bo.items[input - 1] == bo.sbAttchance) {
			System.out.println("남은 공격 횟수가 1회 증가합니다.");
			i = i - bo.bAttchance;
			bo.items[input - 1] = null;
		} else if (bo.items[input - 1] == bo.sebAtt) {
			System.out.println("다음 공격시 +20의 데미지를 추가합니다.");
			extraDamage += bo.ebAtt;
			bo.items[input - 1] = null;
		} else if (bo.items[input - 1] == bo.sebDice) {
			System.out.println("다음 주사위 점수에 +4을 추가합니다.");
			extraDice += bo.ebDice;
			bo.items[input - 1] = null;
		}

	}

}
