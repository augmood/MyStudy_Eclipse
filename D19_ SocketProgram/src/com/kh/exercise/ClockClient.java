package com.kh.exercise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ClockClient {
	public static void main(String[] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 7037;

		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream in = null;
		DataInputStream dis = null;

		try {
			socket = new Socket(address, port);
			// 내가 원하는 패턴으로 API를 불러낸다 HH:mm:ss는 원래 시간을 출력함
			SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
			// 위의 포맷을 time이라는 곳에 받아준다.
			String time = format.format(new Date());
			System.out.print(time + " 서버에 연결 요청 중입니다.");
			System.out.println(" 서버 IP : " + address);
			
			// 입력 스트림이 있어야 주고받지
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			
			// 서버에서 온 메세지를 받을 공간 
			String message = dis.readUTF();
			System.out.println("서버로 부터 받은 메세지 " + message);
			System.out.println("연결을 종료합니다");
			dis.close();
			in.close();
			socket.close();
			System.out.println("연결을 종료하였습니다.");

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
