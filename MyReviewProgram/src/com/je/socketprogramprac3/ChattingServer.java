package com.je.socketprogramprac3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {
	/*
	 * ä�ü����� ���� �� �Դϴ�..
	 * ������ �����Ͽ����ϴ�.
	 * Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.
	 * Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.
	 * ä���� ���۵Ǿ����ϴ�.
	 * ���� (��) : ���������� / Ŭ���̾�Ʈ (���) : �ñ��� ���
	 */
	
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		int port = 9484;
		
		String sendMsg = "";
		String recvMsg = "";

		InputStream in = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;

		
		
		try {
			System.out.println("ä�� ������ ���� �� �Դϴ�.");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�.");
			Thread.sleep(2000);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.");
			Socket socket = serverSocket.accept(); // ��⸦ �ϰ� �ϴ� �ڵ�
			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("���� (��) : ");
				sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if(sendMsg.equals("��")) break;
				
				recvMsg = dis.readUTF();
				if(recvMsg.equals("��")) break;
				System.out.println("Ŭ���̾�Ʈ (���) : "+recvMsg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			dis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
