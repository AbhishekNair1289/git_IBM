package com.io.ibm;

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {
		File f = new File("abcd.txt");
		System.out.println(f.exists());//false
		System.out.println(f.createNewFile());
		//System.out.println(f.mkdir());
		System.out.println(f.exists());//true
		System.out.println(f.setReadOnly());
		System.out.println(f.isFile());//true
		//System.out.println(f.isDirectory());

	}

}
