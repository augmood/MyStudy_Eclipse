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
			System.out.println(time + " ���� ��û�� ��ٸ��ϴ�.");
			socket = serverSocket.accept();
			
			//Ŭ���̾�Ʈ���� �޼����� �����ٰž�
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			//dos�� �޼����� ��Ƽ� �����ž�
			String str = "[Notice] : Test Messge From Server!";
			dos.writeUTF(str);

			System.out.println("������ ���� �Ϸ�.");

			dos.close();
			os.close();
			socket.close();
			serverSocket.close();
			// ���⿡ �ѹ� �� ������ ������ ���� �ð��� �״�� ��µ� (new Date�� ���ο� ���� ������)
			time = format.format(new Date());
			System.out.println(time + "������ �����Ͽ����ϴ�.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
