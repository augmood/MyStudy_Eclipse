package com.je.socketprogramprac2;

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
		int port = 8412;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream is = null;
		DataInputStream dis = null;
		String answer = "";
		
		try {
			socket = new Socket(address, port);
			System.out.println("클라이언트 소켓을 생성했습니다.");
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);

			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		

			try {
				while(true) {
					System.out.print("-->");
					answer = sc.nextLine();
				dos.writeUTF(answer);
				String result = dis.readUTF();
				System.out.println(result);
				
				if(result.startsWith("3")) break;
				String isEnd = dis.readUTF();
					} 
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("연결을 종료합니다.");
			
			try {
				dos.close();
				dis.close();
				os.close();
				is.close();
				socket.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

}
