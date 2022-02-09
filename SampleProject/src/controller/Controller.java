package controller;

import service.MemberService;
import service.BoardService;
import util.ScanUtil;
import util.View;

public class Controller {

	public static void main(String[] args) {

		/*
		 * 발표내용 : 조 소개 > 주제 소개 > 주제 선정 배경 > 메뉴 구조 > 시연 > 프로젝트 후기
		 * 발표인원 : 발표자 1명, ppt 및 시연 도우미 1명
		 * 
		 * controller : 화면 이동, 다른 화면으로 넘어갈 수 있게 하는 메서드
		 * service : 화면 기능, 화면 기능에 관련된 메서드들이 모여있는 곳 	
		 * dao : 데이터베이스 접속 관련 내용
		 * 웹 개발시 위와 같은 구조로 보통 나눈다.
		 * 
		 */
		
		new Controller().start();
		
	}

	private MemberService memberService = MemberService.getInstance();
	private BoardService boardService = BoardService.getInstance();
	
	
	//프로그램 시작
	private void start() {
		int view = View.HOME; //첫 화면 구성
		
		//화면 이동을 자유롭게 만들게 하기 위한 함수
		while(true) {
			switch(view) {
			case View.HOME: view = home(); break; //홈 화면 다음에 어떤 화면을 보여줄건지 정하는 함수
			case View.LOGIN: view = memberService.login(); break;
			case View.JOIN: view = memberService.join(); break; //회원가입을 마친 뒤 다음 화면으로 이동할 수 있도록 한다.
			case View.BOARD_LIST: view = boardService.boardList(); break;
				
			}
		}
		
	}

	private int home() {
		System.out.println("-------------------------------");
		System.out.println("1.로그인  2.회원가입  0.프로그램 종료>");
		System.out.println("-------------------------------");
		int input = ScanUtil.nextInt();
		
		switch(input) {
		case 1: return View.LOGIN; //메서드 호출 없이 return을 하게 한다.
		case 2: return View.JOIN;
		case 0:
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);
		}
		return View.HOME;
	}

}
