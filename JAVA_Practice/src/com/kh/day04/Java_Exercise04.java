package com.kh.day04;

import java.util.Random;
import java.util.Scanner;

public class Java_Exercise04 {
	public static void main(String [] args) {
		
//		단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 프로그램을 작성하시오.
//		Q1. lvtsieeoin .>television 의 정답을 입력하세요>. television
//		맞았습니다.
//		Q2. otepcumr .>computer 의 정답을 입력하세요>. computer
//		맞았습니다.
//		Q3. usemo .>asdf 의 정답을 입력하세요>. soumo
//		틀렸습니다.
//		Q4. ohpne .>phone 의 정답을 입력하세요>. phone
//		맞았습니다.
		
		String [] words = {"television","computer","mouse","phone"}; //쓰일 단어들
		Scanner sc = new Scanner(System.in); // 입력을 받아야 하니까
		for(int i = 0; i < words.length; i++) {  // 단어 크기만큼 돌려줌
			char [] charWords = words[i].toCharArray(); // 엉망진창으로 배열될 단어들을 버퍼에 복사(toCharArray())해서 받음
			
			for(int j = 0; j < charWords.length; j++) { //맞는지 아닌지 확인하기
				int randNum = new Random().nextInt(charWords.length); //무작위로 글자를 받음
				char tmp = charWords[i]; // 빈공간을 만들고 정렬하듯이 글자를 하나하나 대조해서 순서를 맞춰줌
				charWords[i] = charWords[randNum];
				charWords[randNum] = tmp;
			}
			
			System.out.print(new String(charWords)+" 정답을 입력하세요 : ");
			String answer = sc.next();
			if(words[i].equals(answer)) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다.");
			}
			
		}
		
	}

}
