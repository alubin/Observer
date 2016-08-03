package com.learn;

import com.learn.observer.Observer;

public class CurrentMessage implements Observer{

	@Override
	public void update(String msg) {
		System.out.println("This is the recieved Message: "+ msg);
		
	}
	

}
