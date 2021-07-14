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
		
		ServerSocket serverSocket = null; // 소켓 선언
		int port = 8031; // 포트번호 설정
		Random rand = new Random(); // 무작위의 수를 받는다.
		int [] goals = null; // 숫자를 받을 공간
		String goalStr = ""; // (null로 해도 상관은 없지만 혹시 몰라서 쌍따옴표 해둠)
		// 숫자 세개 출력한 것 (묶음, 길게 쓰면 귀찮고 묶어놓지 않으면 하나가 바뀌었을때 식을 다 바꿔줘야함, 공백 들어가서 String)		
		InputStream in = null; // 입력스트림
		DataInputStream din = null; // 보조스트림
		OutputStream os = null;
		DataOutputStream dos = null;

		
		try {
			System.out.println("서버 소켓을 생성하였습니다.");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 접속을 기다립니다...");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			// 야구 숫자 생성 (중복x), 랜덤을 이용하여 생성
			goals = new int[3];
			// 1부터 9사이의 랜덤한 숫자
			for(int i = 0; i < goals.length; i++) {
				goals[i] = rand.nextInt(9)+1; //범위내에서 숫자 랜덤하게 돌리기
				for(int j = 0; j < i; j++) { // 들어오는 값이 중복값이 아닌지 판별
					if(goals[j] == goals[i]) {
						i--; // 값이 같다면 작은 수를 뽑아낸다. 
						break; 
						}
					}
				}
			goals = new int[3];
			goals[0] = rand.nextInt(9)+1;
			goals[1] = rand.nextInt(9)+1;
			goals[2] = rand.nextInt(9)+1;
			
			goalStr = goals[0]+" "+goals[1]+" "+goals[2];
			
			System.out.println("서버숫자 --> "+ goalStr);			
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
			System.out.println("클라이언트가 입력한 수  --> "+ readNum);
			// 볼, 스트라이크 판정 작업
			// 입력받은 값을 하나씩 잘라내야함.
			// 공백을 기준으로 문자열을 자르는 방법.
			// 1. split()
			// 2. substring () / trim()은 공백제거임
			// 3. StringTokenizer
			
			StringTokenizer st = new StringTokenizer(readNum); //#
			int [] nums = new int[3]; 
			for(int i = 0; i<nums.length; i++) {
				// 1 2 3 
				// 근데 이게 문자를 자르는거잖아 그럼 숫자를 어케 반환함? 
				// Integer.parseInt(); 를 써서 int 배열로 만들어줌
				while(st.hasMoreTokens()) {
				nums[i] = Integer.parseInt(st.nextToken()); // 공백을 잘라내고 숫자만 출력하게
			}
			}
			
			// String [] nums = readNum.split(" "); 만 써도 됨
			// 판정시작 (겹치는 값을 찾아내고 스트라이크 볼 홈런 판단)
			// 두개의 배열을 비교할때는 반드시 중첩 for문을 이용
			// goals, nums
			int strike = 0; // 자리도 같고 숫자도 같음
			int ball = 0; // 숫자가 같음
			for(int i = 0 ; i<goals.length; i++) { //#
				for(int j = 0; j <nums.length; j++) {
					if(goals[i] == nums[j]) {
						if(i == j) { // 둘 다 같음
							strike++;
						}else { // 숫자만 같음
							ball++;
							}
						}
					}
				}
			 String result = strike + " 스트라이크"+ball+" 볼";
			 System.out.println(result);
			 // 결과 값 보내기
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
		System.out.println("게임을 종료합니다.");
		
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


