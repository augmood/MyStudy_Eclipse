package com.kh.exercise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalcServer {
	public static void main(String [] args) {
		/*
		 * 1.������ ��ٸ���
		 * 2.����ޱ�
		 * 3.���� �Է¹ޱ� -> ������� ����
		 * 4.�հ� ����ؼ� �����ֱ� 
		 * 4.���������ϱ�
		 */
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 1123;
		String inputMessage = "";
		InputStream in = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			System.out.println("������ ��ٸ��� �ֽ��ϴ�.");
			serverSocket = new ServerSocket(port);
			socket = serverSocket.accept();
			System.out.println("����Ǿ����ϴ�.");
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		while(true) {
			inputMessage = dis.readUTF(); // 
			if(inputMessage.equalsIgnoreCase("bye")) {
				System.out.println("Ŭ���̾�Ʈ���� ������ �����Ͽ���.");
			}
			System.out.println(inputMessage); // dos.writeUTF(numcal); �޾���
			StringTokenizer st 
			= new StringTokenizer(inputMessage, " ");
			if(st.countTokens() != 3) {
				break;
			}
			int num1 = Integer.parseInt(st.nextToken());
			String opCode = st.nextToken();
			int num2 = Integer.parseInt(st.nextToken());
			String result ="";
			switch (opCode) {
			case "+" :
				result = Integer.toString(num1+num2);
				break;	
			
			case "-" :
				result = Integer.toString(num1-num2);
				break;
			case "*" :
				result = Integer.toString(num1*num2);
				break;
			case "/" :
				result = Integer.toString(num1/num2);
				break;
			default :
				result = "error";
			}
			dos.writeUTF(result);
//			System.out.println(result);
		}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dis.close();
			dos.close();
			serverSocket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
