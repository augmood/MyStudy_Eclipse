package com.kh.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Calender {
	public static void main(String [] args) {
		
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) +1;
		int date = today.get(Calendar.DATE);
		int ampm = today.get(Calendar.AM_PM);
		int hour = today.get(Calendar.HOUR);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		// �׷����� �޷� ��ü
		System.out.printf("%d. %d. %d \nampm : %d %d:%d:%d"
				, year, month, date, ampm, hour, min, sec);
		System.out.println();
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(new Date());
		calendar.add(Calendar.YEAR, 1);
		calendar.add(Calendar.MONTH, 2);
		System.out.println(calendar.getTime());
		
		
		//  ������ ���� �ٲٱ� (���� ���� ���)                       ��������
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate = format.format(new Date());
		System.out.println(strDate);
		
	}

}
