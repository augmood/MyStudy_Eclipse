package com.kh.control;

import java.util.Scanner;

public class Exam_Break1 {
	public static void main(String [] args) {
		// break���� ���� ����� �ݺ����� ���������� ����
		// for ���� ��ø���� ��� ���� �� ���������� �Ϸ��� break 2�� �ʿ�
		
		// ���ڿ��� �Է¹޾� ���� ������ ����ϴ� ���α׷�
		// "end"�� �ԷµǸ� �ݺ��� ������.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			// 1. ���ڿ��� �񱳴� ��� �� �� �ΰ�? equals (str�� ��� ok)
			if(str.equals("end")) break; // == �̷��� �ȵ�, ���� ��� {} ���ΰ� �극��ũ 
			// 2. ���ڿ��� ����, ������ ��� ����ϴ� ���ΰ�? length() / 
			str.length();
			System.out.println("���� ���� : "+str.length());
		}

	}

}
