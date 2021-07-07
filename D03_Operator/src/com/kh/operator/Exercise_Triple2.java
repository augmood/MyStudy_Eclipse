package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple2 {
	public static void main(String [] args) {
		
	Scanner sc = new Scanner(System.in);
		
	//�� ���� '+'�Ǵ� '-'�� �Է¹޾� �˸��� ��� ��� ����ϱ�
	// ��, '+', '-'�̿��� ������ �Է½� "�߸� �Է��ϼ̽��ϴ�" ����ϱ�
	// ù��° �� : 6
	// �ι�° �� : 12
	// ������ �Է� (+ or -) : +
	// ��� : 18
	
	System.out.println("ù��° ���� �Է��� �ּ���");
	int firstnum = sc.nextInt();
	
	System.out.println("�ι�° ���� �Է��� �ּ���");
	int secondnum = sc.nextInt();
	
	System.out.println("������ (+ or -) �� �Է��� �ּ���"); // -> �ø��� ���� �޾ƾ� ���� ����....
	char op = sc.next().charAt(0); //-> ������� ����
	
	// �����ڰ� +�ΰ�? ���̸� �� ���Ѵ� : �����̸� �����ڰ� -���� Ȯ���Ѵ�. 
	// �����ڰ� -�ΰ�? ���̸� ���ڴ�. : �����̸� �߸� �Է��ϼ̽��ϴ�.�� ����Ѵ�. -> �̰� ���� ������ �޾�
	// 1. ���ڸ� ��Ʈ������ �ٲ������ -> ���ڸ� ���ڿ��� ���̸� �׳� ���ڿ��� �� !!!
	// 2. String.valueOf(����) �� �����Ѵ�.
	String result = op == '+' ? String.valueOf(firstnum+secondnum) : op == '-' ? String.valueOf(firstnum-secondnum) : "�߸� �Է��ϼ̽��ϴ�";
	System.out.print("��� : "+result);

}
}
