package com.kh.oop.musicinterface;

public class Stage {
	public static void main(String [] args) {
		Musician musician = new Musician();
		musician.playSomething(new Guitar());
		musician.playSomething(new Piano());
		musician.playSomething(new Chello());
		
	}

}
