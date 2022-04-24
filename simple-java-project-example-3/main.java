package com.wss.sultan.test;

import java.io.File;

class Main {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		if (args.length > 0) {
			String[] files = new File(args[0]).list();
			if (files != null) {
			    System.out.println("Len: " + files.length);
			} else {
			    System.out.println("null");
			}
		     }
		}
	   }
