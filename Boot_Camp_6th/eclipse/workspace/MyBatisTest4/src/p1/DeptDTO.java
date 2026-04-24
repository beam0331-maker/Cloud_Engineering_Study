package p1;

public class DeptDTO {
	int empno;
	String dname;
	String loc;
	public DeptDTO() {
		// TODO Auto-generated constructor stub
	}
	public DeptDTO(int empno, String dname, String loc) {
		this.empno = empno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "DeptDTO [empno=" + empno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	

}
