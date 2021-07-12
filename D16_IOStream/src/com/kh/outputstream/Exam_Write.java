package com.kh.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String [] args) {
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("C:\\temp\\text2.txt"); // 이 파일을 만들어서
			byte [] data = "Hello Java I/O".getBytes(); // 이 문장을 byte로 변환하여 출력하려고 함
			for (int i = 0; i < data.length; i++) {
				os.write(data[i]); // data에 저장된 문장을 처음부터 끝까지 출력한다.
			}
			os.flush(); // 버퍼에 담아둔 것을 한번 비워준다. 여기서는 안써도 출력에는 지장 없음
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {  // 불필요한 사이클을 돌지 않게 끝내준다.
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
