package org.cups.demos.app;

import org.cups.demos.views.TestView;
import org.cups.services.DemoService;

/**
 * Hello world!
 *
 */
public class MainApp 
{
	
	private static Bootstraping bootstraping;
	private DemoService demoService;
	private TestView testView;

    public static void main( String[] args )
    {
        bootstraping = new Bootstraping();
        new MainApp().init(args);
    }


	private void init(String[] args) {
		System.out.println("Ejecutando init");
		Runnable appBackEnd = new AppBackEnd(bootstraping);
		Thread appBackEndThread = new Thread(appBackEnd);
		appBackEndThread.start();
		bootstraping.getTestView().launchView(args);
	}
    
}

class Bootstraping {
	private TestView testView;
	private DemoService demoService;
	
	
	Bootstraping(){
		System.out.println("Ejecutando Bootstrping");
		this.testView = new TestView();
		this.demoService = new DemoService();
	}


	public TestView getTestView() {
		return testView;
	}


	public DemoService getDemoService() {
		return demoService;
	}
	
	
}
