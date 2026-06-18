package workShop_01_1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.StringJoiner;

public class StudentInfoSearch {

	public static void main(String[] args) {
		
		System.out.println("***********************************************");
		System.out.println("           [학생 정보 관리 메뉴]");
		System.out.println("***********************************************");
		System.out.print("""
				0. 종료
				1. 전체 학생 목록
				""");
		System.out.println("***********************************************");
		System.out.print("메뉴입력 => ");		
		
		Scanner sc = new Scanner(System.in);		
		if( sc.nextInt() == 0) System.exit(1);
		else {
			String dirver = "com.mysql.cj.jdbc.Driver";	
			String url = "jdbc:mysql://localhost:3306/workshop";
			String userid = "root";
			String passwd = "1234";
			
			StringBuilder sb = new StringBuilder();
			
			try {
				Class.forName(dirver);
			} catch (ClassNotFoundException e) {
				System.err.println(e.getMessage());
			}
			
			Connection con = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			
			try {
				con = DriverManager.getConnection(url, userid, passwd);
				
				
				String sql = """
					    SELECT 
					        STUDENT_NO AS '학번',
					        STUDENT_NAME AS '이름',
					        RPAD(SUBSTR(STUDENT_SSN, 1, 8), 14, '*') AS '주민번호',
					        CONCAT(SUBSTR(STUDENT_ADDRESS, 1, 10), '...') AS '주소',
					        DATE_FORMAT(ENTRANCE_DATE, '%Y/%m/%d') AS '입학년도',
					        ABSENCE_YN AS '휴학여부'
					    FROM tb_student
					    """;			
				
				
				psmt = con.prepareStatement(sql);
				rs = psmt.executeQuery();
				while (rs.next()) {
					StringJoiner sj = new StringJoiner("\t");
					
					String studentNo = rs.getString("학번");
					String studentName = rs.getString("이름");
					String studentSSN = rs.getString("주민번호");
					String studentAddr = rs.getString("주소");
					String entranceDate = rs.getString("주소");
					String absenceYN = rs.getString("휴학여부");			
					sb.append(sj.add(studentNo).add(studentName).add(studentSSN).add(studentAddr).add(entranceDate).add(absenceYN)).append("\n");
				}
				
			} catch (SQLException e) {
				
				System.err.println(e.getMessage());
				
			}finally {
				try {
					if(rs != null) rs.close();
					if(psmt != null)psmt.close();
					if(con != null)con.close();				
				} catch (Exception e2) {
					System.err.println(e2.getMessage());
				}
				
			}//try-catch-finally end	
			System.out.println(sb);
		}// else end		
		
		
	}// main end

}// class end
