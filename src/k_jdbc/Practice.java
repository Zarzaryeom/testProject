package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Practice {
	
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "LBJ94";
		String password = "JAVA";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select prod_lgu as 상품분류,"
					+ " round(avg(prod_price)) as 평균판매가,"
					+ " round(avg(prod_cost)) as 평균매입가,"
					+ " round(avg(prod_price) - avg(prod_cost)) as 평균수익"
					+ " from prod"
					+ " group by prod_lgu";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
						
			ResultSetMetaData mataData = rs.getMetaData();			
			
			int columnCount = mataData.getColumnCount();
			
			
			
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(mataData.getColumnName(i) + "\t");
			}
			System.out.println();
			
			while (rs.next()) {				
				for (int i = 1; i <= columnCount; i++) {
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
		
		
		String sql = "select prod_lgu as 상품분류,"
				+ " round(avg(prod_price)) as 평균판매가,"
				+ " round(avg(prod_cost)) as 평균매입가,"
				+ " round(avg(prod_price) - avg(prod_cost)) as 평균수익"
				+ " from prod"
				+ " group by prod_lgu";
		
		JDBCUtil.selectList(sql);
		
		
//		try {
//			con = DriverManager.getConnection(url, user, password);
//			
//			String sql = "SELECT A.DEPARTMENT_ID AS 부서코드,"
//					+ " B.DEPARTMENT_NAME AS 부서명,"
//					+ " ROUND(AVG(A.SALARY),1) AS 평균급여,"
//					+ " ROUND(AVG(EXTRACT(YEAR FROM SYSDATE) - EXTRACT(YEAR FROM A.HIRE_DATE))) AS 평균근속년수"
//					+ " FROM HR.EMPLOYEES A, HR.DEPARTMENTS B, HR.LOCATIONS C"
//					+ " WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID"
//					+ " AND B.LOCATION_ID = C.LOCATION_ID"
//					+ " AND C.COUNTRY_ID != 'US'"
//					+ " group by a.department_id, b.department_name";
//			
//			ps = con.prepareStatement(sql);
//			
//			rs = ps.executeQuery();
//						
//			ResultSetMetaData mataData = rs.getMetaData();			
//			
//			int columnCount = mataData.getColumnCount();
//			
//			
//			
//			for (int i = 1; i <= columnCount; i++) {
//				System.out.print(mataData.getColumnName(i) + "\t");
//			}
//			System.out.println();
//			
//			while (rs.next()) {				
//				for (int i = 1; i <= columnCount; i++) {
//					System.out.print(rs.getObject(i) + "\t");
//				}
//				System.out.println();
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if(rs != null) try {rs.close();} catch(Exception e) {}
//			if(ps != null) try {rs.close();} catch(Exception e) {}
//			if(con != null) try {rs.close();} catch(Exception e) {}
//		}
//		
//		
//	}

}
}
