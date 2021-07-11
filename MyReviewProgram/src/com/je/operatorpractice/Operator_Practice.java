package com.je.operatorpractice;

import java.util.Scanner;

public class Operator_Practice {
	
	public void practice1() {
		/*
		 * Ű����� �Է¹��� �ϳ��� ������ ����̸�
		 * ����� �ƴϸ� ����� �ƴϴٸ� ����ϼ���.
		 * �ǽ� ���� 1-2, ���ļ� �ذ�
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("���� : ");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����");
		} else if(num == 0 ) {
			System.out.println("0�̴�.");
		} else {
			System.out.println("����� �ƴϴ�.");
		}
		
	}
	
	public void practice2() {
		/*
		 * Ű����� �Է¹��� �ϳ��� ������ ¦���̸� ¦����
		 * �ƴϸ� Ȧ���ٸ� �Է��ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num2;
		
		System.out.print("����  : ");
		num2 = sc.nextInt();
		
		if (num2 % 2 == 0 ) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
	
	public void practice3() {
		/*
		 * ��� ����� ������ ���� ������������ �Ѵ�.
		 * �ο����� ���������� Ű����� �Է� �ް� 1�δ� �����ϰ� �������� ����������
		 * �����ְ� ���� ������ ������ ����ϼ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int candy;
		int people;
		int num3;
		int num4;
		
		System.out.print("�ο� �� : ");
		people = sc.nextInt();
		System.out.print("���� ���� : ");
		candy = sc.nextInt(); 
		
		num3 = candy / people;
		num4 = candy - (num3*people);
		
		System.out.print("1�δ� ���� ����: "+num3 +"\t");
		System.out.print("���� ���� ���� : "+num4);
		
	}
	
	public void practice4() {
		/*
		 * Ű����� �Է¹��� ������ ������ ����ϰ�
		 * ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���
		 * �̶� ������ M�̸� ���л�, M�� �ƴϸ� ���л����� ��� ó���ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		String name;
		int grade;
		int ban;
		int schoolNumber;
		char gender;
		double point;
		
		System.out.print("�̸� : ");
		name = sc.next();
		sc.nextLine();
		System.out.print("�г� : ");
		grade = sc.nextInt();
		System.out.print("�� : ");
		ban = sc.nextInt();
		System.out.print("��ȣ : ");
		schoolNumber = sc.nextInt();
		System.out.print("���� (M/F): ");
		gender = sc.next().charAt(0);
		System.out.print("���� : ");
		point = sc.nextDouble();
		
		if (gender == 'M') {
			System.out.printf("%d�г�  %d�� %d��  %s ���л��� ������ %.2f �Դϴ� \n"
					, grade, ban, schoolNumber, name, point);
		} else if (gender == 'F') {
			System.out.printf("%d�г�  %d�� %d��  %s ���л��� ������ %.2f �Դϴ� \n"
					, grade, ban, schoolNumber, name, point);

		}
			
	}
	
	public void practice5() {
		/*
		 * ����, ����, ���п� ���� ������ �Է¹ް�
		 * �� ���� ���� �հ�� ����� ���ϼ���.
		 * �� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
		 * �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��϶�
		 * �հ�, �ƴ϶�� ���հ��� ����ϼ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		math = sc.nextInt();
		
		int sum = kor+eng+math;
		double avg = sum / 3;
		
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);


		
		if ((kor >= 40) && (eng >= 40) && (math >= 40) && sum >=60 ) {
			System.out.print("�հ�");
		}else {
			System.out.print("���հ�");
		}
		
	}
	
	public void practice6 () {
		/*
		 * �ֹι�ȣ�� �̿��Ͽ� 
		 * �������� �������� �����Ͽ� ����ϼ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� (-����) : ");
		// �� �κ��� �򰥷��� ���ڶ� ���ڰ� ���� �����ϱ� ��� �޾Ƽ� �����ؾ��ϴ���
		// �ϴ� ���ڿ��� �ֹι�ȣ�� �޾��ְ�
		String reNum = sc.nextLine();
	
		// ���ڷ� 8��° ������ ���� ��Ʈ�� ��½����ش�. (7 = 0���� �����ϴϱ�)
		char gen = reNum.charAt(7);
		
		// ���� �� �¾Ҿ��µ� '1' �� ������ ���� ����ϴ°� ���ڴϱ� �ٵ� ��� �׳� 1�� ����Ϸ��� ����.
		if (gen == '1' || gen == '3') {
			System.out.println("����");
		} else if (gen == '2' || gen == '4') {
			System.out.println("����");
		}
	}
	
	public void practice7() {
		/* 
		 * Ű����� ���� �ΰ��� �Է¹޾� ���� ������ �����ϼ���
		 * �׸��� �� �ٸ� ������ �Է¹޾� �� ���� ù��° �� ���ϰų� �ι�° �� �ʰ��� T
		 * �ƴϸ� f�� ����ϼ��� �� 1 < 2
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� 1 : ");
		int num5 = sc.nextInt();
		System.out.print("�Է� 2 : ");
		int num6 = sc.nextInt();
		System.out.print("�Է� 3 : ");
		int num7 = sc.nextInt();
		
		boolean isTrue = (num5 < num6 ) && (num7 > num6) || (num7 < num5);
		System.out.print(isTrue);
	}
	
	public void practice8() {
		/* 
		 * ������ ���� �Է¹޾� ���� ��� ������ T, �ƴϸ� F
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� 1 : ");
		int num8 = sc.nextInt();
		System.out.print("�Է� 2 : ");
		int num9 = sc.nextInt();
		System.out.print("�Է� 3 : ");
		int num10 = sc.nextInt();
		
		boolean isTrue2 = (num8 == num9) && (num8 == num10) && (num9 == num10);
		System.out.print(isTrue2);
	}
	
	public void practice9() {
		/*
		 * �� ����� ������ �Է¹ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ�
		 * �μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� 3000 �̻� �ƴϸ� 3000 �̸��� ����ϼ���
		 * A = 0.4 / B = ���� / C = 0.15
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int A = sc.nextInt();
		System.out.print("B����� ���� : ");
		int B = sc.nextInt();
		System.out.print("C����� ���� : ");
		int C = sc.nextInt();
		
		double AAi = A+(A*0.4);
		double BAi = B+(B*0.0);
		double CAi = C+(C*0.15);
		
		System.out.println("A����� ����  / ����+a : "+A+"/"+AAi);
		if (AAi > 3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		System.out.println("A����� ����  / ����+a : "+B+"/"+BAi);
		if (B > 3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		System.out.println("C����� ����  / ����+a :  "+C+"/"+CAi);
		if (CAi > 3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
	}


}
