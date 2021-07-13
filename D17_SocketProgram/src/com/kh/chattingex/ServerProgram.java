package com.kh.chattingex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(4885); // 객체
			System.out.println("연결 기다림");
			Socket socket = serverSocket.accept(); // 연결 대기
			System.out.println("연결 수락함");
			
			//////////// 데이터 받기 //////////////
			byte [] bytes = null; // 받을 배열을 선언하고
			String message = null; // 받을 메세지를 초기화
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100]; // 자리를 만들어 줍니다.
			int readByteNo = is.read(bytes); //byte로 읽어줍니다.
			message = new String(bytes, 0, readByteNo); //string으로 받아줍니다.
			System.out.println("데이터 받기 성공 : "+message); // 출력
			//////////////////////////////////

			////////////데이터 보내기 //////////////
			
			OutputStream os = socket.getOutputStream(); //보내기
			message = "Yelena my little sister"; // 보낼 말
			bytes = message.getBytes(); // byte로 변환해서 받아주기
			os.write(bytes); // byte에 저장된 문장을 처음부터 끝까지 출력한다.
			os.flush();
			System.out.println("데이터 보내기 성공");
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
