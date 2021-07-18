package com.je.socketprogramprac3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {
	public static void main(String [] args ) {
	Socket socket = null;
	String address = "127.0.0.1";
	int port = 9484;
	String sendMsg = "";
	String recvMsg = "";

	InputStream in = null;
	DataInputStream dis = null;
	
	OutputStream os = null;
	DataOutputStream dos = null;

	try {
		System.out.println("서버에 연결 중 입니다.");
		socket = new Socket(address, port);
		System.out.println("서버에 접속했습니다.");

		os = socket.getOutputStream();
		dos = new DataOutputStream(os);
		in = socket.getInputStream();
		dis = new DataInputStream(in);
		
		System.out.println("서버와의 채팅을 시작합니다.");
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Scanner sc = new Scanner(System.in);
	while(true) {
		try {
			recvMsg = dis.readUTF();
			if(recvMsg.equals("끝")) break;
			System.out.println("클라이언트 (상대) : "+recvMsg);
			
			System.out.print("클라이언트 (나) : ");
			sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			if(sendMsg.equals("끝")) break;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	System.out.println("종료합니다.");
	
	try {
		dos.close();
		os.close();
		sc.close();
		socket.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	
	
	

	}
}