package f_game_task;

import e_oop_score2.ScanUtil;

public class Infinity {

	boolean round; // 레벨당 던전 반복 제어
	boolean trap; // 전투 시작
	int boss2[] = new int[100]; // 무한 모드 보스 체력
	int i = 0; // 게임 반복 제어
	int d = 0; // 주사위 반복 제어
	int b = 0; // 보스 체력 제어
	int r = 0; // 보스 타이밍 제어
	int level = 1; // 던전 레벨
	int bossResult;
	String inputSS;

	int randomNumber;
	int dic;
	int control; // 반복제어
	int trapDice; // 함정 주사위 던져서 나오는 수
	String inputS2;

	Dice dice = new Dice();
	Bonus bon = new Bonus();

	// 무한 모드 던전 진행 함수
	void enterinfi() {
			round = false;
			r = 0; // 던전반복 제어
			System.out.println("\t !!!!!!!!!  끝이 보이지 않는 던전입니다.  !!!!!!!!!");
			enter: while (r < 3 && round == !true) { // 보스전 끝나고 round가 true로 바뀌어야 함!
				System.out.println("\n\t   --------------------------------------");
				System.out.println("\t   --------------------------------------");
				System.out.println("\t   --------------- 이동 중 ----------------");
				System.out.println("\t   --------------------------------------");
				System.out.println("\t   --------------------------------------\n");
				System.out.println("     (((((( 희미하게 휘날리는 불빛 사이로 3갈래 길이 보입니다. ))))))");
				System.out.println("\t\t    어느 길로 나아가시겠습니까?\n");
				System.out.println("1. 좌측 통로\t\t2. 중앙 통로\t\t3. 우측 통로");
				int input = ScanUtil.nextInt();
				int randomWay = (int) (Math.random() * 4) + 1;
				if (input == 1 || input == 2 || input == 3) {
					switch (randomWay) {
					case 1:
						infistoryEvent1();
						break;
					case 2:
						infistoryEvent2();
						break;
					case 3:
						infitrapEvent();
						if (trap == true) {
							trap = !trap;
							bossBattleStartinfi();
							infichoice();
							bossBattleEndinfi();
						}
						break;
					case 4:
						bossBattleStartinfi();
						infichoice();
						bossBattleEndinfi();
						break;
					}
				} else {
					continue enter;
				}
				r++;// 보스방 제어
			}
			if (level == 100)
			infiEnding();
	}
	
	
	// 전투 발생 알림
	void bossBattleStartinfi() {
		System.out.println("\n");
		System.out.println("!!!! 끝이 보이지 않는 던전 중앙에 무언가 커더란 그림자와 함께 괴성을 포효하고 있습니다. !!!!");
		System.out.println("\t\t******** 보스와 조우했습니다! ******** ");
		System.out.println("\n");
	}
	
	
	// 전투 결과 알림
	void bossBattleEndinfi() {
		round = !round; // 던전 반복 제어
		while (true) {
			System.out.println("다음 던전 레벨 :" + level);
			System.out.println("다음 던전에 입장 하시겠습니까?(y/n)");
			inputSS = ScanUtil.nextLine();
			if (inputSS.equals("y")) {
				break;
			} else if (inputSS.equals("n")) {
				System.out.println("여행을 끝마치시겠습니까?(y/n)");
				inputS2 = ScanUtil.nextLine();
				if (inputS2.equals("y")) {
					System.out.println("게임이 종료됩니다.");
					System.exit(0);
				} else if (inputS2.equals("n"))
					return;
			}
		}
	}
	
	
	
