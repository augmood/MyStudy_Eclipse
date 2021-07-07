package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Run {
	public static void main(String [] args) {
		/*
		 * set�� Ư¡
		 * ����� ���� ������ �������� �ʰ� �ߺ��� ������� ����
		 * ������ �����Ƿ� index�� ���� �Ұ����ϸ�
		 * iterator�� �̿��Ͽ� ��ҿ� ���� ������.
		 */
		
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("two");
		
		System.out.println("����� �������� �� : "+set.size());
		set.clear();
		System.out.println("����� �������� �� : "+set.size());
		System.out.println("�����Ͱ� �����Ǿ����� T / �ƴϸ� F : "+set.isEmpty());
		
		Set<Student> stdSet = new HashSet<Student>();
		stdSet.add(new Student("tommy", 100));
		stdSet.add(new Student("teo", 99));
		stdSet.add(new Student("jenny", 98));
		stdSet.add(new Student("alex", 97));
		System.out.println();
		
		Iterator<Student> it = stdSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
