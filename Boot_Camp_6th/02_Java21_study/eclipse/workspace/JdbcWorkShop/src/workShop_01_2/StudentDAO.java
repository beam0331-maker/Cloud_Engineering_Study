package workShop_01_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	public List<StudentDTO> list(Connection con) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();

		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			String sql = """
					select
						STUDENT_NO,
						DEPARTMENT_NO,
						STUDENT_NAME,
						rpad(substr(STUDENT_SSN,1,8),14,'*') as STUDENT_SSN,
						concat(substr(STUDENT_ADDRESS,1,10),'...') as STUDENT_ADDRESS,
						date_format(ENTRANCE_DATE, '%Y/%m/%d') as ENTRANCE_DATE,
						ABSENCE_YN,
						COACH_PROFESSOR_NO
						from tb_student;
					   """;

			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {

				String stuNo = rs.getString("STUDENT_NO");
				String departNo = rs.getString("DEPARTMENT_NO");
				String stuName = rs.getString("STUDENT_NAME");
				String stuSsn = rs.getString("STUDENT_SSN");
				String stuAddress = rs.getString("STUDENT_ADDRESS");
				String Date = rs.getString("ENTRANCE_DATE");
				char absYn = rs.getString("ABSENCE_YN").charAt(0);
				String coachProfessorNo = rs.getString("COACH_PROFESSOR_NO");
				list.add(new StudentDTO(stuNo, departNo, stuName, stuSsn, stuAddress, Date, absYn, coachProfessorNo));

			}

		} catch (SQLException e) {

			System.err.println(e.getMessage());

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
			} catch (Exception e2) {
				System.err.println(e2.getMessage());
			}

		} // try-catch-finally end
		return list;
	}// list() end
}// class end
