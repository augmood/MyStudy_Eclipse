package com.kh.oop;

public class KHStudnet extends Student { // Ȯ���ؾ���
	
	private int java;

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}
	
	@Override
	public int total() {
		return super.total()+this.java;
	}
	
	@Override
	public double avg() {
		return this.total() / 4.0;
	}
	
	

}
