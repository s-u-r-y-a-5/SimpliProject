package com.LockedMe.com;

public class WelcomeScreen {

	public static void Info() {
			//Welcome screen with info of the Application name and developer name
			System.out.println("^^^^^^^^^^^^Lockedme.com^^^^^^^^^^^^^^\n" +
								"This application is developed by surya\n"
								+ "---------------------------------------");
			
			String Welcomeboard = "Features and three operations of the application\n\n" +
								  "1.Retrieving the file names in an ascending order.\n"+
								  "2.Option to add,delete,search a user specified file from the application.\n"+
								  "3.Closing the application.";
			
			
			System.out.println(Welcomeboard);
		}
	
	public static void mainmenu() {
		//main menu options to choose
		System.out.println("\n-------------------------------");
		String menu = "Select any option number from below\n" 
					+ "1.Retrive all files\n"
					+ "2.Display menu for file operations\n"
					+ "3.Exit program";
		System.out.println(menu);
	}
	
	public static void submenu() {
		//sub menu options to choose
		String nextmenu = "Select any option number from below\n"
				+ "1.Add a file\n"
				+ "2.Delete a file\n"
				+ "3.Search a file\n"
				+ "4.Exit submenu";
		System.out.println(nextmenu);
	}
	}

