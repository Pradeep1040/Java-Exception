package org.jsp.Exceptions;

import javax.management.MBeanException;

public class Example5 extends Exception
{  
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            // throw an object of user defined exception  
	            throw new Exception();  
	        }  
	        catch (MBeanException ex)  
	        {  
	            System.out.println("Caught the exception");  
	            System.out.println(ex.getMessage());  
	        } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	  
	        System.out.println("rest of the code...");    
	    }  
	}  


