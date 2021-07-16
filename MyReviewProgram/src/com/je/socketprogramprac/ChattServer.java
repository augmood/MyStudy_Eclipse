package com.je.socketprogramprac;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {
	public static void main(String [] args) {
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(9613);
			System.out.println("연결 기다림");
			Socket socket = serverSocket.accept();
			System.out.println("연결 수락함");
			
			//////////////// 데이터 받기 //////////////////
			byte [] bytes = null;
			String message  = null;
			
			InputStream in = socket.getInputStream();
			bytes = new byte[100];
			int readByteNo = in.read(bytes);
			message = new String(bytes, 0 , readByteNo);
			System.out.println("데이터 받기 성공 : "+message);
			//////////////////////////////////////////
			
			/////////// 데이터 보내기 ////////////////////
			OutputStream os = socket.getOutputStream();
			message = "It was fun";
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터가 전송되었습니다.");
			///////////////////////////////////////////
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
