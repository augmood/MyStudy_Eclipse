package com.kh.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {
	public static void main(String [] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("C:\\temp\\text2.txt");
			byte [] data = "Real I/O".getBytes();
			os.write(data); // data에 저장된 값을 통째로 가져온다.
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
