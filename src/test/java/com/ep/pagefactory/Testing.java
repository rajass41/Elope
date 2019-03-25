package com.ep.pagefactory;



public class Testing {
	
	

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("CherChr.tech");
		System.out.println("Address of str1 : "+System.identityHashCode(sb1));
		sb1.replace(0, sb1.length()-1, "selenium-webdriver.com");
		System.out.println("Address of str1 after change : "+System.identityHashCode(sb1));
	}
}
