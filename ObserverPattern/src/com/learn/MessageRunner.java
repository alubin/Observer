package com.learn;

public class MessageRunner {

	public static void main(String[] args) {
		MessageData data = new MessageData();
		
		CurrentMessage curr = new CurrentMessage();
		
		data.register(curr);
		
		data.setData("This is nice");
		data.setData("This is okay");
		data.setData("This is wonderful");

	}

}
