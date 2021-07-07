package com.kh.listcollection;

public class IntList {
	
	private int [] arrs;
	private int current; //�ε���ó��
	
	public IntList() {
		// ���� �־� �� �غ���
		arrs = new int[1000];
		current = 0;
	}
	
	public void add(int input) {
		//���� �Է��ϰ� �����ϱ�
		arrs[current] = input;
		current++;
	}

	public void clear() {
		// remove : �ϳ��� ����� / clear : �� �����
		// �迭�� � ���� ������ ��� 0���� ó�����ش�
//		for(int i = 0; i<current; i++) {
//			arrs[i] = 0;
//		}
		arrs = new int[3]; 
		// 0���� �Ǳ⸸ �ϸ� �Ǵϱ� �̰͸� �ᵵ ����� ����.
		current = 0;   
		
	}
	
	public int size() {
		return current;
	}
	
	public int get(int index) {
		if(current <= index) {
			throw new IndexOutOfBoundsException();
		}
		return arrs[index];
	}
	
	
}

