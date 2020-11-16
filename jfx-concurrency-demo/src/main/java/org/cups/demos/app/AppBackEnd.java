package org.cups.demos.app;

public class AppBackEnd implements Runnable{

	private Bootstraping bt;
	
	public AppBackEnd(){
		
	}
	
	public AppBackEnd(Bootstraping bt){
		this.bt = bt;
	}
	
	@Override
	public void run() {
		bt.getDemoService().imprime("DEMO CADENA!");
	}

}
