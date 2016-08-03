package com.learn.sender;

import com.learn.subject.Publish;

public class Sender {

	public static void main(String[] args) {
		
		Publish pub = new Publish();
		
		pub.notifyObserver("this is a message 123");

	}

}
