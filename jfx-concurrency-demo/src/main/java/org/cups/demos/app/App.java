package org.cups.demos.app;

import org.cups.backend.StringOps;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.init();
    }

	private void init() {
		StringOps stringOps = new StringOps();
		Thread stringOpsThread = new Thread(stringOps);
		stringOpsThread.start();
		stringOps.imprime("Hello");
		stringOps.imprime("Hello");
		stringOps.imprime("Hello");
		stringOps.imprime("Hello");
		
	}
}
