package com.dto;

public class StudentDTO {
	
	private String studentNo;
	private String departmentNo;
	private String studentName;
	private String studentSsn;
	private String studentAddress;
	private String entranceDate;
	private char absenceYn;
	private String coachProfessorNo;
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDTO(String studentNo, String departmentNo, String studentName, String studentSsn,
			String studentAddress, String entraceDate, char absenceYn, String coachProfessorNo) {
		super();
		this.studentNo = studentNo;
		this.departmentNo = departmentNo;
		this.studentName = studentName;
		this.studentSsn = studentSsn;
		this.studentAddress = studentAddress;
		this.entranceDate = entraceDate;
		this.absenceYn = absenceYn;
		this.coachProfessorNo = coachProfessorNo;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSsn() {
		return studentSsn;
	}
	public void setStudentSsn(String studentSsn) {
		this.studentSsn = studentSsn;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getEntrnaceDate() {
		return entranceDate;
	}
	public void setEntrnaceDate(String entraceDate) {
		this.entranceDate = entraceDate;
	}
	public char getAbsenceYn() {
		return absenceYn;
	}
	public void setAbsenceYn(char absenceYn) {
		this.absenceYn = absenceYn;
	}
	public String getCoachProfessorNo() {
		return coachProfessorNo;
	}
	public void setCoachProfessorNo(String coachProfessorNo) {
		this.coachProfessorNo = coachProfessorNo;
	}
	@Override
	public String toString() {
		return "StudentDTO [studentNo=" + studentNo + ", departmentNo=" + departmentNo + ", studentName=" + studentName
				+ ", studentSsn=" + studentSsn + ", studentAddress=" + studentAddress + ", entranceDate=" + entranceDate
				+ ", absenceYn=" + absenceYn + ", coachProfessorNo=" + coachProfessorNo + "]";
	}
	
	
			

}
