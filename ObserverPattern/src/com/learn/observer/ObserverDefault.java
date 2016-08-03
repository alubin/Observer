/**
 * 
 */
package com.learn.observer;

/**
 * @author AL
 *
 */
public abstract interface ObserverDefault {
	
	default void update(String msg)
	{
		System.out.println("This is the received message " + msg);
	}

}
