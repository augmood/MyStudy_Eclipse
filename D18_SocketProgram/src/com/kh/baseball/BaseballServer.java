package com.kh.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaseballServer {
	public static void main(String [] args) {
		
		ServerSocket serverSocket = null; // ���� ����
		int port = 8031; // ��Ʈ��ȣ ����
		Random rand = new Random(); // �������� ���� �޴´�.
		int [] goals = null; // ���ڸ� ���� ����
		String goalStr = ""; // (null�� �ص� ����� ������ Ȥ�� ���� �ֵ���ǥ �ص�)
		// ���� ���� ����� �� (����, ��� ���� ������ ������� ������ �ϳ��� �ٲ������ ���� �� �ٲ������, ���� ���� String)		
		InputStream in = null; // �Է½�Ʈ��
		DataInputStream din = null; // ������Ʈ��
		OutputStream os = null;
		DataOutputStream dos = null;

		
		try {
			System.out.println("���� ������ �����Ͽ����ϴ�.");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�...");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			// �߱� ���� ���� (�ߺ�x), ������ �̿��Ͽ� ����
			goals = new int[3];
			// 1���� 9������ ������ ����
			for(int i = 0; i < goals.length; i++) {
				goals[i] = rand.nextInt(9)+1; //���������� ���� �����ϰ� ������
				for(int j = 0; j < i; j++) { // ������ ���� �ߺ����� �ƴ��� �Ǻ�
					if(goals[j] == goals[i]) {
						i--; // ���� ���ٸ� ���� ���� �̾Ƴ���. 
						break; 
						}
					}
				}
			goals = new int[3];
			goals[0] = rand.nextInt(9)+1;
			goals[1] = rand.nextInt(9)+1;
			goals[2] = rand.nextInt(9)+1;
			
			goalStr = goals[0]+" "+goals[1]+" "+goals[2];
			
			System.out.println("�������� --> "+ goalStr);			
			in = socket.getInputStream();
			din = new DataInputStream(in);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);

			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			while(true) {
			String readNum = din.readUTF();
			System.out.println("Ŭ���̾�Ʈ�� �Է��� ��  --> "+ readNum);
			// ��, ��Ʈ����ũ ���� �۾�
			// �Է¹��� ���� �ϳ��� �߶󳻾���.
			// ������ �������� ���ڿ��� �ڸ��� ���.
			// 1. split()
			// 2. substring () / trim()�� ����������
			// 3. StringTokenizer
			
			StringTokenizer st = new StringTokenizer(readNum); //#
			int [] nums = new int[3]; 
			for(int i = 0; i<nums.length; i++) {
				// 1 2 3 
				// �ٵ� �̰� ���ڸ� �ڸ��°��ݾ� �׷� ���ڸ� ���� ��ȯ��? 
				// Integer.parseInt(); �� �Ἥ int �迭�� �������
				while(st.hasMoreTokens()) {
				nums[i] = Integer.parseInt(st.nextToken()); // ������ �߶󳻰� ���ڸ� ����ϰ�
			}
			}
			
			// String [] nums = readNum.split(" "); �� �ᵵ ��
			// �������� (��ġ�� ���� ã�Ƴ��� ��Ʈ����ũ �� Ȩ�� �Ǵ�)
			// �ΰ��� �迭�� ���Ҷ��� �ݵ�� ��ø for���� �̿�
			// goals, nums
			int strike = 0; // �ڸ��� ���� ���ڵ� ����
			int ball = 0; // ���ڰ� ����
			for(int i = 0 ; i<goals.length; i++) { //#
				for(int j = 0; j <nums.length; j++) {
					if(goals[i] == nums[j]) {
						if(i == j) { // �� �� ����
							strike++;
						}else { // ���ڸ� ����
							ball++;
							}
						}
					}
				}
			 String result = strike + " ��Ʈ����ũ"+ball+" ��";
			 System.out.println(result);
			 // ��� �� ������
			 dos.writeUTF(result);
			 if(strike == 3) {
				 System.out.println("G A M E S E T");
				 dos.writeUTF("end");
				 break;
			 }else {
				 dos.writeUTF("continue");
			 }
			 
			 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("������ �����մϴ�.");
		
		try {
			dos.close();
			os.close();
			din.close();
			in.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
		
		
	}


