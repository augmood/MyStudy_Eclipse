package com.kh.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam_FileInputStream {
	
	public static void main(String [] args) {
		FileInputStream fis = null; 
		try {
			fis = new FileInputStream("C:\\javaworkspace\\D16_IOStream\\src\\com\\kh"
					+ "\\filestream\\Exam_FileInputStream.java");
			int dataByteNo;
			byte [] buf = new byte[100];
			String result = "";
			while((dataByteNo = fis.read(buf)) != -1) {
				result += new String(buf, 0, dataByteNo);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
