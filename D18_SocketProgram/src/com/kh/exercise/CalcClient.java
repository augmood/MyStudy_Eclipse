package com.kh.exercise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {
	public static void main(String [] args) {
		/*
		 * 1. 계산식 입력 받기
		 * 2. 입력한 계산식 서버로 보내기 -> 여기부터 몰라
		 * 3. 계산식 실행해서 출력하기
		 * 4. bye 입력하면 종료시키기
		 */
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 1123;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream in = null;
		DataInputStream dis = null;
		String message = "";
		
		try {
			socket = new Socket(address, port);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			System.out.print("연결되었습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
			System.out.print("계산식 (빈칸으로 띄어 입력, 예: 24+42) >> ");
			message = sc.nextLine();
			if(message.equalsIgnoreCase("bye")) {
				dos.writeUTF("bye");
				break;
			}
			dos.writeUTF(message);
			String resultMessage = dis.readUTF();
			System.out.println("계산 결과 :"+resultMessage);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		try {
			dos.close();
			dis.close();
			socket.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
