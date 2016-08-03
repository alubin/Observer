package com.learn.client;

import com.learn.observer.Observer;
import com.learn.observer.ObserverDefault;
import com.learn.observer.Subscribe;

public class Client {

	public static void main(String[] args) {
		
		Observer obs = new Observer() {

			@Override
			public void update(String msg) {
				System.out.println("Crazy Msg:" + msg);
				
			}};
			
			ObserverDefault obs2 = new ObserverDefault() {
			};
			
		Subscribe sub = new Subscribe();
		sub.register(obs);
		sub.register((Observer) obs2);
	}

}
