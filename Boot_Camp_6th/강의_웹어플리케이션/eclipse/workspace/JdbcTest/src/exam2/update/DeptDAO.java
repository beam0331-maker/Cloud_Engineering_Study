package exam2.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDAO {

	public int update(Connection con, DeptDTO dto){
		PreparedStatement pstmt = null;

		String sql = "update dept set dname=? ,  loc=?  where deptno=?";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(3, dto.getDeptno());
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {			
			 e.printStackTrace();			
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				System.err.println("pstmt.close err : " + e2.getMessage());
			}
		}

		return result;
	}// insert() end
}// class end
