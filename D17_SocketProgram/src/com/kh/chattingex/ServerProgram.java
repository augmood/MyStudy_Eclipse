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
			serverSocket = new ServerSocket(4885); // ��ü
			System.out.println("���� ��ٸ�");
			Socket socket = serverSocket.accept(); // ���� ���
			System.out.println("���� ������");
			
			//////////// ������ �ޱ� //////////////
			byte [] bytes = null; // ���� �迭�� �����ϰ�
			String message = null; // ���� �޼����� �ʱ�ȭ
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100]; // �ڸ��� ����� �ݴϴ�.
			int readByteNo = is.read(bytes); //byte�� �о��ݴϴ�.
			message = new String(bytes, 0, readByteNo); //string���� �޾��ݴϴ�.
			System.out.println("������ �ޱ� ���� : "+message); // ���
			//////////////////////////////////

			////////////������ ������ //////////////
			
			OutputStream os = socket.getOutputStream(); //������
			message = "Yelena my little sister"; // ���� ��
			bytes = message.getBytes(); // byte�� ��ȯ�ؼ� �޾��ֱ�
			os.write(bytes); // byte�� ����� ������ ó������ ������ ����Ѵ�.
			os.flush();
			System.out.println("������ ������ ����");
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