	void infistoryEvent1() {
		System.out.println("************ 영롱하게 빛나는 수정들로 가득한 공간을 발견했습니다! ************\n");
		System.out.println("가장 큰 수정 앞에는 기울어진 저울과 금화가 놓여 있고 저울에는 글이 쓰여있습니다.");
		System.out.println("저울의 균형을 찾아 보물을 가져갈 수 있는 능력을 증명하라!(1~100 사이 숫자)");
		// 정해진 숫자가 랜덤하게 생성(1~100)
		randomNumber = (int) (Math.random() * 101);
		System.out.println(randomNumber);
		// 주사위 던지기
		System.out.println("\n시스템 알림 : 두개의 주사위를 던져서 금화를 올려둘 수 있는 기회를 얻으세요!!");
		// 주사위 2개를 굴려 숫자를 맞출 기회를 얻음
		while (true) {
			System.out.println("------------------ 두개의 주사위를 던질 방법을 선택하세요 ------------------");
			System.out.println("오른쪽으로 던지기\t\t중앙으로 던지기\t\t왼쪽으로 던지기");
			System.out.println("   - 1 -   \t\t   - 2 -   \t\t   - 3 -   ");
			int input = ScanUtil.nextInt();
			if (input == 1 || input == 2 || input == 3) {
				dic = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
				break;
			}
		}
		while (dic > 0) {
			System.out.println("\n금화를 올려 놓을 수 있는 횟수 : " + dic);
			System.out.println("저울에 올려 놓을 금화의 갯수를 입력하세요!!");
			int input2 = ScanUtil.nextInt();
			if (randomNumber == input2) {
				System.out.println("\t\t!!! 저울의 균형을 찾았습니다. !!!");
				bon.eventBonusCard();// 이벤트 보너스 얻는 메서드 실행
				return;
			} else if (randomNumber > input2) {
				System.out.println("\n\n저울이 아직 기울어져 있다.(입력한 숫자가 작습니다!)");
			} else if (randomNumber < input2) {
				System.out.println("저울이 금화쪽으로 기울어져 있다.(입력한 숫자가 큽니다!)");
			}
			dic--; // 반복제어
		}
		System.out.println("##### 보물을 찾는데 실패하였습니다. ######");
		System.out.println("   던전 깊숙한 곳을 향해 다시 나아갑니다.");
	}
	
	

	
	void infistoryEvent2() {
		System.out.println();
		System.out.println("///////////////붉은 용암이 흐르는 공간에 도착하였습니다\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("중앙에는 커다란 제단이 모셔져 있었으며 제단의 중앙에는 커다란 주사위가 새겨져 있습니다.");
		// 도전 여부 선택 가능하도록
		while (true) {
			System.out.println("\t\t   제단에 도전하시겠습니까?(y/n)");
			String input = ScanUtil.nextLine();
			if (input.equals("y")) {
				// 제단 이벤트
				dic = 0;
				control = 0;
				System.out.println("\t\t*** 제단의 시련에 도전하셨습니다!! ***\n");
				System.out.println("시스템 알림 : 주사위를 5번 던져 20점 이상 점수가 나와야 합니다.");
				Temple: while (control < 5) {
					System.out.println("남은 주사위 횟 수 : " + (5 - control));
					System.out.println("------------------ 주사위를 던질 방법을 선택하세요 ------------------");
					System.out.println("오른쪽으로 던지기\t\t중앙으로 던지기\t\t왼쪽으로 던지기");
					System.out.println("   - 1 -   \t\t   - 2 -   \t\t   - 3 -   ");
					int input2 = ScanUtil.nextInt();
					if (input2 == 1 || input2 == 2 || input2 == 3) {
						dic += (int) (Math.random() * 6) + 1;
						if(dic < 20){
						System.out.println("시련을 통과하기 위해 남은 점수 : " + (20 - dic));
						}
						control++; // 반복제어
					} else {
						continue Temple;
					}
					if (dic > 19) {
						System.out.println("\t\t!!! 제단의 기운이 당신의 몸에 깃듭니다. !!!");
						// 이벤트 보너스 메서드 추가
						bon.bossBonus2();
						System.out.println("\t  ******** " + bon.sbContineAtt + " ********");
						return;
					}
				}
				if (dic < 20) {
					bon.trap();
					dice.trapDice = !dice.trapDice;
//					System.out.println(dice.trapDice);
					System.out.println("\t   ######## 제단의 시련에 실패하였습니다. ########");
					System.out.println("\t        제단의 시련이 보스의 체력을 강화합니다.");
					System.out.println("\t  *******" + bon.strapBossHP + "*******");
					break;
				}

				System.out.println();
			} else if (input.equals("n")) {
				// 제단 나가고 스토리 계속 진행
				System.out.println("\n발걸음을 돌려 보스를 찾아 나섭니다.");
				break;
			}
		}
	}
	
	
	
	void infitrapEvent() {
		System.out.println("\n\n  +++++  깎아지른 절벽을 만났습니다. 벽을 타고 조심스럽게 내려가야 합니다!  +++++");
		// 주사위를 3번 던져서 12점 이상 점수가 나와야 된다
		dic = 0;
		trapDice = 0;

		while (dic < 3) {
			System.out.println("\n");
			System.out.println("시스템 알림 : 절벽을 안전하게 내려가기 위해 주사위를 던지세요!");
			System.out.println("------------------ 주사위를 던질 방법을 선택하세요 ------------------");
			System.out.println("오른쪽으로 던지기\t\t중앙으로 던지기\t\t왼쪽으로 던지기");
			System.out.println("   - 1 -   \t\t   - 2 -   \t\t   - 3 -   ");
			int input = ScanUtil.nextInt();
			if (input == 1 || input == 2 || input == 3) {
				trapDice += (int) (Math.random() * 6) + 1;
				if(trapDice < 12){
				System.out.println("절벽을 안전하게 내려가기 위해 남은 점수 : " + (12 - trapDice));
				}
				dic++;
				if (trapDice > 11) {
					System.out.println("\n\t\t!!! 안전하게 빠져나갔습니다. !!!");
					return;
				}
			}
		}
		System.out.println("\n\n######## 낭떠러지 아래로 굴러 떨어졌습니다. ########");
		// 실패할 시 공격횟수 1회를 차감하고 보스방으로 직행
		System.out.println("   떨어진 충격에 당신은 잠시 정신을 차리지 못합니다.!\n");
		System.out.println("시스템 알림 : 공격 가능 횟수 -1");
		dice.i += 1;
		dice.bossResult = dice.boss1[dice.b];
		trap = true;
	}
	
	
	
	
	
	
	
	
	
	

	// 무한 모드 전투 함수
	void infichoice() {
		// 전투 돌입시 5회 반복
		dice.fight = false;
		i = 0;
		battle: while (i < 5 && dice.fight != true) {
			int input = 0;
			System.out.println("---------------------- 공격 방식을 선택하세요 ----------------------");
			System.out.println("남은 공격 횟수 : " + (5 - i));
			System.out.println("1.발차기(13점 이상)\t\t2.휘두르기(11점 이상) \t3.찌르기(8점 이상)\t\t4.아이템 사용");
			System.out.println("(Damame:50~100)\t\t (Damame:10~100) \t(Damame:20~50)");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				dice.diceControl();
				dice.atackTable1();
				infiBossFight();
				break;
			case 2:
				dice.diceControl();
				dice.atackTable2();
				infiBossFight();
				break;
			case 3:
				dice.diceControl();
				dice.atackTable3();
				infiBossFight();
				break;
			case 4:
				dice.itemUse();
				continue battle;
			}
			dice.extraDamage = 0; // 1회용 아이템 초기화
			i++; // 반복 제어
			if (i == 5 && bossResult > 0) {
				System.out.println("던전에 패배하셨습니다...");
				System.out.println("게임이 종료됩니다.");
				System.exit(0);
			}
		}
	}

