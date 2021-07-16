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
			System.out.println("���� ��û");
			socket = new Socket("127.0.0.1", 9613);
			System.out.println("���� �Ϸ�");
			
			/////// ������ ������ ///////////
			byte [] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "Thank you for your cooperation";
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("�����Ͱ� ���۵Ǿ����ϴ�.");
			
			/////////// ������ �ޱ� ////////////
			InputStream in = socket.getInputStream();
			bytes = new byte[100];
			int readByteNo = in.read(bytes);
			message = new String(bytes, 0 , readByteNo);
			System.out.println("������ �ޱ� ���� : "+message);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
