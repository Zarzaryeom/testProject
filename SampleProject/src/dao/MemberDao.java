package dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class MemberDao {

	private MemberDao() {

	}
	private static MemberDao instance; // 객체를 만들어서 보관할 변수
	public static MemberDao getInstance() {
		if (instance == null) { // 변수 안에 객체가 생성되어 있는지 확인
			instance = new MemberDao(); // 없을 시 생성해서 리턴
		}
		return instance;
	}
	
	
	
	public int insertMember(Map<String, Object> param) {
		String sql = "INSERT INTO TB_JDBC_MEMBER"
				+ " VALUES(?, ?, ?)";
		List<Object> _param = new ArrayList<Object>();
		_param.add(param.get("MEM_ID"));
		_param.add(param.get("PASSWORD"));
		_param.add(param.get("MEM_NAME"));
		
		return JDBCUtil.update(sql, _param);		
	}
	
	public Map<String, Object> selectMember(String memId, String password){
		String sql = "SELECT MEM_ID"
				+ "		   , PASSWORD"
				+ "        , MEM_NAME"
				+ "     FROM TB_JDBC_MEMBER"
				+ "    WHERE MEM_ID = ?"
				+ "      AND PASSWORD = ?";
		List<Object> param = new ArrayList<Object>();
		param.add(memId);
		param.add(password);
		
		return JDBCUtil.selectOne(sql, param);
	}
	

}
