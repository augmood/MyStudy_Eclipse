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
			System.out.println("���� ��ٸ�");
			Socket socket = serverSocket.accept();
			System.out.println("���� ������");
			
			//////////////// ������ �ޱ� //////////////////
			byte [] bytes = null;
			String message  = null;
			
			InputStream in = socket.getInputStream();
			bytes = new byte[100];
			int readByteNo = in.read(bytes);
			message = new String(bytes, 0 , readByteNo);
			System.out.println("������ �ޱ� ���� : "+message);
			//////////////////////////////////////////
			
			/////////// ������ ������ ////////////////////
			OutputStream os = socket.getOutputStream();
			message = "It was fun";
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("�����Ͱ� ���۵Ǿ����ϴ�.");
			///////////////////////////////////////////
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
