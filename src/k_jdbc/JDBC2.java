package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "LBJ94";
		String password = "JAVA";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		//1번 문항
		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "select * " + " from cart " // 전방 큰 따옴표 뒤에 공백이 반드시 있어야 된다.
					+ " where cart_member = ? " // ? : 쿼리를 작성할 때 값은 ?로 대신하고 나중에 채워 넣는다.
					+ " and cart_qty > ?";
			ps = con.prepareStatement(sql); // 문자열로 만든 쿼리를 오라클에 보낼 수 있는 형태로 만든 것
			ps.setString(1, "a001"); // ?를 채워넣는 과정, (물음표의 순번, 채워넣을 값)
			ps.setInt(2, 5); // ?에 들어갈 수 있는건 값만 들어갈 수 있다.(컬럼이나 키워드는 들어갈 수 없다)
//			ps.setObject(0, sql); -> 타입에 상관없이 넣을 수 있는 메서드

			rs = ps.executeQuery(); // 쿼리를 실행

			ResultSetMetaData metaData = rs.getMetaData();
			// 메타데이터 : 데이터에 대한 데이터

			int columnCount = metaData.getColumnCount(); // 컬럼의 수를 뽑는 메서드

			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(rs.getObject(i) + "\t"); // 모든 값을 출력하기 위한방법
				}
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)	try {rs.close();} catch (Exception e) {}
			if (ps != null)	try {ps.close();} catch (Exception e) {}
			if (con != null)try {con.close();} catch (Exception e) {}
		}

		

		//2번 문항
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select *"
					+ " from member"
					+ " where mem_add1 like '%' || ? || '%'";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, "대전");
			
			rs = ps.executeQuery();
			
			ResultSetMetaData mataData = rs.getMetaData();
			
			int columnCount = mataData.getColumnCount();
			
			while(rs.next()) {
				for(int i = 1; i <= columnCount; i++) {
					System.out.print(rs.getObject(i) + "\t");				
				}
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		
		
		//3번 문항
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select prod_lgu as 상품분류,"
					+ " round(avg(prod_price)) as 평균판매가,"
					+ " round(avg(prod_cost)) as 평균매입가,"
					+ " round(avg(prod_price) - avg(prod_cost))"
					+ " from prod"
					+ " group by prod_lgu";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			
			
			ResultSetMetaData mataData = rs.getMetaData();			
			
			int columnCount = mataData.getColumnCount();
			
			
			
						
			while(rs.next()) {				
				for(int i = 1; i <= columnCount; i++) {
					System.out.print(mataData.getCatalogName(i) + "\t");
					System.out.print(rs.getObject(i) + "\t");
				}
				System.out.println();				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {rs.close();} catch(Exception e) {}
			if(con != null) try {rs.close();} catch(Exception e) {}

		}
		
		
	}
}
