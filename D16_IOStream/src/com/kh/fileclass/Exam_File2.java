package com.kh.fileclass;

import java.io.File;
import java.io.IOException;

public class Exam_File2 {
	public static void main(String [] args) throws IOException {
		
		File files = new File("parent");
		files.mkdir();
		
		File makeFile = new File("parent\\child.txt");
		makeFile.createNewFile();
		
		//파일명, 경로, 파일용량, 상위폴더 이름
		System.out.println("파일명 : "+makeFile.getName());
		System.out.println("경로 : "+makeFile.length());
		System.out.println("파일용량 : "+makeFile.getPath());
		System.out.println("상위폴더이름 : "+makeFile.getParent());
	}

}
