package com.learn.subject;

import java.util.LinkedList;
import java.util.List;

import com.learn.observer.Observer;

public class Publish implements Subject{
	
	List<Observer> obsList = new LinkedList<Observer>();

	@Override
	public void register(Observer obs) {
		obsList.add(obs);
		
	}

	@Override
	public void remove(Observer obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver(String msg) {
		for(Observer obs : obsList)
		{
			obs.update(msg);
		}
		
	}

}
