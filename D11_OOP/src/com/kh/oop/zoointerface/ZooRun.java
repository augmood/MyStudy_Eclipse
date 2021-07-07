package com.kh.oop.zoointerface;

public class ZooRun {
	public static void main(String [] args) {
		ZooKeeper keeper = new ZooKeeper();
		Lion lion = new Lion();
		keeper.feed(lion);
		Tiger tiger = new Tiger();
		keeper.feed(tiger);
		Crocodile crocodile = new Crocodile();
		keeper.feed(crocodile);
		Wolf wolf = new Wolf();
		keeper.feed(wolf);
	}

}
