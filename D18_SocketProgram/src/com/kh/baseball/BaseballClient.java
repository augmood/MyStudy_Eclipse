package com.kh.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {
	public static void main(String [] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8031;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream in = null; 
		DataInputStream din = null; 
		String answer = ""; 
		
		try {
			socket = new Socket(address, port);
			System.out.println("클라이언트 소켓을 생성했습니다.");
			os = socket.getOutputStream();
			dos = new DataOutputStream(os); // 생성완료
			in = socket.getInputStream();
			din = new DataInputStream(in);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);

			
		try {
			while(true) {
			System.out.print("---->");
			// 사용자 입력
			answer = sc.nextLine();
			// 데이터 보내기
			dos.writeUTF(answer);
			String result = din.readUTF();
			System.out.println(result);
			// 스트라이크가 3개면 종료
			if(result.startsWith("3")) break;
			String isEnd = din.readUTF();
					}
				} catch (IOException e) {
			e.printStackTrace();
			}
		
		System.out.println("연결을 종료합니다.");
		
		try {
			dos.close();
			os.close();
			din.close();
			in.close();
			socket.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 		
	}

}
