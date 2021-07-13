package com.kh.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {
	public static void main(String [] args) {
		/*
		 * ������ �������Դϴ�.
		 * ä�ü����� �����Ͽ����ϴ�.
		 * �������� ä���� �����մϴ�.
		 * ���� (����) : ��������
		 * Ŭ���̾�Ʈ (��) : �ñ��� ���
		 */
		
		Socket socket = null;
		String address = "127.0.0.1"; // �̰� �ڱ��ڽ��� �����Ǹ� ���ϴ� ����
		int port = 9421;
		OutputStream out = null;
		DataOutputStream dos = null; // ������Ʈ��!
		
		InputStream in = null;
		DataInputStream din = null;
		
		String sendMsg = null;
		
		String recvMsg = null;
		
		try {
			System.out.println("������ �������Դϴ�.");
			socket = new Socket(address, port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�.");
			
			out = socket.getOutputStream(); // ��½�Ʈ��
			dos = new DataOutputStream(out); // ������Ʈ��
			in = socket.getInputStream();
			din = new DataInputStream(in);
			System.out.println("�������� ä���� �����մϴ�.");
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ��� ��Ʈ���� ����ξ���, ���� �Է��ؼ� �ְ� �޴� ����
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				recvMsg = din.readUTF();
				if(recvMsg.equals("EXIT")) break;
				System.out.print("Ŭ���̾�Ʈ (���) : "+recvMsg);
				System.out.println();
				
				System.out.print("Ŭ���̾�Ʈ (��) : ");
				 //�Է� ���� ���� ������ ���� 
				sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg); // ���� ���� ���
				if(sendMsg.equals("EXIT")) break; 
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("ä���� �����մϴ�.");
		try {
			dos.close();
			din.close();
			socket.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
