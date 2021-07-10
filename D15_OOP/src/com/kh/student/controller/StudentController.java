package com.kh.student.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.student.model.vo.Student;

public class StudentController {
	
	private List<Student> stdList; //���� �����
	
	public StudentController() {
		stdList = new ArrayList<Student>();
	}
	
	// �л� �Է¿�, ������ ������
	public void addStudent(Student student) {
		stdList.add(student);
	}
	
	// �л� ��ȸ�� 
	public ArrayList<Student> selectAll() {
		return (ArrayList<Student>)stdList;
	}
	
	// �й� ��ȸ
	public Student selectOne(int classNumber) {
		for(int i = 0; i < stdList.size(); i++) {
			int storedNum = stdList.get(i).getClassNumber();
			if(storedNum == classNumber) {
				return stdList.get(i);
			}
		}
		return null; // �´°� ������.
		
	}
	
	// �̸� ��ȸ, ������ ��� -> view�� modify���� �Ѿ��
	public Student selectOne(String studentName) {
		for( int i = 0; i < stdList.size(); i++) {
			String storedName = stdList.get(i).getName();
			if(storedName.equals(studentName)) {
				return stdList.get(i);
			}
		}
		return null;
	}
	
	// ���� ������
	public void updateStudent(Student student) {
		//�Ѱܹ��� ���� ����Ʈ���� ���°���� �𸣱� ������
		// ã�� ��, ���� ��ġ���� ������ ����� ��.
		for(int i = 0; i < stdList.size(); i++) {
			int storedNum = stdList.get(i).getClassNumber();
			if(storedNum == student.getClassNumber()) {
				
				stdList.remove(i);
				stdList.add(i,student);
				// stdList.set(i, student);
				
			}
		}
		
	}
	
	// �л� ���� ������
	public boolean deleteStudent(String studentName) {
		for(int i = 0; i<stdList.size(); i++) {
			String storedName = stdList.get(i).getName();
			if(storedName.equals(studentName)) {
				// �Է��� �̸��� ����� �̸��� ������ �����Ѵ�.
				stdList.remove(i);
				return true;
			}
		}
		return false;
	}
	
}

