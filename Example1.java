package org.jsp.Exceptions;

import java.util.Scanner;

public class Example1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("main starts");
		System.out.println("enter the x");
		int x = sc.nextInt();
		
		System.out.println("Enter the y");
		int y = sc.nextInt();
		
		System.out.println("x/y =" +x/y);
		
		System.out.println("Main ends");
		
	}

}
