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
	 * 채팅서버를 구동 중 입니다..
	 * 서버를 구동하였습니다.
	 * 클라이언트의 접속을 기다리고 있습니다.
	 * 클라이언트가 접속하였습니다.
	 * 채팅이 시작되었습니다.
	 * 서버 (나) : 빠빠빨간맛 / 클라이언트 (상대) : 궁금해 허니
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
			System.out.println("채팅 서버를 구동 중 입니다.");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다.");
			Thread.sleep(2000);
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			Socket socket = serverSocket.accept(); // 대기를 하게 하는 코드
			System.out.println("클라이언트가 접속하였습니다.");
			
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
				System.out.print("서버 (나) : ");
				sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if(sendMsg.equals("끝")) break;
				
				recvMsg = dis.readUTF();
				if(recvMsg.equals("끝")) break;
				System.out.println("클라이언트 (상대) : "+recvMsg);
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
