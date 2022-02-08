package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import e_oop_score2.ScanUtil;

public class BoardOracle {
	
	List<Map<String, Object>> table = new ArrayList<Map<String, Object>>();
	static HashMap<String, Object> post = new HashMap<String, Object>();
	SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "LBJ94";
	String password = "JAVA";

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String sql;
	ArrayList<Object> param;
	
	
	public static void main(String[] args) {
		//게시판 컬럼 : BOARD_NO(NUMBER), TITLE, CONTENT, MEM_ID, REG_DATE(DATE)
		new BoardOracle().start();			
	}
	
	
	//게시판 첫 화면
	private void start() {
		while(true) {			
			System.out.println("프로젝트 게시판에 오신걸 환영합니다.");
			System.out.println("======================================");


			try {
				con = DriverManager.getConnection(url, user, password);

				sql = "select * from tb_jdbc_board";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				
				//sql에서 나온 값을 ArrayList에 저장 후 출력하기
				table = JDBCUtil.selectList(sql);
				
				//제목
				System.out.print("순번\t제목\t작성자\t작성일자");
				
				System.out.println("\n======================================");

				//목록
				for(int i = table.size() - 1; i >= 0; i--) {
					System.out.print(table.get(i).get("BOARD_NO") + "\t"
							+ table.get(i).get("TITLE") + "\t"
							+ table.get(i).get("MEM_ID") + "\t"
							+ format.format(table.get(i).get("REG_DATE")));
					System.out.println();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
			// 목록 출력하기

			System.out.println("\n");
			System.out.println("단축키 : 1.글 조회하기   2.글 생성하기   0.종료하기");
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				enter();
				break;
			case 2:
				contentInput();
				break;
			case 0:
				System.out.println("게시판 프로그램을 종료합니다.");
				System.exit(0);
				break;
			}
		}
	}
	
	
	
	
	private void enter() {

		sql = "select * from tb_jdbc_board";
		table = JDBCUtil.selectList(sql);
		System.out.println("조회할 글의 순번을 입력하세요.");
		int input = ScanUtil.nextInt();
		text: while (true) {
			for (int i = 0; i < table.size(); i++) {
				if(input == Integer.parseInt(String.valueOf(table.get(i).get("BOARD_NO")))){
					System.out.println("-------------------------------------");
					System.out.println("순번 : " + table.get(i).get("BOARD_NO"));
					System.out.println("-------------------------------------");
					System.out.println("제목 : " + table.get(i).get("TITLE"));
					System.out.println("-------------------------------------");
					System.out.println("내용 : " + table.get(i).get("CONTENT"));
					System.out.println("-------------------------------------");
					System.out.println("작성자 : " + table.get(i).get("MEM_ID"));
					System.out.println("-------------------------------------");
					System.out.println("작성일자 : " + table.get(i).get("REG_DATE"));
					break;				
				}				
			}
			
			//단축키
			System.out.println();
			System.out.println("1.글 수정   2.글 삭제   0.뒤로가기");
			switch(ScanUtil.nextInt()) {
			case 1:
				change(input);
				break text;
			case 2:
				delete(input);
				break text;
			case 0:
				break text;
			}			
		}
	}


	private void change(int input) {
		sql = "UPDATE TB_JDBC_BOARD"
				+ " SET TITLE = ?,"
				+ " CONTENT = ?,"
				+ " MEM_ID = ?,"
				+ " REG_DATE = SYSDATE"
				+ " WHERE BOARD_NO = ?";
		System.out.println("변경할 내용을 입력하세요!");
		
		param = new ArrayList<Object>();
		
		System.out.print("제목 : ");
		param.add(ScanUtil.nextLine());
		System.out.print("내용 : ");
		param.add(ScanUtil.nextLine());
		System.out.print("작성자 : ");
		param.add(ScanUtil.nextLine());
		param.add(input);
		
		JDBCUtil.update(sql, param);
		
		System.out.println("수정이 완료되었습니다!");
	}


	private void delete(int input) {
		sql = "DELETE FROM TB_JDBC_BOARD"
				+ " WHERE BOARD_NO = ?";
		while(true) {
		System.out.println("정말로 삭제하시겠습니까?(Y/N)");
		if(ScanUtil.nextLine().equals("Y")) {
			param = new ArrayList<Object>();
			param.add(input);
			JDBCUtil.update(sql, param);
			break;
		}else if(ScanUtil.nextLine().equals("N")) {
			break;
		}
		}
	}


	//java에서 입력하면 oracle에 저장될 수 있는 메서드,
	private void contentInput() {		
		post = new HashMap<String, Object>();
		
		System.out.println("생성할 글의 정보를 입력하세요.");
			
			sql = "select * from tb_jdbc_board";
			
			//순번을 찾아 넣기		
			table = JDBCUtil.selectList(sql);
			int num = 0;
			for(int i = 0; i < table.size(); i++) {
				if(num < Integer.parseInt(String.valueOf(table.get(i).get("BOARD_NO")))) {
					num = Integer.parseInt(String.valueOf(table.get(i).get("BOARD_NO")));
				}
			}
			param = new ArrayList<Object>();
			post.put("BOARD_NO", num + 1);
			param.add(post.get("BOARD_NO"));
			
			System.out.print("제목 : ");
			post.put("TITLE", ScanUtil.nextLine());
			param.add(post.get("TITLE"));
			
			System.out.print("내용 : ");
			post.put("CONTENT", ScanUtil.nextLine());
			param.add(post.get("CONTENT"));
			
			System.out.print("작성자 : ");
			post.put("MEM_ID", ScanUtil.nextLine());
			param.add(post.get("MEM_ID"));		
			
			table.add(post);			
			
			
			sql = "insert into tb_jdbc_board values(?,?,?,?,SYSDATE)";			
			
			JDBCUtil.update(sql, param);
			
			System.out.println("성공적으로 글이 생성되었습니다!");
			
	}
	
	
	//MataDate 사용하기
//	void MataD() {
//		try {
//			con = DriverManager.getConnection(url, user, password);
//			ps = con.prepareStatement(sql);
//			rs = ps.executeQuery();
//			
//			ResultSetMetaData MataData = rs.getMetaData();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			if(rs != null) try { rs.close(); } catch(Exception e) {}
//			if(ps != null) try { ps.close(); } catch(Exception e) {}
//			if(con != null) try { con.close(); } catch(Exception e) {}
//		}	
//		
//	}
	
// sql = "   INSERT INTO TB_JDBC_BOARD"
// 		+ " VALUES("
// 		+ " (SELECT NAL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD)"
// 		+ " , ?, ?, ?"
// 		+ " SYSDATE"
// 		+ " )";

}
