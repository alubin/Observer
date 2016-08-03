package com.learn;

import java.util.ArrayList;

import com.learn.observer.Observer;
import com.learn.subject.Subject;

public class MessageData implements Subject{
	private ArrayList<Observer> observer;
	
	public MessageData()
	{
		observer = new ArrayList();
	}

	@Override
	public void register(Observer obs) {
		observer.add(obs);
		
	}

	@Override
	public void remove(Observer obs) {
		int i = observer.indexOf(obs);
		if(i >= 0)
		{
			observer.remove(i);
		}
		
	}

	@Override
	public void notifyObserver(String msg) {
		for(Observer o : observer)
		{
			o.update(msg);
		}
		
	}
	
	public void setData(String msg)
	{
		notifyObserver(msg);
	}

}
