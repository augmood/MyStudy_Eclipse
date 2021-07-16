package com.kh.exercise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockServer {
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null; //
		int port = 7037;

		InputStream in = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;

		try {
			serverSocket = new ServerSocket(port);
			System.out.println(port + " Port Listen OK!");
			SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
			String time = format.format(new Date());
			System.out.println(time + " 연결 요청을 기다립니다.");
			socket = serverSocket.accept();
			
			//클라이언트에게 메세지를 보내줄거야
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			//dos에 메세지를 담아서 보낼거야
			String str = "[Notice] : Test Messge From Server!";
			dos.writeUTF(str);

			System.out.println("데이터 전송 완료.");

			dos.close();
			os.close();
			socket.close();
			serverSocket.close();
			// 여기에 한번 더 써주지 않으면 위의 시간이 그대로 출력됨 (new Date가 새로운 값을 갱신함)
			time = format.format(new Date());
			System.out.println(time + "연결을 종료하였습니다.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
