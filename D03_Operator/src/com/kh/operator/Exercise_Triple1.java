package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple1 {
	public static void main(String [] args) {
		
	Scanner sc = new Scanner(System.in);
	
	// �Է¹��� ������ ���, 0, �������� �Ǻ� �� ����ϼ���
	// �ʹ� ������ ���, ���� �Ǻ����� �غ�����
	
	// ������ �Է����ּ��� : -1
	// -1��/�� �����Դϴ�.
	//������ �Է����ּ��� : 0
	// 0��/0�Դϴ�.
	// 0���� �ƴ��� �Ǻ�, 0�϶��� 0�Դϴ�. 0�� �ƴҶ��� ���/���� �Ǻ�
	// result = num == 0 ? " 0 �Դϴ�" : (num>0 )"����Դϴ�." : "�����Դϴ�."
	
	System.out.println("������ �Է����ּ���");
	int num = sc.nextInt();
	String result = num == 0 ? " 0 �Դϴ�" : (num>0) ? "����Դϴ�." : "�����Դϴ�.";
	//-> �� ������ �ٽ� �̰� ���� //boolean isNegativeNum = (num%2 != 0); �̷��� ���� ����
	System.out.println(num+"��/��"+result);
	//boolean isNegativeNum = (num%2 != 0);
	//System.out.println(isNegativeNum+"��/�� �����Դϴ�."); 

}
}
