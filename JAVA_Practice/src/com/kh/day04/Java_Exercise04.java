package com.kh.day04;

import java.util.Random;
import java.util.Scanner;

public class Java_Exercise04 {
	public static void main(String [] args) {
		
//		�ܾ��� ������ġ�� ��� �����ְ� ������ �ܾ ���ߴ� ���α׷��� �ۼ��Ͻÿ�.
//		Q1. lvtsieeoin .>television �� ������ �Է��ϼ���>. television
//		�¾ҽ��ϴ�.
//		Q2. otepcumr .>computer �� ������ �Է��ϼ���>. computer
//		�¾ҽ��ϴ�.
//		Q3. usemo .>asdf �� ������ �Է��ϼ���>. soumo
//		Ʋ�Ƚ��ϴ�.
//		Q4. ohpne .>phone �� ������ �Է��ϼ���>. phone
//		�¾ҽ��ϴ�.
		
		String [] words = {"television","computer","mouse","phone"}; //���� �ܾ��
		Scanner sc = new Scanner(System.in); // �Է��� �޾ƾ� �ϴϱ�
		for(int i = 0; i < words.length; i++) {  // �ܾ� ũ�⸸ŭ ������
			char [] charWords = words[i].toCharArray(); // ������â���� �迭�� �ܾ���� ���ۿ� ����(toCharArray())�ؼ� ����
			
			for(int j = 0; j < charWords.length; j++) { //�´��� �ƴ��� Ȯ���ϱ�
				int randNum = new Random().nextInt(charWords.length); //�������� ���ڸ� ����
				char tmp = charWords[i]; // ������� ����� �����ϵ��� ���ڸ� �ϳ��ϳ� �����ؼ� ������ ������
				charWords[i] = charWords[randNum];
				charWords[randNum] = tmp;
			}
			
			System.out.print(new String(charWords)+" ������ �Է��ϼ��� : ");
			String answer = sc.next();
			if(words[i].equals(answer)) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			
		}
		
	}

}
