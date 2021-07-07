package com.kh.dimarray.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		/*
		 * 5행 5행 2차원 선언 후
		 * 0값부터 1씩 증가하면서 초기화 하고 출력하시오
		 */
		
		int [][] arrs1 = new int[5][5];
		int k = 0;
		
		for (int i =0; i < arrs1.length; i++) {
			for (int j = 0; j < arrs1[i].length; j++) {
				arrs1[i][j] = k;
				k++;
			}
		}
		for(int i = 0; i < arrs1.length; i++) {
			for(int j = 0; j < arrs1[i].length; j++) {
			System.out.printf("%2d " , arrs1[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void exercise2() {
		//  5   4   3   2   1
		// 10   9   8   7   6
		// 15  14  13  12  11
		// 20  19  18  17  16
		// 25  24  23  22  21
		// 역으로 채워진다고 보면 됨

		int [][] arrs2 = new int[5][5];
		int l = 1; // 몇부터 시작할거야
		
		
		for (int i = 0; i < arrs2.length; i++) {
			for (int j = 4; j >= 0; j--) { // 4번부터 시작해야하잖아 조건식을 고치자
				arrs2[i][j] = l;
				l++;
			}
		}
		for (int i = 0; i < arrs2.length; i++) {
			for (int j = arrs2[i].length-1; j < arrs2[i].length; j++) {
				System.out.printf("%2d\t",arrs2[i][j]);
			}
			 System.out.println();
		}
	}

	public void exercise3() {
		// 5   10   15   20   25
		// 4    9   14   19   24
		// 3    8   13   18   23
		// 2    7   12   17   22
		// 1    6   11   16   21
	
	
	int [][] arrs3 = new int [5][5];
	int m = 1;
	
	for (int i = 0; i < arrs3.length; i++) {
		for (int j = arrs3[i].length-1; j >= 0; j--) { 
			arrs3[j][i] = m; // 윗 코드에서 이것만 바꿔줌
			m++;
		}
	}
	for (int i = 0; i < arrs3.length; i++) {
		for (int j = 0; j < arrs3[i].length; j++) {
			System.out.printf("%2d\t",arrs3[i][j]);
		}
		 System.out.println();
	}

	}
	public void exercise4() {
		//  1   6   11   16   21
		//  2   7   12   17   22
		//  3   8   13   18   23
		//  4   9   14   19   24
		//  5  10   15   20   25
		
		int [][] arrs4 = new int[5][5];
		int n = 1;
		
		for (int i = 0; i < arrs4.length; i++) {
			for (int j = 0; j < arrs4[i].length; j++) { 
				arrs4[j][i] = n; // 윗 코드에서 이것만 바꿔줌
				n++;
			}
		}
		for (int i = 0; i < arrs4.length; i++) {
			for (int j = 0; j < arrs4[i].length; j++) {
				System.out.printf("%2d\t",arrs4[i][j]);
			}
			 System.out.println();
		}
	}
	

	public void exercise5() {
		//  1    2    3    4    5 //i가 홀수이면 순행 / 짝수이면 역행 증가
		// 10    9    8    7    6
		// 11   12   13   14   15
		// 20   19   18   17   16
		// 21   22   23   24   25
		
		int [][] arrs5 = new int[5][5];
		int p = 1;
		
		for (int i = 0; i < arrs5.length; i++ ) {
			if(i % 2 != 0) {
				for(int j = arrs5[i].length-1; j >=0; j--) {
					arrs5[i][j] = p++; // 순행
				}
			} else {
				for(int j = 0; j< arrs5.length; j++) {
					arrs5[i][j] = p++; // 역행
				}
			}
		 }
		for (int i = 0; i < arrs5.length; i++) {
			for(int j = 0; j < arrs5[i].length; j++) {
				System.out.printf("%2d \t", arrs5[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise6() {
		//	 5	 4	 3	 2	 1	
		//	 6	 7	 8	 9	10	
		//	15	14	13	12	11	
		//	16	17	18	19	20	
		//	25	24	23	22	21
		
		int [][] arrs6 = new int[5][5];
		int q = 1;
		
		for (int i = 0; i < arrs6.length; i++ ) {
			if(i % 2 != 0) {
				for(int j = 0; j< arrs6.length; j++) {
					arrs6[i][j] = q++; // 역행
				}
			} else {
				for(int j = arrs6[i].length-1; j >=0; j--) {
					arrs6[i][j] = q++; // 순행
				}
			}
		 }
		for (int i = 0; i < arrs6.length; i++) {
			for(int j = 0; j < arrs6[i].length; j++) {
				System.out.printf("%2d \t", arrs6[i][j]);
			}
			System.out.println();
			}
		}
	}

