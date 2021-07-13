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
		 * 채팅서버를 구동 중 입니다..
		 * 서버를 구동하였습니다.
		 * 클라이언트의 접속을 기다리고 있습니다.
		 * 클라이언트가 접속하였습니다.
		 * 채팅이 시작되었습니다.
		 * 서버 (나) : 빠빠빨간맛 / 클라이언트 (상대) : 궁금해 허니
		 */
		
		ServerSocket serverSocket = null;
		int port = 9421;
		InputStream in = null;
		DataInputStream din = null;
		
		OutputStream out = null;
		DataOutputStream dos = null;
		
		String sendMsg = null;
		
		String recvMsg = null; //받을 공간
		
		try {
			System.out.println("채팅서버를 구동 중 입니다...");
			Thread.sleep(2000); // 2초 있다가 서버가 실행되도록 함 
			serverSocket = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다.");
			Thread.sleep(2000);
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			Socket socket = serverSocket.accept(); // 대기를 하게 하는 코드
			System.out.println("클라이언트가 접속하였습니다.");
			
			in = socket.getInputStream();
			din = new DataInputStream(in);
			out = socket.getOutputStream(); 
			dos = new DataOutputStream(out);
			System.out.println("채팅이 시작되었습니다.");
			
			
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
				System.out.print("서버 (나) : ");
				 //입력 받을 값을 저장할 변수 
				sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg); // 받은 문장 출력
				if(sendMsg.equals("EXIT")) break; 
				
				recvMsg = din.readUTF();
				if(recvMsg.equals("EXIT")) break;
				System.out.println("클라이언트 (상대) : "+recvMsg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		System.out.println("채팅서버를 종료합니다.");
		
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
