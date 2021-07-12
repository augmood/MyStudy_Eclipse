package com.kh.fileclass;

import java.io.File;
import java.io.IOException;

public class Exam_File1 {
	public static void main(String [] args) throws IOException {
	/*
	 * 1. 작업하는 workspace에 파일 생성
	 * 2. 기본 드라이브나 폴더에 파일 생성하기
	 * 3. 폴더 만들고 파일 생성하기
	 * 4. 계층적인 폴더 만들기
	 * 5. 존재 여부 확인
	 * 6. 파일 여부 확인
	 */
	
	//fileOutputStream fos = new FileOutputStream("C:\\temp\\.test1.txt"); // 이건 경로에 생김
	File file = new File("fileMake.txt"); // 1
	file.createNewFile();
	File file2 = new File("C:\\temp\\.test1.txt"); // 2
	file2.createNewFile();
	File file3 = new File("D:\\temp2");
	file3.mkdir();
	File file4 = new File("D:\\temp2\\temp22");
	file4.mkdirs();
	
	System.out.println("파일이 존재하는가? : "+file.exists());
	System.out.println("fileMaker가 파일이 맞는가? : "+file.isFile());
	System.out.println("temp2가 파일이 맞는가? : "+file3.isFile());

	}
}
