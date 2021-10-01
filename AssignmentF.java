package com.qspiders.filehandilng;

import java.io.File;

public class AssignmentF {
	public static void main(String[] args) {
		File ref=new File("S:\\Surya");
		boolean b=ref.exists();
		if(b==false) {
			ref.mkdir();
			System.out.println("Folder created");
		} else {
			System.out.println("Folder Exists");
		}
	}

}
