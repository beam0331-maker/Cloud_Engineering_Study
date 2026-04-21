package workShop_01_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {

	String dirver = "com.mysql.cj.jdbc.Driver";	
	String url = "jdbc:mysql://localhost:3306/workshop";
	String userid = "root";
	String passwd = "1234";
	
	private StudentDAO dao;
	
	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<StudentDTO> list() {
		List<StudentDTO> list = null;
		Connection con = null;		
		
		try {
			Class.forName(dirver);
			
		} catch (ClassNotFoundException e) {
			System.err.println("Driver err : " + e.getMessage());
		}
		
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.list(con);
		} catch (SQLException e) {
			System.out.println("StudentServiceImpl : " + e.getMessage());
		}finally {
			
			try {
				if(con != null) con.close();
				
			} catch (Exception e2) {
				System.out.println("Connecton Close err : " + e2.getMessage());
			}
			
		}
		
		return list;
	}// list() end
	
}// class end
