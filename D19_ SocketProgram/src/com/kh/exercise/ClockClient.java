package com.kh.exercise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ClockClient {
	public static void main(String[] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 7037;

		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream in = null;
		DataInputStream dis = null;

		try {
			socket = new Socket(address, port);
			// ���� ���ϴ� �������� API�� �ҷ����� HH:mm:ss�� ���� �ð��� �����
			SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
			// ���� ������ time�̶�� ���� �޾��ش�.
			String time = format.format(new Date());
			System.out.print(time + " ������ ���� ��û ���Դϴ�.");
			System.out.println(" ���� IP : " + address);
			
			// �Է� ��Ʈ���� �־�� �ְ����
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			
			// �������� �� �޼����� ���� ���� 
			String message = dis.readUTF();
			System.out.println("������ ���� ���� �޼��� " + message);
			System.out.println("������ �����մϴ�");
			dis.close();
			in.close();
			socket.close();
			System.out.println("������ �����Ͽ����ϴ�.");

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
