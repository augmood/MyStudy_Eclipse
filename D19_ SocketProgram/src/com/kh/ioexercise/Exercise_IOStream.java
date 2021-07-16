package com.kh.ioexercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_IOStream {

	// 왜 여기다가 객체를?
	// 모든 메소드에서 다 쓸 수 있게 미리 만들어준 것.
	static String name;
	static int age;
	static String address;

	public static void main(String[] args) {
		menu();
	}

	static void menu() {
		Scanner sc = new Scanner(System.in);
		terminated: while (true) {
			System.out.println("1. 정보입력");
			System.out.println("2. 정보출력");
			System.out.println("3. 정보저장 (Save)");
			System.out.println("4. 정보 불러오기(load)");
			System.out.println("0. 종료");
			System.out.print("메뉴를 입력 하세요 : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				print();
				break;
			case 3:
				save();
				break;
			case 4:
				load();
				break;
			case 0:
				break terminated;

			}
		}

	}

	static void insert() {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("주소를 입력하세요 : ");
		address = sc.nextLine();
	}

	static void print() {

		// name등 값 그냥 쓰면 안됨 메소드가 달라서 바로 못 써
		// public class에 객체를 미리 만들어줌 그럼 쓸 수 있음
		System.out.println("이름 : " + name);
		System.out.println("나이: " + age);
		System.out.println("주소 : " + address);
	}

	static void save() {
		// 입출력한 값을 읽고 저장해주는 공간
		// file에 대한 출력 스트림을 설정함
		FileWriter fw = null;
		if (name == null) {
			System.out.println("저장할 내용이 없습니다.");
			return;
		}
		String str = name + "/" + age + "/" + address;
		// 입력값을 여기에 저장할 것 (하나하나 쓰면 귀찮으니까)

		try {
			// 이름으로 된 텍스트 파일 만듦 여기에 값을 출력할 것
			fw = new FileWriter(name + ".txt");
			fw.write(str); // 값 여기 있음
			System.out.println("저장이 완료 되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close(); // 닫아줘야 이름으로 만드는 텍스트 파일에 값이 잘 저장됨
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 이 부분이 좀 어려움
	static void load() {
		FileReader fr = null;
		// 이거 왜 씀? 불러들이는 값의 크기를 몰라서 오류가 발생할 수 있기 때문에 보조해줌
		BufferedReader bfr = null; 
		String data = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 파일의 제목을 입력하세요 : ");
		String subject = sc.nextLine();
		try {
			// 위에 저장된 파일을 읽어오겠다.
			fr = new FileReader(subject+".txt");
			bfr = new BufferedReader(fr);
			// bfr이 있기 때문에 배열의 크기를 생각하지 않아도 돼서 이 줄이 필요가 없음
//			char[] cbuf = new char[300];
//			while (true) {
//				int readNo = fr.read(cbuf);
//				if (readNo == -1)
//					break;
//				data += new String(cbuf, 0, readNo);
//			}
			data = bfr.readLine();
			// 값을 / 로 잘라서 출력한다.
			StringTokenizer st = new StringTokenizer(data, " / ");
			if(st.countTokens() !=3) { //입력한 데이터 3개(이름 나이 주소) 가 아니면 에러메세지
				System.out.println("오류가 발생하였습니다.");
				return;
			}
			// 자른대로 잘 출력하기
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());
			address = st.nextToken();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
