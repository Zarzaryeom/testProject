package j_collection;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop_score2.ScanUtil;

public class Board {

	static ArrayList<HashMap<String, Object>> table = new ArrayList<HashMap<String, Object>>();
	static HashMap<String, Object> list = new HashMap<String, Object>();
	static ArrayList<String> contents = new ArrayList<String>();
	int num = 2;

//    Date today = new Date();
//	SimpleDateFormat df = new SimpleDateFormat("yyyy/mm/dd");
	LocalDate today = LocalDate.now(); // 날짜를 넣기 위한 메서드

	public static void main(String[] args) {

//    	Date today = new Date();
//    	SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고, 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 게시판 : 번호, 제목, 내용, 작성자, 작성일(테이블의 컬럼으로)
		 * 
		 * 목록을 띄울 수 있게 만들어라 - 목록에서 상세 내용을 볼 수 있게(조회) -> 현재 보고 있는 글을 수정 삭제 가능하도록 - 새로운 글을
		 * 등록(등록)
		 * 
		 * 목록에선 내용을 출력하지 않도록
		 */

//		BoardClass cl = new BoardClass();
		Board bo = new Board();

		// 게시글 구성하기(조회, 등록, 삭제)

		// 게시글 구조 표시
		System.out.println("Java 자유 게시판에 입장합니다.");
		ArrayList<HashMap<String, Object>> title = new ArrayList<HashMap<String, Object>>();

		list = new HashMap<String, Object>();
		list.put("작성일자", "작성일자");
		list.put("순번", "순번");
		list.put("제목", "제목");
		list.put("작성자", "작성자");

		bo.contents.add("내용 출력 확인 : 작성자가 첫번쨰로 작성한 글");
		title.add(list);

		list = new HashMap<String, Object>();
		list.put("작성일자", "2022-01-28");
		list.put("순번", 1);
		list.put("제목", "Java 게시판 첫 글!");
		list.put("작성자", "아무개");

		table.add(list);

		System.out.println("______________________________________________________________________");

		// 제목 뽑기
		for (int i = 0; i < title.size(); i++) {
			list = title.get(i);
			for (String key : list.keySet()) {
				System.out.print(" " + list.get(key) + "\t\t");
			}
			System.out.println();
			System.out.println("______________________________________________________________________");
		}

		for (int i = table.size() - 1; i >= 0; i--) {
			list = table.get(i);
			int a = 0;
			for (String key : list.keySet()) {
				if (a < 2) {
					System.out.print("  " + list.get(key) + "\t");
				} else {
					System.out.print("  " + list.get(key) + "\t");
				}
				a++;
			}
			System.out.println();
		}

//		System.out.println(table);

		// 내용 구성(수정, 삭제, 등록)

		// 단축키 구성 및 실행
		start: while (true) {
			System.out.println("\n\n");
			System.out.println("단축키 : 게시글 조회하기(1)" + "\t 새로운 글 등록(0)\t 게시판 종료(100)");
//			System.out.println(table);

			int input = ScanUtil.nextInt();
			switch (input) {
			case 0:
				bo.createList(); // 글 생성하기
				break;
			case 1:
				bo.intoText(); // 내용 조회하기
				break;
			case 100:
				System.out.println("게시판을 종료합니다.");
				System.exit(0); // 끝내기
			}

			System.out.println("\n\n");
			for (int i = 0; i < title.size(); i++) {
				list = title.get(i);
				System.out.println("Java 자유 게시판에 입장합니다.");
				System.out.println("______________________________________________________________________");
				for (String key : list.keySet()) {
					System.out.print("  " + list.get(key) + "\t\t");
				}
				System.out.println();
				System.out.println("______________________________________________________________________");
			}

			for (int i = table.size() - 1; i >= 0; i--) {
				list = table.get(i);
				int a = 0;
				for (String key : list.keySet()) {
					if (a < 2) {
						System.out.print("  " + list.get(key) + "\t");
					} else {
						System.out.print("  " + list.get(key) + "\t");
					}
					a++;
				}
				System.out.println();
			}
		}

	}

	void createList() { // 새로운 글 만들기 메서드
		list = new HashMap<String, Object>();
		list.put("순번", num);
		num++;

		System.out.print("새롭게 작성할 글의 제목을 입력하세요 : ");
		list.put("제목", ScanUtil.nextLine());

		System.out.print("\n작성자를 입력하세요 : ");
		list.put("작성자", ScanUtil.nextLine());

		list.put("작성일자", today);

		contents.add("'새로운 내용을 입력하세요'"); // 새로만든 글 내용 생성하기
		table.add(list);
	}

	void intoText() { // 조회 시 가능한 행동 메서드

		System.out.println("조회할 목록을 선택하세요.");
		int continput = ScanUtil.nextInt();
		text: while (true) {
//			list = table.get(continput - 1);
			HashMap<String, Object> list = null;
			for(int i = 0; i < table.size(); i++) {
				if(continput == (int)(table.get(i).get("순번"))) {
					list = table.get(i);
				}
			}
			System.out.println("글 제목 : " + list.get("제목")); // 제목 출력
			System.out.println("작성자 : " + list.get("작성자")); // 작성자 출력
			System.out.println("작성 일자 : " + list.get("작성일자")); // 작성 날짜 출력
			System.out.println(contents.get(continput - 1)); // 내용 출력
			int contNum = continput - 1; // 수정 시 글이 저장된 ArrayList를 찾기 위한 수식

			System.out.println("\n\n단축키 : 뒤로가기(0), 글 수정(1), 글 삭제(2)");
			int inputkey = ScanUtil.nextInt();
			switch (inputkey) {
			case 0:
				return;
			case 1:
				while (true) {
					System.out.println("수정을 마치시면 이전에 있던 글은 사라집니다. " + "계속 하시겠습니까?(yes / no)");
					String conput1 = ScanUtil.nextLine();
					if (conput1.equals("yes")) {
						System.out.println("수정된 내용을 입력하세요."); // 수정된 내용 입력하기
						String conput2 = ScanUtil.nextLine();
						contents.set(contNum, conput2);
						break;
					} else if (conput1.equals("no")) {
						break;
					}
				}
				break;
			case 2:
				while(true) {
				System.out.println("정말 글을 삭제하시겠습니까?(yse / no)");
				String conput3 = ScanUtil.nextLine();
				if (conput3.equals("yes")) {
//					contents.set(contNum, "'새로운 내용을 입력하세요'"); // 자료 삭제
					table.remove(contNum);
					return;
				}else if(conput3.equals("no")) {
					break;
				}
				}
				break;
			}

		}
	}

}
