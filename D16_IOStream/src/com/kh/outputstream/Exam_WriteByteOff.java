package com.kh.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {
	public static void main(String [] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("C:\\temp\\text2.txt");
			byte [] data = "ABCDE".getBytes();
			os.write(data, 1, 2); // data에서 1번부터 시작해 2개까지만 출력한다.
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
