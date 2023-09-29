package com.java.selenium.util;

public class DebugExample {

	public static void main(String[] args) {
		System.out.println("test1");
		System.out.println("test2");
		System.out.println("test3");
		System.out.println("test4");
		System.out.println("test5");
		DebugExample debugExample = new DebugExample();
		debugExample.test(12, "Kifle");
		
	}

	public void test(int i, String s) {
		
		System.out.println(i);
		System.out.println(s);
		
	}
	
}
