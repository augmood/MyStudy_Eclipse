package com.kh.typetrans;

public class TestTypeTransTwo {
	public static void main(String [] args){
	int num = 2147483647;
	int result = num+1;
	System.out.println("����� : "+result); 
	// -> �ִ밪���� +1�� �Ǿ� �����÷ο찡 ���� -�� �Ǵ°�
	
	long result_=(long)num+1;
	//�ڵ�����ȯ�� ���� ���� ��� ���� ������Ÿ�Կ��� ū ������Ÿ������ ��������ȯ
	
	System.out.println("�����Ѱ� :"+result_); // -> �����÷ο찡 ���� ����

	}
}
