package com.kh.chattingex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String [] args) {
		// �������α׷��� 14��° �� ��⿡�� �Ѿ��
		Socket socket = null;
		
		//���� ��Ʈ�� ���ƾ��� (���� 11��°��)
		try {
			System.out.println("���� ��û");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("���� ����!");
			
			////////////������ ������ //////////////
			byte [] bytes = null; // �޼��� ���� ����
			String message = null; // �޼����� ���
			
			OutputStream os = socket.getOutputStream(); //������
			message = "Do as PEGGY say!"; // ���� ��
			bytes = message.getBytes(); // byte�� ��ȯ�ؼ� �޾��ֱ�
			os.write(bytes); // byte�� ����� ������ ó������ ������ ����Ѵ�.
			os.flush();
			System.out.println("������ ���� �Ϸ�");
			//////////////////////////////////
			
			////////////������ �ޱ� //////////////
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100]; // �ڸ��� ����� �ݴϴ�.
			int readByteNo = is.read(bytes); //byte�� �о��ݴϴ�.
			message = new String(bytes, 0, readByteNo); //string���� �޾��ݴϴ�.
			System.out.println("������ �ޱ� ���� : "+message); // ���
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
