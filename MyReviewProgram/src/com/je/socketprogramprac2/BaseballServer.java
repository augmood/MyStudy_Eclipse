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
		 * 서버에서 무작위 3개 숫자를 입력받고
		 * 클라이언트가 3개의 숫자를 입력했을때
		 * 값과 위치가 전부 같으면 스트라이크, 값만 같으면 볼로 출력하기  (누적 합으로)
		 * 클라이언트가 종료 메세지를 보내면 종료하기
		 * 숫자를 입력할때 3 4 4 이렇게 공백까지 입력하기
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
			System.out.println("서버 소켓을 생성하였습니다.");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속하였습니다.");
			
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
			
			System.out.println("서버 숫자  --> "+homerunStr);
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
				System.out.println("클라이언트가 입력한 수 --> ");
				
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
				
				String result = strike + " 스트라이크  "+ball +" 볼";
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
		System.out.println("게임을 종료합니다.");
		
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
