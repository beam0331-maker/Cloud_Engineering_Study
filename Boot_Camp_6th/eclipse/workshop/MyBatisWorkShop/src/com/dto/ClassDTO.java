package com.dto;

public class ClassDTO {
	String classNo;
	String departmentNo;
	String preattendingClassNo;	
	String className;
	String classType;
	public ClassDTO() {
		// TODO Auto-generated constructor stub
	}
	public ClassDTO(String classNo, String departmentNo, String preattendingClassNo, String className,
			String classType) {
		super();
		this.classNo = classNo;
		this.departmentNo = departmentNo;
		this.preattendingClassNo = preattendingClassNo;
		this.className = className;
		this.classType = classType;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public String getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getPreattendingClassNo() {
		return preattendingClassNo;
	}
	public void setPreattendingClassNo(String preattendingClassNo) {
		this.preattendingClassNo = preattendingClassNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	@Override
	public String toString() {
		return "ClassDTO [classNo=" + classNo + ", departmentNo=" + departmentNo + ", preattendingClassNo="
				+ preattendingClassNo + ", className=" + className + ", classType=" + classType + "]";
	}
	
	
	
}
