package f_game_task;

import e_oop_score2.ScanUtil;

public class Event {

//	int randomNumber;
//	int dic;
//	int control; //반복제어
//	int trapDice; //함정 주사위 던져서 나오는 수
//	
//	//함정과 스토리 이벤트이 차이 : 스토리 이벤트는 부정적 결과를 피해갈 수 있는 선택지가 주어짐
//	
//	Bonus bon = new Bonus();
//	Dice di = new Dice();
//	Dungeon dun = new Dungeon();
//	
//	
//	//스토리 이벤트 1(보물 찾기 - 알맞은 숫자 찾기)
//	// 제한 조건 내 숫자를 맞추면 보상, 맞추지 못해면 이벤트 끝
//	void storyEvent1() {
//		System.out.println("보물을 발견, 저울에 알맞은 숫자의 금화를 올려두어야 한다.(1~100 사이 숫자)");
//		// 정해진 숫자가 랜덤하게 생성(1~100)
//		randomNumber = (int) (Math.random() * 101);
//		System.out.println(randomNumber);
//		// 주사위 던지기
//		System.out.println("주사위를 던져서 금화를 올려둘 수 있는 횟수를 정해라");
//		// 주사위 2개를 굴려 숫자를 맞출 기회를 얻음
//		while (true) {
//			System.out.println("\n");
//			System.out.println("------------------ 주사위를 던질 방법을 선택하세요 ------------------");
//			System.out.println("오른쪽으로 던지기\t\t중앙으로 던지기\t\t왼쪽으로 던지기");
//			System.out.println("   - 1 -   \t\t   - 2 -   \t\t   - 3 -   ");
//			int input = ScanUtil.nextInt();
//			if (input == 1 || input == 2 || input == 3) {
//				dic = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
//				break;
//			}
//		}
//		while (dic > 0) {
//			System.out.println("금화를 올려 놓을 수 있는 횟수 : " + dic);
//			System.out.println("숫자를 입력하세요.");
//			int input2 = ScanUtil.nextInt();
//			if (randomNumber == input2) {
//				System.out.println("보물을 찾았습니다");
//				bon.eventBonusCard();// 이벤트 보너스 얻는 메서드 실행
//				return;
//			} else if (randomNumber > input2) {
//				System.out.println("보물의 숫자가 금화보다 큰 것 같다");
//			} else if (randomNumber < input2) {
//				System.out.println("보물의 숫자가 금화보다 작은 것 같다");
//			}
//			dic--; // 반복제어
//		}
//		System.out.println("보물을 찾는데 실패하였습니다.");
//		System.out.println("던전 깊숙한 곳을 향해 다시 나아갑니다.");
//	}
//	
//	
//	
//	//스토리 이벤트 2(제단에서 시련에 도전)
//	//주사위를 5번 던져서 20점 이상 점수가 나와야 된다
//	//실패할 시 패널티? - 아이템칸에 저주아이템
//	//성공할 시 강력한 아이템? - 아이템칸에 고효율 아이템
//	void storyEvent2() {
//		System.out.println("제단을 발견");
//		// 도전 여부 선택 가능하도록
//		while (true) {
//			System.out.println("제단에 도전하시겠습니까?(y/n)");
//			String input = ScanUtil.nextLine();
//			if (input.equals("y")) {
//				// 제단 이벤트
//				dic = 0;
//				control = 0;
//				System.out.println("주사위를 5번 던져 20점 이상 점수가 나와야 한다.");
//				Temple: while (control < 5) {
//					System.out.println("남은 주사위 횟 수 : " + (5 - control));
//					System.out.println("------------------ 주사위를 던질 방법을 선택하세요 ------------------");
//					System.out.println("오른쪽으로 던지기\t\t중앙으로 던지기\t\t왼쪽으로 던지기");
//					System.out.println("   - 1 -   \t\t   - 2 -   \t\t   - 3 -   ");
//					int input2 = ScanUtil.nextInt();
//					if (input2 == 1 || input2 == 2 || input2 == 3) {
//						dic += (int) (Math.random() * 6) + 1;
//						System.out.println("시련을 통과하기 위해 남은 점수 : " + (20 - dic));
//						control++; // 반복제어
//					} else {
//						continue Temple;
//					}
//					if (dic > 19) {
//						System.out.println("제단의 기운이 당신의 몸에 깃듭니다.");
//						// 이벤트 보너스 메서드 추가
//						bon.bossBonus2();
//						System.out.println("********" + bon.sbContineAtt + "********");
//						return;
//					}
//				}
//				if (dic < 20) {
//					bon.Trap();
//					System.out.println("제단의 시련에 실패하였습니다.");
//					System.out.println("제단의 시련이 보스의 체력을 강화합니다.");
//					System.out.println("*******" + bon.strapBossHP + "*******");
//					break;
//				}
//
//				System.out.println();
//			} else if (input.equals("n")) {
//				// 제단 나가고 스토리 계속 진행
//				System.out.println("발걸음을 돌려 보스를 찾아 나섭니다.");
//				break;
//			}
//		}
//	}
//	
//	
//	//함정 통과 이벤트
//	//가파른 절벽을 내려가는 이벤트
//	void trapEvent() {
//		System.out.println("깍아지른 절벽을 만났습니다. 벽을 타고 조심스럽게 내려갑니다.");
//		// 주사위를 3번 던져서 12점 이상 점수가 나와야 된다
//		dic = 0;
//		trapDice = 0;
//
//		while (dic < 3) {
//			System.out.println("\n");
//			System.out.println("------------------ 주사위를 던질 방법을 선택하세요 ------------------");
//			System.out.println("오른쪽으로 던지기\t\t중앙으로 던지기\t\t왼쪽으로 던지기");
//			System.out.println("   - 1 -   \t\t   - 2 -   \t\t   - 3 -   ");
//			int input = ScanUtil.nextInt();
//			if (input == 1 || input == 2 || input == 3) {
//				trapDice += (int) (Math.random() * 6) + 1;
//				System.out.println("절벽을 안전하게 내려가기 위해 남은 점수 : " + (12 - trapDice));
//				dic++;
//				if (trapDice > 11) {
//					System.out.println("안전하게 빠져나갔습니다.");
//					return;
//				}
//			}
//		}
//		System.out.println("낭떠러지 아래로 굴러 떨어졌습니다.");
//		// 보스 전투 메서드 실행
//		// 실패할 시 공격횟수 1회를 차감하고 보스방으로 직행
//		System.out.println("떨어진 충격에 당신은");
//		System.out.println("시스템 알림 : 공격 가능 횟수 -1");
//		di.i += 1;
//		di.bossResult = di.boss1[di.b];
//		dun.trap = true;
////		dun.bossBattleStart();
////		di.choice();
////		dun.bossBattleEnd();
//	}

	
	
}
