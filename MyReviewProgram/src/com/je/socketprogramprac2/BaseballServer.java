package com.je.socketprogramprac2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.StringTokenizer;

public class BaseballServer {
	public static void main(String [] args) {
		/* 
		 * �������� ������ 3�� ���ڸ� �Է¹ް�
		 * Ŭ���̾�Ʈ�� 3���� ���ڸ� �Է�������
		 * ���� ��ġ�� ���� ������ ��Ʈ����ũ, ���� ������ ���� ����ϱ�  (���� ������)
		 * Ŭ���̾�Ʈ�� ���� �޼����� ������ �����ϱ�
		 * ���ڸ� �Է��Ҷ� 3 4 4 �̷��� ������� �Է��ϱ�
		 */
		
		ServerSocket serverSocket = null;
		int port = 8412;
		Random rand = new Random();
		int [] homerun = null;
		String homerunStr = ""; 
		
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			System.out.println("���� ������ �����Ͽ����ϴ�.");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			
			homerun = new int[3];
			
			for(int i = 0; i < homerun.length; i++) {
				homerun[i] = rand.nextInt(9)+1;
				for(int j = 0; j < i; j++) {
					if(homerun[j] == homerun[i]) {
						i--;
						break;
					}
				}
			}
			homerun = new int[3];
			homerun[0] = rand.nextInt(9)+1;
			homerun[1] = rand.nextInt(9)+1;
			homerun[2] = rand.nextInt(9)+1;
			
			homerunStr = homerun[0]+" "+homerun[1]+" "+homerun[2];
			
			System.out.println("���� ����  --> "+homerunStr);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(true) {
				String readNum = dis.readUTF();
				System.out.println("Ŭ���̾�Ʈ�� �Է��� �� --> ");
				
				StringTokenizer st = new StringTokenizer(readNum);
				int [] nums = new int[3];
				for(int i = 0; i < nums.length; i++) {
					while(st.hasMoreTokens()) {
						nums[i] = Integer.parseInt(st.nextToken());
					}
				}
				
				int strike = 0;
				int ball = 0;
				for(int i = 0; i < homerun.length; i++) {
					for(int j = 0; j < nums.length; j++) {
						if(homerun[i] == nums[j]) {
							if(i == j) {
								strike ++;
							} else {
								ball++;
							}
						}
					}
				}
				
				String result = strike + " ��Ʈ����ũ  "+ball +" ��";
				System.out.println(result);
				
				dos.writeUTF(result);
				if(strike == 3) {
					System.out.println("GAME SET");
					dos.writeUTF("end");
					break;
				} else {
					dos.writeUTF("continue");
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("������ �����մϴ�.");
		
		try {
			dos.close();
			dis.close();
			serverSocket.close();
			is.close();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
