package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

	public class PersonController {
		private Student [] s;
		private Employee [] e;
		private int sIndex;
		private int eIndex;

	
	public PersonController() {
		s = new Student[3];
		e = new Employee[10];
		sIndex = 0;
	}
	
	public int [] personCount() {
		int [] counts = new int[2];
		counts[0] = sIndex;
		counts[1]= e.length;
		return counts;
	}
	
	public void insertStudent(String name, int age, double height, 
			double weight, int grade, String major) {
		
		s[sIndex] = new Student();
		s[sIndex].setName(name);
		s[sIndex].setAge(age);
		s[sIndex].setHeight(height);
		s[sIndex].setWeight(weight);
		s[sIndex].setGrade(grade);
		s[sIndex].setMajor(major);
		if (sIndex < 3) {
			sIndex++;
		}
	}
	
	public Student [] printStudent() {
			
		return s;		
	}
	
	public void insertEmployee(String name, int age, double height, 
			double weight, int salary, String dept) {
		
		e[eIndex] = new Employee();
		e[eIndex].setName(name);
		e[eIndex].setAge(age);
		e[eIndex].setHeight(height);
		e[eIndex].setWeight(weight);
		e[eIndex].setSalary(salary);
		e[eIndex].setDept(dept);
		eIndex++;
	}
	
	public Employee [] printEmployee() {
		return e;
	}
	


}