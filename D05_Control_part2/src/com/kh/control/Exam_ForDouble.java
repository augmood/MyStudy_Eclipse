package com.kh.control;

public class Exam_ForDouble {
	public static void main(String [] args) {
		//���� for��
		for(int i = 1; i < 10; i++) { // �갡 ������
			// System.out.println(i);
			for(int j = 1; j < 10; j++) { // �갡 ���ư��� ��
				// System.out.print(j+" ");
				// �������� ����� ���ô�.
				System.out.printf("%d * %d = %d \t", i , j, i*j);
				// �� ������ i�� ù��° ���� �ȿ� �� ��ø �����̶� ������ 
			}
			System.out.println();
		}
	}
	

}
