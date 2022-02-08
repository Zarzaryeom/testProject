package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
	
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바와 데이터베이스를 연결해주는 라이브러리
		 * - ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성단계
		 * 1. Connection 생성(DB 연결)
		 * 2. Statement 생성(쿼리 작성)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기		
		*/
		
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//jdbc:oracle:thin : 오라클 버전을 의미함
		//localhost:1521:xe : 오라클의 호스트 이름, 포트, sid를 의미
		//타인의 컴퓨터를 들어가고 싶으면 localhost를 사용하고 싶은 컴퓨터의 ip주소 입력
		String user = "LBJ94";
		String password = "JAVA";
		
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from member"; //SQL의 쿼리문은 String으로 묶는다.
			ps = con.prepareStatement(sql);  //prepareStatement를 오라클에 적합하게 바꿔서 return해주는 명령
			
			//select인 경우
			rs = ps.executeQuery(); //쿼리를 실행하기 위한 명령
			
			//insert, update, delete인 경우, 리턴 타입의 차이로 인해 select와 다른 명령어를 사용한다.
//			int result = ps.executeUpdate();
			//result : 영향을 받은 행의 수			
			
			//Oracle 실행 결과를 추출 하기 위한 함수
			//한 줄씩 확인을 해야되기 때문에 next메서드를 활동한다, 더 이상 찾을 행이 없을 때까지 반복을 한다.
			while(rs.next()) {
				//컬럼을 하나하나씩 가져오는 방법은 2가지가 있다.
				String memId = rs.getString(1); // 컬럼의 인덱스
				String memPass = rs.getString("MEM_PASS"); // 컬럼명
				
				System.out.println("MEM_ID : " + memId + "/ MEM_PASS : " + memPass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} //찾았던 객체를 닫기, 닫는 것은 반드시 순서대로 닫아야 된다!(열었던 순서의 역순)
		  //닫는 도중에도 오류가 발생될 수 있기에 반드시 try catch문으로 묶어준다.
		finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
