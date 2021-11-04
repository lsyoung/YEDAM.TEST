package com.yedam.java.example;

public class Student {

	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		if(studentNum.equals(student.studentNum)) {
			return true;
		}
		return false;
	}
	@Override 
	public int hashCode() {
		return studentNum.hashCode();
	}
}
