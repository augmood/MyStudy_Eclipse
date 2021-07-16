package com.kh.ioexercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_IOStream {

	// �� ����ٰ� ��ü��?
	// ��� �޼ҵ忡�� �� �� �� �ְ� �̸� ������� ��.
	static String name;
	static int age;
	static String address;

	public static void main(String[] args) {
		menu();
	}

	static void menu() {
		Scanner sc = new Scanner(System.in);
		terminated: while (true) {
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. �������� (Save)");
			System.out.println("4. ���� �ҷ�����(load)");
			System.out.println("0. ����");
			System.out.print("�޴��� �Է� �ϼ��� : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				print();
				break;
			case 3:
				save();
				break;
			case 4:
				load();
				break;
			case 0:
				break terminated;

			}
		}

	}

	static void insert() {

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.println("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("�ּҸ� �Է��ϼ��� : ");
		address = sc.nextLine();
	}

	static void print() {

		// name�� �� �׳� ���� �ȵ� �޼ҵ尡 �޶� �ٷ� �� ��
		// public class�� ��ü�� �̸� ������� �׷� �� �� ����
		System.out.println("�̸� : " + name);
		System.out.println("����: " + age);
		System.out.println("�ּ� : " + address);
	}

	static void save() {
		// ������� ���� �а� �������ִ� ����
		// file�� ���� ��� ��Ʈ���� ������
		FileWriter fw = null;
		if (name == null) {
			System.out.println("������ ������ �����ϴ�.");
			return;
		}
		String str = name + "/" + age + "/" + address;
		// �Է°��� ���⿡ ������ �� (�ϳ��ϳ� ���� �������ϱ�)

		try {
			// �̸����� �� �ؽ�Ʈ ���� ���� ���⿡ ���� ����� ��
			fw = new FileWriter(name + ".txt");
			fw.write(str); // �� ���� ����
			System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close(); // �ݾ���� �̸����� ����� �ؽ�Ʈ ���Ͽ� ���� �� �����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// �� �κ��� �� �����
	static void load() {
		FileReader fr = null;
		// �̰� �� ��? �ҷ����̴� ���� ũ�⸦ ���� ������ �߻��� �� �ֱ� ������ ��������
		BufferedReader bfr = null; 
		String data = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ������ ������ �Է��ϼ��� : ");
		String subject = sc.nextLine();
		try {
			// ���� ����� ������ �о���ڴ�.
			fr = new FileReader(subject+".txt");
			bfr = new BufferedReader(fr);
			// bfr�� �ֱ� ������ �迭�� ũ�⸦ �������� �ʾƵ� �ż� �� ���� �ʿ䰡 ����
//			char[] cbuf = new char[300];
//			while (true) {
//				int readNo = fr.read(cbuf);
//				if (readNo == -1)
//					break;
//				data += new String(cbuf, 0, readNo);
//			}
			data = bfr.readLine();
			// ���� / �� �߶� ����Ѵ�.
			StringTokenizer st = new StringTokenizer(data, " / ");
			if(st.countTokens() !=3) { //�Է��� ������ 3��(�̸� ���� �ּ�) �� �ƴϸ� �����޼���
				System.out.println("������ �߻��Ͽ����ϴ�.");
				return;
			}
			// �ڸ���� �� ����ϱ�
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());
			address = st.nextToken();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
