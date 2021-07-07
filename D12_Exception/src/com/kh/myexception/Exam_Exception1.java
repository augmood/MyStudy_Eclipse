package com.kh.myexception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exam_Exception1 {
	public static void main(String [] ars) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		try {
			System.out.print("ù��° ���� �Է� : ");
			int num1 = sc.nextInt();
			System.out.print("�ι�° ���� �Է� : ");
			int num2 = sc.nextInt();
			
			int result = num1 / num2;
			System.out.println(num1+"��"+num2+"�� ���� ����"+result+"�Դϴ�.");
			// exception�� ��� ���� ������ ArithmeticException�� Exception ����� �޾ұ� ����
			}catch(ArithmeticException ex) {  
			System.out.println("0���� ���� �� �����ϴ�."+ex.getMessage());
			}catch(InputMismatchException e){
				System.out.println("���ڿ��� �Է��� �� �����ϴ�."+e.getMessage());
				sc.next(); // �Է��� ���ڿ��� �����ش�
				continue; // �ٽ� �������ش�
			} finally {
				System.out.println("�� ����� ������ ����˴ϴ�.");
			}
		
		}
	}
}
