package com.kh.student.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.student.model.vo.Student;

public class StudentController {
	
	private List<Student> stdList; //최종 저장소
	
	public StudentController() {
		stdList = new ArrayList<Student>();
	}
	
	// 학생 입력용, 데이터 저장함
	public void addStudent(Student student) {
		stdList.add(student);
	}
	
	// 학생 조회용 
	public ArrayList<Student> selectAll() {
		return (ArrayList<Student>)stdList;
	}
	
	// 학번 조회
	public Student selectOne(int classNumber) {
		for(int i = 0; i < stdList.size(); i++) {
			int storedNum = stdList.get(i).getClassNumber();
			if(storedNum == classNumber) {
				return stdList.get(i);
			}
		}
		return null; // 맞는게 없을때.
		
	}
	
	// 이름 조회, 수정시 사용 -> view의 modify에서 넘어옴
	public Student selectOne(String studentName) {
		for( int i = 0; i < stdList.size(); i++) {
			String storedName = stdList.get(i).getName();
			if(storedName.equals(studentName)) {
				return stdList.get(i);
			}
		}
		return null;
	}
	
	// 정보 수정용
	public void updateStudent(Student student) {
		//넘겨받은 값이 리스트에서 몇번째인지 모르기 때문에
		// 찾은 후, 같은 위치에서 수정을 해줘야 함.
		for(int i = 0; i < stdList.size(); i++) {
			int storedNum = stdList.get(i).getClassNumber();
			if(storedNum == student.getClassNumber()) {
				
				stdList.remove(i);
				stdList.add(i,student);
				// stdList.set(i, student);
				
			}
		}
		
	}
	
	// 학생 정보 삭제용
	public boolean deleteStudent(String studentName) {
		for(int i = 0; i<stdList.size(); i++) {
			String storedName = stdList.get(i).getName();
			if(storedName.equals(studentName)) {
				// 입력한 이름과 저장된 이름이 같을때 삭제한다.
				stdList.remove(i);
				return true;
			}
		}
		return false;
	}
	
}

