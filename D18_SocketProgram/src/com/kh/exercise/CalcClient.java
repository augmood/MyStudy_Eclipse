package com.kh.exercise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {
	public static void main(String [] args) {
		/*
		 * 1. ���� �Է� �ޱ�
		 * 2. �Է��� ���� ������ ������ -> ������� ����
		 * 3. ���� �����ؼ� ����ϱ�
		 * 4. bye �Է��ϸ� �����Ű��
		 */
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 1123;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream in = null;
		DataInputStream dis = null;
		String message = "";
		
		try {
			socket = new Socket(address, port);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			System.out.print("����Ǿ����ϴ�.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
			System.out.print("���� (��ĭ���� ��� �Է�, ��: 24+42) >> ");
			message = sc.nextLine();
			if(message.equalsIgnoreCase("bye")) {
				dos.writeUTF("bye");
				break;
			}
			dos.writeUTF(message);
			String resultMessage = dis.readUTF();
			System.out.println("��� ��� :"+resultMessage);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		try {
			dos.close();
			dis.close();
			socket.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
