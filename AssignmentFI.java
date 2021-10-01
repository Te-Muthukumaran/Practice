package com.qspiders.filehandilng;

import java.io.File;
import java.io.IOException;

public class AssignmentFI {

	public static void main(String[] args) {
		File ref=new File("S:\\Surya\\singam");
		boolean b=ref.exists();
		if(b==false) {
			//try {
				try {
					ref.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("File created");
			//}catch (Exception e) {
				//e.printStackTrace();
			//}
		}else {
			System.out.println("File exists");
		}

	}

}
