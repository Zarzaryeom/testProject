package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop_score2.ScanUtil;

public class Practice {

	public static void main(String[] args) {
		// 게시판 작성
		new Practice().start();
	}

	ArrayList<HashMap<String, Object>> postTable = new ArrayList<HashMap<String, Object>>();
	SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
	static HashMap<String, Object> post = new HashMap<String, Object>();

	// 게시판을 처음 실행하면 나오는 화면 구성
	void start() {
		while (true) {
			System.out.println("Java 자유 게시판");
			System.out.println("==============================");
			System.out.println("번호\t제목\t작성자\t작성일");
			for (int i = postTable.size() - 1; i >= 0; i--) {
				HashMap post = postTable.get(i);
				System.out.println("-----------------------------");
				System.out.println(post.get("POST_NO") + "\t" + post.get("POST_TITLE") + "\t" + post.get("POST_NAME")
						+ "\t" + format.format(post.get("POST_DAY")));
			}
			System.out.println("==============================");
			System.out.println("1.조회  2.새 글 생성  0.종료");
//			System.out.println(postTable);
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				read();
				break;
			case 2:
				create();
				break;
			case 0:
				System.out.println("게시판을 종료합니다.");
				System.exit(0);
			}
		}
	}

	// 새 글 생성
	private void create() {
		post = new HashMap<String, Object>();
		System.out.println("새로 생성할 내용을 입력하세요.");

		int num = 0;
		for (int i = 0; i < postTable.size(); i++) {
			if (num < (int) (postTable.get(i).get("POST_NO"))) {
				num = (int) (postTable.get(i).get("POST_NO"));
			}
		}
		post.put("POST_NO", num + 1);

		System.out.print("제목>");
		post.put("POST_TITLE", ScanUtil.nextLine());

		System.out.print("작성자>");
		post.put("POST_NAME", ScanUtil.nextLine());

		System.out.println("내용>");
		post.put("POST_CONTENT", ScanUtil.nextLine());

		post.put("POST_DAY", new Date());

		postTable.add(post);
	}

	// 조회
	private void read() {
		System.out.println("조회할 글의 번호를 입력하세요.");
		int input = ScanUtil.nextInt();
		post = new HashMap<String, Object>();
		for (int i = 0; i < postTable.size(); i++) {
			if (input == (int) (postTable.get(i).get("POST_NO"))) {
				post = postTable.get(i);
			}
		}
		content: while (true) {
			System.out.println("==========================");
			System.out.println("번호 : " + post.get("POST_NO"));

			System.out.println("==========================");
			System.out.println("제목 : " + post.get("POST_TITLE"));

			System.out.println("==========================");
			System.out.println("작성자 : " + post.get("POST_NAME"));

			System.out.println("==========================");
			System.out.println("작성일 : " + post.get("POST_DAY"));

			System.out.println("==========================");
			System.out.println("내용 : " + post.get("POST_CONTENT"));

			System.out.println();
			System.out.println("1.수정  2.삭제  3.이전 글  4.다음 글  0.목록");
			int input2 = ScanUtil.nextInt();
			switch (input2) {
			case 1:
				change(post);
				break;
			case 2:
				delete(post);
				break;
			case 3:
				back(post);
				break;
			case 4:
				next(post);
				break;
			case 0:
				break content;
			}
		}
	}

	private void next(HashMap<String, Object> post2) {
		System.out.println("다음 글로 이동하시겠습니까?(Y/N)");
		String input = ScanUtil.nextLine();
		if (input.equals("Y")) {
			for (int i = 0; i < postTable.size(); i++) {
				if (post.get("POST_NO") == postTable.get(i).get("POST_NO")) {
					post = postTable.get(i + 1);
					break;
				}
			}
		}
	}

//	private void next(HashMap<String, Object> post) {
//		System.out.println("다음 글로 이동하시겠습니까?(Y/N)");
//		System.out.println(post);
//		String input = ScanUtil.nextLine();
//		if (input.equals("Y")) {
//			for (int i = 0; i < postTable.size(); i++) {
//				if (post.get("POST_NO") == postTable.get(i).get("POST_NO")) {
//					post = postTable.get(i + 1);
//					System.out.println(post);
//					break;
//				}
//			}
//		}
//	}

	private void back(HashMap<String, Object> post2) {
		System.out.println("이전 글로 이동하시겠습니까?(Y/N)");
		String input = ScanUtil.nextLine();
		if(input.equals("Y")) {
			for(int i = 0; i < postTable.size(); i++) {
				if(post.get("POST_NO") == postTable.get(i).get("POST_NO")) {
					post = postTable.get(i - 1);
					break;
				}
			}
		}
	}

	private void delete(HashMap<String, Object> post) {
		System.out.println("정말로 삭제하시겠습니까?(Y/N)");
//		System.out.println(post);
		String input = ScanUtil.nextLine();
		if (input.equals("Y")) {
			postTable.remove(post);
		}
	}

	private void change(HashMap<String, Object> post) {
		System.out.println("수정할 제목을 기입하세요.");
		post.put("POST_TITLE", ScanUtil.nextLine());
		System.out.println("수정할 내용을 기입하세요.");
		post.put("POST_CONTENT", ScanUtil.nextLine());

		System.out.println("제목과 내용이 수정되었습니다!");
	}

	// 이전 목록, 다음 목록가는 단축키 만들어보기?

}
