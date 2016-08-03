/**
 * 
 */
package com.learn.subject;

import com.learn.observer.Observer;

/**
 * @author AL
 *
 */
public interface Subject {
	void register(Observer obs);
	void remove(Observer obs);
	void notifyObserver(String msg);
}
