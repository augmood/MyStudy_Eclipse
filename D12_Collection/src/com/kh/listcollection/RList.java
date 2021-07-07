package com.kh.listcollection;

public class RList<T> {
	
	private Object [] arrs;
	private int current; //�ε���ó��
	
	public RList() {
		// ���� �־� �� �غ���
		arrs = new Object[3];
		current = 0;
	}
	
	public void add(T input) {
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
		arrs = new Object[3]; 
		// 0���� �Ǳ⸸ �ϸ� �Ǵϱ� �̰͸� �ᵵ ����� ����.
		current = 0;   
		
	}
	
	public int size() {
		return current;
	}
	
	public T get(int index) {
		if(current <= index) {
			throw new IndexOutOfBoundsException();
		}
		return (T)arrs[index];
	}
	
	
}

