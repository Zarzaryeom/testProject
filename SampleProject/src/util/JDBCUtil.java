package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "LBJ94";
	private static String password = "JAVA";
	
	private static Connection con = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	/*
	 * sql문을 간편하게 사용하기 위한 메서드를 만들어라!
	 * 
	 * Map<String, Object> selectOne(String sql)  // selectOne : 조회 결과가 한 줄일 때 사용
	 * Map<String, Object> selectOne(String sql, List<Object> param) // List<Object> param : 쿼리 안에 ?가 있을 때 사용, 물음표 순서대로 ArrayList에 입력 
	 * List<Map<String, Object>> selectList(String sql) // selectList : 조회 결과가 여러 줄일 때 사용
	 * List<Map<String, Object>> selectList(String sql, List<Object> param)
	 * int update(String sql) : update : select 절을 제외한 나머지 절을 사용하기 위한 메서드
	 * int update(String sql, List<Object> param)
	*/
	
	public static Map<String, Object> selectOne(String sql){
		Map<String, Object> map = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			
			if(rs.next()) {
				map = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return map;
	}
	
	public static Map<String, Object> selectOne(String sql, List<Object> param){
		Map<String, Object> map = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			for(int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i));
			}
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			
			if(rs.next()) {
				map = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return map;
	}
	
	public static List<Map<String, Object>> selectList(String sql){
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return list;
	}
	
	public static List<Map<String, Object>> selectList(String sql, List<Object> param){
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			//파라미터로 받은 물음표 값을 for문을 이용해 하나씩 받는다.
			for(int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i)); // 물음표는 1부터 시작하기에 '+ 1'이 들어간다.
			}
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			
			//하나씩 추출해서 ArrayList에 담는다.
			while(rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(map);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {rs.close();} catch(Exception e) {}
			if(con != null) try {rs.close();} catch(Exception e) {}
		}
		
		return list ;		
	}
	
	public static int update(String sql) {
		int result = 0;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return result;
	}
	
	public static int update(String sql, List<Object> param) {
		int result = 0;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			for(int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i));
			}
			//result는 insert, delete, update에서는 반영된 컬럼의 건수를 반환
			//create, drop에선ㄴ -1을 반환
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return result;
	}
	
}















