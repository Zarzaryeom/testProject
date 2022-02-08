package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import e_oop_score2.ScanUtil;

public class lectuer {

	public static void main(String[] args) {
		new lectuer().start();
	}

	private void start() {
		while(true) {
			String sql = "SELECT A.BOARD_NO"
					+ " ,		 A.TITLE"
					+ " ,        B.MEM_NAME"
					+ " , 	     TO_CHAR(A.REG_DATE, 'MM/DD') AS REG_DATE"
					+ "	    FROM TB_JDBC_BOARD A"
					+ "		LEFT OUTER JOIN MEMBER B ON A.MEM_ID = B.MEM_ID"
					+ "	   ORDER BY A.BOARD_NO DESC";
			List<Map<String, Object>> boardList = JDBCUtil.selectList(sql);
			
			System.out.println("---------------------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("---------------------------------------");
			for(Map<String, Object> board : boardList) { //향상된 for문
				System.out.println(board.get("BOARD_NO")
						+ "\t" + board.get("TITLE")
						+ "\t" + board.get("MEM_NAME")
						+ "\t" + board.get("REG_DATE"));
			}
			System.out.println("---------------------------------------");
			
			System.out.println("1.조회  2.등록  0.종료");
			int input = ScanUtil.nextInt();
			switch(input) {
			case 1:
				read();
				break;
			case 2:
				insert();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);	
				
			}
		}
	}

	//제목, 내용, 아이디를 입력받는 곳
	private void insert() {
		System.out.println("제목>");
		String title = ScanUtil.nextLine();
		System.out.println("내용>");
		String content = ScanUtil.nextLine();
		System.out.println("아이디>");
		String memId = ScanUtil.nextLine();
		
		String sql = "  INSERT INTO TB_JDBC_BOARD"
				+ "		  VALUES("
				+ " 	  (SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD)"
				+ " 		  , ?, ?, ?"
				+ " 		  , SYSDATE"
				+ ")";
		
		List<Object> param = new ArrayList<Object>();
		param.add(title);
		param.add(content);
		param.add(memId);
		
		if(0 < JDBCUtil.update(sql, param)) {
			System.out.println("게시글 등록이 완료되었습니다.");
		}else {
			System.out.println("게시글 등록이 실패하였습니다.");
		}
	}

	private void read() {
		System.out.println("게시글 번호>");
		int boardNo = ScanUtil.nextInt();
		
		String sql = "SELECT A.BOARD_NO"
				+ " ,		 A.TITLE"
				+ "	,		 A.CONTENT"
				+ " ,        B.MEM_NAME"
				+ " , 	     TO_CHAR(A.REG_DATE, 'MM/DD') AS REG_DATE"
				+ "	    FROM TB_JDBC_BOARD A"
				+ "		LEFT OUTER JOIN MEMBER B ON A.MEM_ID = B.MEM_ID"
				+ "	   WHERE A.BOARD_NO = ?";
		
		List<Object> param = new ArrayList<Object>();
		param.add(boardNo);
		
		Map<String, Object> board = JDBCUtil.selectOne(sql, param);
		System.out.println("-------------------------------------");
		System.out.println("번호\t " + board.get("BOARD_NO"));
		System.out.println("작성자\t " + board.get("MEM_NAME"));
		System.out.println("작성일\t " + board.get("REG_DATE"));
		System.out.println("제목\t " + board.get("TITLE"));
		System.out.println("내용\t " + board.get("CONTENT"));
		System.out.println("-------------------------------------");
		
		System.out.println("1.수정  2.삭제  0.목록>");
		int input = ScanUtil.nextInt();
		switch(input) {
		case 1:
			update(boardNo);
			break;
		case 2:
			delete(boardNo);
			break;
		}		
	}

	private void delete(int boardNo) {
		System.out.println("정말로 삭제하시겠습니까?");
		String yn = ScanUtil.nextLine();
		
		if(yn.equals("Y")) {
			String sql = "DELETE FROM TB_JDBC_BOARD"
					+ "    WHERE BOARD_NO = ?";
			
			List<Object> param = new ArrayList<Object>();
			param.add(boardNo);
			
			if(0 < JDBCUtil.update(sql, param)) {
				System.out.println("게시글이 삭제되었습니다.");
			}else {
				System.out.println("게시글 삭제에 실패하였습니다.");
			}
					
		}
	}

	private void update(int boardNo) {
		System.out.println("제목>");
		String title = ScanUtil.nextLine();
		System.out.println("내용>");
		String content = ScanUtil.nextLine();
		
		String sql = "UPDATE TB_JDBC_BOARD"
				+ "	     SET TITLE = ?"
				+ "        , CONTENT = ?"
				+ "    WHERE BOARD_NO = ?";
		
		List<Object> param = new ArrayList<Object>();
		param.add(title);
		param.add(content);
		param.add(boardNo);
		
		if(0 < JDBCUtil.update(sql, param)) {
			System.out.println("게시글 수정이 완료되었습니다.");
		}else {
			System.out.println("게시글 수정에 실패하였습니다.");
		}
				
	}
}
