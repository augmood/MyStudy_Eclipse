package com.kh.filestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_Stream {
	
	public static void main(String [] args) throws Exception {
		
		/* 
		 * 저장할 파일 명 : text11. txt
		 * 내용입렵 : 
		 * 종료는 exit
		 * 1 :1111 
		 * 2 :2222
		 * 3 :3333
		 * 4 :4444
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 : ");
		String fileName = sc.next();
		sc.nextLine(); // 개행 제거
		FileOutputStream fos = new FileOutputStream("C:\\temp\\"+fileName); // 파일을 만들어 줍니다.
		System.out.println("'"+fileName+"' 파일에 저장될 내용 입력 : ");
		System.out.println("종료는 exit");
		int lineNumber = 1;
		
		while(true) {
			System.out.print(lineNumber++ +" : "); // lineNumber++ 1: 2: 받는 값의 수를 늘려줌
			String str = sc.nextLine() + "\n"; // 여기에서 개행을 해줘야 break가 걸림
			byte [] buf = str.getBytes(); // 줄마다 들어가는 값을 저장해줌
			if(str.equals("exit\n")) { // exit이 나오면 종료함
				break;
			}
			fos.write(buf); // 결과물 출력함
		}
		fos.flush();
		fos.close();  // 프로젝트+F5를 누르면 완성된 파일이 보임
	}

}
