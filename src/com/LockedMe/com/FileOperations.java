package com.LockedMe.com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

	public static void info() throws IOException {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			WelcomeScreen.mainmenu();
			int ch;
			ch = scan.nextInt();
			switch(ch) {
			case 1:
				String path = "F:\\Simpli_Project\\";
				File file = new File(path);
				File[] filename = file.listFiles();
				for(File ff:filename) {
					System.out.println(ff.getName());
				}	
				System.out.println("From folder - " + path );
				break;
			case 2:
				WelcomeScreen.submenu();
				int ss;
				ss = scan.nextInt();
				switch(ss) {
				case 1:
					//Adding new file 
					String Addpath = "F:\\Simpli_Project\\";
					System.out.println("Enter filename to create: ");
					String CreateFile = scan.next();
					String Finalpath = Addpath+CreateFile;
					File AddFile = new File(Finalpath);
					if(AddFile.createNewFile()) {
						System.out.println("File created at " + Addpath + CreateFile);
					}
					else {
						System.out.println("File not created");
					}
					break;
				case 2:
					//Delete an existing file
					String Delepath = "F:\\Simpli_Project\\";
					System.out.println("Enter file name to delete: ");
					
					String DeleteFile = scan.next();
					String  delepath = Delepath+DeleteFile;
					File Delefile = new File(delepath);
					System.out.println(Delefile);
					if(Delefile.delete()) {
						System.out.println(DeleteFile + " File deleted");
					}
					else {
						System.out.println("file not deleted");
					}
					break;
				case 3:
					//search a file inside a folder
					String Searchpath = "F:\\Simpli_Project\\";
					System.out.println("Enter file name to search: ");
					String sear = scan.next();
					File Filesearch = new File(Searchpath);
					File[] itreate = Filesearch.listFiles();
					int flag = 0;
					for(File ff:itreate) {
						if(ff.getName().equalsIgnoreCase(sear)) {
							flag = 1;
							break;
						}
						else {
							flag = 0;
						}	
					}
					if(flag ==1) {
						System.out.println("File is found " + Searchpath + sear);
					}
					else {
						System.out.println("file not found");
					}
					break;
				case 4:
					//Return to main menu
					System.out.println("program exited Submenu");
					break;
				default:
					System.out.println("please select a valid number");
				}
				
				break;
			case 3:
				//Exiting the program
				System.out.println("Program exited succesfully");
				System.exit(0);
			default:
				System.out.println("please select a valid number");
			}
		}
			
	}
}
