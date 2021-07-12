package com.kh.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam_OutputStream {
	public static void main(String [] args) {
		String originalFile ="D:\\temp2\\inheritance.jpg";
		String copieFile = "D:\\copied.jpg";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(originalFile);
			fos = new FileOutputStream(originalFile);
			
			int readByteNo;
			byte [] readBytes = new byte[100];
			while((readByteNo = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0 , readByteNo);
			}
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
