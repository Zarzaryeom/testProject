package service;

import java.util.HashMap;
import java.util.Map;

import dao.MemberDao;
import util.ScanUtil;
import util.View;

public class MemberService {

	//싱글톤 패턴 : 하나의 객체를 돌려쓰게 만들어주는 디자인 패턴
	//디자인 패턴 : 클래스를 만들면서 생기는 패턴을 정립한 것
	private MemberService() {		
	}	
	private static MemberService instance; //객체를 만들어서 보관할 변수
	public static MemberService getInstance() {
		if(instance == null) { //변수 안에 객체가 생성되어 있는지 확인
			instance = new MemberService(); //없을 시 생성해서 리턴
		}
		return instance;
	}
	
	//웹에선 로그인한 정보를 세션에 저장하지만 자바는 그러한 기능이 없기에 변수에 저장 및 저장된 상태를 유지하기 위해 static 사용
	public static Map<String, Object> loginMember; 
	
	private MemberDao memberDao = MemberDao.getInstance();
	
	//회원 가입 화면
	public int join() {
		System.out.println("============= 회원가입 ================");
		System.out.println("아이디>");
		String memID = ScanUtil.nextLine();
		System.out.println("비밀번호>");
		String password = ScanUtil.nextLine();
		System.out.println("이름>");
		String memName = ScanUtil.nextLine();
		//아이디 중복 확인
		//비밀 번호 확인
		//유효성 검사(정규표현식)
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("MEM_ID", memID);
		param.put("PASSWORD", password);
		param.put("MEM_NAME", memName);
		
		int result = memberDao.insertMember(param);
		//이 메서드를 다른 화면에서 중복해서 사용할 수도 있기에 dao라는 패키지를 따로 만들어 관리한다.
		
		if(0 < result) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		return View.HOME;
	}

	//로그인 화면
	public int login() {
		System.out.println("============= 로그인 ===============");
		System.out.println("아이디>");
		String memId = ScanUtil.nextLine();
		System.out.println("비밀번호>");
		String password = ScanUtil.nextLine();
		
		Map<String, Object> member = memberDao.selectMember(memId, password);
		
		if(member == null) {
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}else {
			System.out.println("로그인 성공");
			loginMember = member; //웹에선 로그인한 정보를 세션에 저장하지만 자바는 그러한 기능이 없기에 변수에 저장
			return View.BOARD_LIST; //로그인 성공 시 
		}
		return View.LOGIN; //로그인 실패 시
	}
	
}
