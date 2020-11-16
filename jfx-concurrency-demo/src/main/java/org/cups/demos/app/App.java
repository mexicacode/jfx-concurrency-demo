package org.cups.demos.app;

import org.cups.demos.views.TestView;

public class App {
	
    public static void main( String[] args ) {
    	
        init(args);
        
    }
    
    public static void init(String[] args) {
    	
    	new TestView().launchView(args);
    	
    }
    
}
