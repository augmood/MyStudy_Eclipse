package com.kh.edu;

import java.util.Scanner;

public class Test11 {

	 public static void main (String [] args) {
	 

		 Scanner scanner = new Scanner(System.in);

		 int[] arr = new int[5];

		 // 반복문을 통한 입력

		 for (int i = 0; i < 5; i++) {

		 System.out.print((i + 1) + "번째 숫자 입력 : ");

		 arr[i] = scanner.nextInt();

		 }

		 int sum = arr[0] + arr[4];

		 // 버블정렬 코드

		 for (int i = 0; i < arr.length-1; i++) {

		 for (int j = 0; j < arr.length - 1 - i; j++) {

		 if (arr[j] < arr[j + 1]) {

		 int temp = arr[j];

		 arr[j] = arr[j + 1];

		 arr[j + 1] = temp;

		 }

		 }

		 }

		 // 출력 코드

		 System.out.print("정렬 결과 : ");

		 for (int i = 0; i < arr.length; i++) {

		 System.out.print(arr[i] + "\t");

		 }

		 System.out.println("\n가장 큰 수와 작은 수의 합은 : " + sum);

		 }

		 }