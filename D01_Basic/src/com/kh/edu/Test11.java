package com.kh.edu;

import java.util.Scanner;

public class Test11 {

	 public static void main (String [] args) {
	 

		 Scanner scanner = new Scanner(System.in);

		 int[] arr = new int[5];

		 // �ݺ����� ���� �Է�

		 for (int i = 0; i < 5; i++) {

		 System.out.print((i + 1) + "��° ���� �Է� : ");

		 arr[i] = scanner.nextInt();

		 }

		 int sum = arr[0] + arr[4];

		 // �������� �ڵ�

		 for (int i = 0; i < arr.length-1; i++) {

		 for (int j = 0; j < arr.length - 1 - i; j++) {

		 if (arr[j] < arr[j + 1]) {

		 int temp = arr[j];

		 arr[j] = arr[j + 1];

		 arr[j + 1] = temp;

		 }

		 }

		 }

		 // ��� �ڵ�

		 System.out.print("���� ��� : ");

		 for (int i = 0; i < arr.length; i++) {

		 System.out.print(arr[i] + "\t");

		 }

		 System.out.println("\n���� ū ���� ���� ���� ���� : " + sum);

		 }

		 }