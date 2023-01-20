package com.LockedMe.com;

import java.io.IOException;

/*Abstract class contains the menu of the Protoype project LockedMe*/
public abstract class LockedMain {
	public static void main(String[] args) throws IOException {		//Main class
		WelcomeScreen.Info();										//Class created with method name
		FileOperations.info();														
	}
}
