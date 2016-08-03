package com.learn.client;

import com.learn.observer.Observer;
import com.learn.observer.ObserverDefault;
import com.learn.subject.Publish;

public class Client {

	public static void main(String[] args) {
		
		Observer obs = new Observer() {

			@Override
			public void update(String msg) {
				System.out.println("Crazy Msg:" + msg);
				
			}};
			
			ObserverDefault obs2 = new ObserverDefault() {
			};
			
		Publish sub = new Publish();
		sub.register(obs);
//		sub.register((Observer) obs2);
	}

}
