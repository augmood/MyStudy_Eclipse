package com.kh.typetrans;

public class TestTypeTrans {
	public static void main(String [] args) {
		int iNum = 12;
		double dNum = 3.3;
		double result = iNum + dNum;
		System.out.println("�ڵ�����ȯ ������ ����� : "+result);
		// ū -> ���� ������ Ÿ������ ��ȯ�Ǹ鼭 �������� �ս��� �Ͼ�� ���� ����ȯ
		System.out.println("��������ȯ�� ���� ����� : "+(int)result);
		
		int b = 890831;
		double i = b;
		System.out.println("����ȣ : "+(int)i);
	
	}

}