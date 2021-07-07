package com.kh.oop;

public class KHStudnet extends Student { // 확장해야지
	
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
