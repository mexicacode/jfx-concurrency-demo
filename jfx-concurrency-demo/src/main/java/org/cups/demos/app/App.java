package org.cups.demos.app;

import org.cups.backend.StringOps;
import org.cups.demos.views.TestView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.init(args);
    }


	private void init(String[] args) {
		StringOps stringOps = new StringOps();
		Thread stringOpsThread = new Thread(stringOps);
		stringOpsThread.start();
		stringOps.imprime("Hello");
		stringOps.imprime("Hello");
		stringOps.imprime("Hello");
		stringOps.imprime("Hello");
		new TestView().launchView(args);
		
	}
    
}
