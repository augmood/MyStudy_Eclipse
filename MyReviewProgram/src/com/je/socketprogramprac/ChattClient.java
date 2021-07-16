package com.je.socketprogramprac;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattClient {
	public static void main(String [] args) {
		Socket socket = null;
		
		
		try {
			System.out.println("연결 요청");
			socket = new Socket("127.0.0.1", 9613);
			System.out.println("연결 완료");
			
			/////// 데이터 보내기 ///////////
			byte [] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "Thank you for your cooperation";
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터가 전송되었습니다.");
			
			/////////// 데이터 받기 ////////////
			InputStream in = socket.getInputStream();
			bytes = new byte[100];
			int readByteNo = in.read(bytes);
			message = new String(bytes, 0 , readByteNo);
			System.out.println("데이터 받기 성공 : "+message);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
