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
		 * 서버에 연결중입니다.
		 * 채팅서버에 접속하였습니다.
		 * 서버와의 채팅을 시작합니다.
		 * 서버 (상태) : 빠빨간맛
		 * 클라이언트 (나) : 궁금해 허니
		 */
		
		Socket socket = null;
		String address = "127.0.0.1"; // 이건 자기자신의 아이피를 말하는 것임
		int port = 9421;
		OutputStream out = null;
		DataOutputStream dos = null; // 보조스트림!
		
		InputStream in = null;
		DataInputStream din = null;
		
		String sendMsg = null;
		
		String recvMsg = null;
		
		try {
			System.out.println("서버에 연결중입니다.");
			socket = new Socket(address, port);
			System.out.println("채팅서버에 접속하였습니다.");
			
			out = socket.getOutputStream(); // 출력스트림
			dos = new DataOutputStream(out); // 보조스트림
			in = socket.getInputStream();
			din = new DataInputStream(in);
			System.out.println("서버와의 채팅을 시작합니다.");
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 출력 스트림은 열어두었고, 이제 입력해서 주고 받는 과정
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				recvMsg = din.readUTF();
				if(recvMsg.equals("EXIT")) break;
				System.out.print("클라이언트 (상대) : "+recvMsg);
				System.out.println();
				
				System.out.print("클라이언트 (나) : ");
				 //입력 받을 값을 저장할 변수 
				sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg); // 받은 문장 출력
				if(sendMsg.equals("EXIT")) break; 
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("채팅을 종료합니다.");
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
