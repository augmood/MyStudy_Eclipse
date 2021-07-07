package com.kh.myexception;

public class Exam_Exception2 {
	public static void main(String [] args) {
		int [] arrs = new int[3];
		try {
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = i;
		}
		 System.out.println(arrs[3]);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("범위를 넘어갔습니다.");
		}
 	}

}
