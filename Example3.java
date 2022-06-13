package org.jsp.Exceptions;

import java.io.IOException;

public class Example3
{
	void method()throws IOException
	{  
		  System.out.println("device operation performed");  
		 }  
		}  
		class Testthrows3
		{  
		   public static void main(String args[])throws IOException
		   {//declare exception  
		     Example3 m=new Example3();  
		   m.method(); 
		  
		    System.out.println("normal flow...");  
		  }  

}
