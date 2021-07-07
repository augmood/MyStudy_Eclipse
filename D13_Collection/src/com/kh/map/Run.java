package com.kh.map;

import java.util.HashMap;
import java.util.Map;

import com.kh.set.Student;

public class Run {
	public static void main(String [] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("02", "Seoul");
		map.put("031", "gyeonggido");
		map.put("053", "daegu");
		map.put("061","jeollado");
		
		System.out.println("02�� ������ ������ ���ɴϴ� : "+map.get("02"));
		System.out.println("031�� ������ ��⵵�� ���ɴϴ� : "+map.get("031"));
		System.out.println("����� �������� �� : "+map.size());
		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////////////
		Map<String, Object> student = new HashMap<String, Object>();
		student.put("name", "alex");
		student.put("score", "97");
		System.out.println("name : "+student.get("name")+", score : "+student.get("score"));
		System.out.println();
		////////////////////////////////////////////////////////////////////////////
		Student std = new Student("alex", 97);
		System.out.println(std.toString());
		//////////////////////////////////////////////////////////////////////////////
		System.out.println();
		Map<Integer, Student> stdMap = new HashMap<Integer, Student>();
		stdMap.put(1, new Student("gemma", 100));
		stdMap.put(2, new Student("lucy", 99));
		stdMap.put(3, new Student("jamie", 98));
		stdMap.put(4, new Student("jessie", 97));
		System.out.println("Ű ���� �̿��ؼ� ����� Student ��ü �������� : "+stdMap.get(1));
		System.out.println("Ű ���� �̿��� �ι�° �� : "+stdMap.get(4).toString());
		
	}

}
