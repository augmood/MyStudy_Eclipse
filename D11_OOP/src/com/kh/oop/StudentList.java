package com.kh.oop;

public class StudentList {
	//ManageStudent�� ������
	//�������� �л� �����͸� �����ϴ� �뵵 
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
