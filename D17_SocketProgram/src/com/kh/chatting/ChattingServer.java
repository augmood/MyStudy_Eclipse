package com.kh.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {
	public static void main(String [] args) {
		/*
		 * ä�ü����� ���� �� �Դϴ�..
		 * ������ �����Ͽ����ϴ�.
		 * Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.
		 * Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.
		 * ä���� ���۵Ǿ����ϴ�.
		 * ���� (��) : ���������� / Ŭ���̾�Ʈ (���) : �ñ��� ���
		 */
		
		ServerSocket serverSocket = null;
		int port = 9421;
		InputStream in = null;
		DataInputStream din = null;
		
		OutputStream out = null;
		DataOutputStream dos = null;
		
		String sendMsg = null;
		
		String recvMsg = null; //���� ����
		
		try {
			System.out.println("ä�ü����� ���� �� �Դϴ�...");
			Thread.sleep(2000); // 2�� �ִٰ� ������ ����ǵ��� �� 
			serverSocket = new ServerSocket(port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�.");
			Thread.sleep(2000);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.");
			Socket socket = serverSocket.accept(); // ��⸦ �ϰ� �ϴ� �ڵ�
			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			
			in = socket.getInputStream();
			din = new DataInputStream(in);
			out = socket.getOutputStream(); 
			dos = new DataOutputStream(out);
			System.out.println("ä���� ���۵Ǿ����ϴ�.");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("���� (��) : ");
				 //�Է� ���� ���� ������ ���� 
				sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg); // ���� ���� ���
				if(sendMsg.equals("EXIT")) break; 
				
				recvMsg = din.readUTF();
				if(recvMsg.equals("EXIT")) break;
				System.out.println("Ŭ���̾�Ʈ (���) : "+recvMsg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		System.out.println("ä�ü����� �����մϴ�.");
		
		try {
			din.close();
			dos.close();
			serverSocket.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
