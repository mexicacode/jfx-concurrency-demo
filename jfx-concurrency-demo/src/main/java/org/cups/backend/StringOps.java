package org.cups.backend;

public class StringOps implements Runnable{

	private int  count = 0;
	
	@Override
	public void run() {

	}
	
	public synchronized void imprime(String name) {
		incrementCount();
		System.out.println(this.count + " : " + name);
	}
	
	private void incrementCount() {
		count= count + 1;
	}

}
