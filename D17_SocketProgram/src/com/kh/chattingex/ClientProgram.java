package com.kh.chattingex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String [] args) {
		// 서버프로그램의 14번째 줄 대기에서 넘어옴
		Socket socket = null;
		
		//서버 포트와 같아야함 (서버 11번째줄)
		try {
			System.out.println("연결 요청");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("연결 성공!");
			
			////////////데이터 보내기 //////////////
			byte [] bytes = null; // 메세지 담을 공간
			String message = null; // 메세지를 담기
			
			OutputStream os = socket.getOutputStream(); //보내기
			message = "Do as PEGGY say!"; // 보낼 말
			bytes = message.getBytes(); // byte로 변환해서 받아주기
			os.write(bytes); // byte에 저장된 문장을 처음부터 끝까지 출력한다.
			os.flush();
			System.out.println("데이터 전송 완료");
			//////////////////////////////////
			
			////////////데이터 받기 //////////////
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100]; // 자리를 만들어 줍니다.
			int readByteNo = is.read(bytes); //byte로 읽어줍니다.
			message = new String(bytes, 0, readByteNo); //string으로 받아줍니다.
			System.out.println("데이터 받기 성공 : "+message); // 출력
			//////////////////////////////////
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
