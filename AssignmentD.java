package com.qspiders.filehandilng;

import java.io.File;

public class AssignmentD {

	public static void main(String[] args) {
		File ref=new File("S:\\Surya\\singam");
		boolean b=ref.exists();
		if(b==true) {
			ref.delete();
			System.out.println("Deleted succesfully");
		}else {
			System.out.println("Not found");
			
		}
	}

}