	// 무한모드 보스 체력
	void infiBossHP() {
		boss2[0] = 100;
		for (int i = 0; i < boss2.length - 1; i++) {
			boss2[i + 1] = boss2[i] + 50;
		}
	}

	// 무한모드 보스 전투 메서드
	void infiBossFight() {
		infiBossHP();
		if (i == 0) {
			bossResult = boss2[b] - (dice.damage + dice.extraDamage);
			System.out.println("현재 보스 남은 체력 : " + bossResult);
		} else if (i != 0) {
			bossResult = bossResult - (dice.damage + dice.extraDamage);
			System.out.println("현재 보스 남은 체력 : " + bossResult);
		}
		if (bossResult <= 0) {
			System.out.println("\t    **** 축하합니다! 보스를 처치하였습니다!!! ****");
			level++;
			b++;
			bon.bossBonusCard(); // 보스 클리어 보상 클래스
			dice.fight = true; // 전투 반복을 빠져나가기 위한 장치
		}
	}

	// 무한모드 엔딩
	void infiEnding() {
		System.out.println("*************************************************");
		System.out.println("******************* 축하합니다!! *******************");
		System.out.println("********* Dice Dungeon을 클리어 하셨습니다!! **********");
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		System.out.println("게임이 종료됩니다.");
		System.exit(0);
	}

}
