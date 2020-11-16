package org.cups.services;

public class DemoService{

	private int  count = 0;

	
	public synchronized void imprime(String name) {
		incrementCount();
		System.out.println(this.count + " : " + name);
	}
	
	private void incrementCount() {
		count= count + 1;
	}

}
