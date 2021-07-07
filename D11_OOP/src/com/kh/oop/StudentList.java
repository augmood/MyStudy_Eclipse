package com.kh.oop;

public class StudentList {
	//ManageStudent를 나누기
	//여러명의 학생 데이터를 저장하는 용도 
	private Student [] students;
	
	public StudentList() {
		students = new Student[3];
	}
	
	public void setStudent(Student [] students) {
		this.students = students;
	}
	
	public Student [] getStudents() {
		return students;
	}

}
