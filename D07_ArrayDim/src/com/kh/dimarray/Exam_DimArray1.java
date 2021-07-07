package com.kh.dimarray;

public class Exam_DimArray1 {
	public static void main(String [] args) {
		
		int [][] arrs = new int[4][4];
		int k = 1;
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs.length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);
			}
			System.out.println();
		} 
	}
}


