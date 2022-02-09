package service;

import java.util.List;
import java.util.Map;

import dao.BoardDao;
import util.ScanUtil;
import util.View;

public class BoardService {
	
private BoardService() {
		
	}
	//싱글톤 생성
	private static BoardService instance; //객체를 만들어서 보관할 변수
	public static BoardService getInstance() {
		if(instance == null) { //변수 안에 객체가 생성되어 있는지 확인
			instance = new BoardService(); //없을 시 생성해서 리턴
		}
		return instance;
	}
	
	private BoardDao boardDao = BoardDao.getInstance();
	
	//목록 출력 화면
	public int boardList() {
		List<Map<String, Object>> boardList = boardDao.selectBoardList();
		
		System.out.println("============================");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("----------------------------");
		for(Map<String, Object> board : boardList) {
			System.out.println(board.get("BOARD_NO")
					+ "\t" + board.get("TITLE")
					+ "\t" + board.get("MEM_NAME")
					+ "\t" + board.get("REG_DATE"));
		}
		System.out.println("============================");
		System.out.println("1.조회   2.등록   0.로그아웃>");
		
		int input = ScanUtil.nextInt();
		
		switch(input) {
		case 1: insert();
		case 2: create();
		case 0:
			MemberService.loginMember = null;
			return View.HOME;
		}
		
		return View.BOARD_LIST;		
	}

	private void create() {
//		Map<String, Object> list = boardDao.selectBoardList();
				
		System.out.println("새로운 글을 등록합니다.");
		
	}

	private void insert() {
		
	}
	
	
	
	
	
	
	
}
