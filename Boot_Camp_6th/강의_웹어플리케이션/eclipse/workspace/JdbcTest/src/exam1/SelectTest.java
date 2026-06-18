package exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {
	    String driver = "com.mysql.cj.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/testdb";
	    String userid = "root";
	    String passwd = "1234";

	    // 변수를 try 밖에서 미리 선언하고 null로 초기화합니다.
	    Connection con = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;

	    try {
	        // 1. 드라이버 로딩
	        Class.forName(driver);

	        // 2. Connection 맺기 (변수 url에 따옴표 빼기!)
	        con = DriverManager.getConnection(url, userid, passwd);

	        // 3. sql문 작성
	        String sql = "select deptno, dname, loc from dept";

	        // 4. PreparedStatement 얻기 (변수 sql에 따옴표 빼기!)
	        pstmt = con.prepareStatement(sql);

	        // 5. sql 문 실행
	        rs = pstmt.executeQuery();
	        
	        while (rs.next()) {
	            int deptno = rs.getInt("deptno");
	            String dname = rs.getString("dname");
	            String loc = rs.getString("loc");
	            System.out.println(deptno + " " + dname + " " + loc);
	        }

	    } catch (ClassNotFoundException e) {
	        System.err.println("드라이버 로딩 실패: " + e.getMessage());
	    } catch (SQLException e) {
	        System.err.println("DB 연결 또는 쿼리 실행 실패: " + e.getMessage());
	    } finally {
	        // 6. 자원 반납 (finally 블록에서 수행해야 안전합니다)
	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	            if (con != null) con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

}
