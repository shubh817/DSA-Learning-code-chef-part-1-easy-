/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	if((n%5==0 && n%11!=0) || (n%5!=0 && n%11==0))
        	{
        	    System.out.println("ONE");
        	}
        	if(n%5==0 && n%11==0)
        	{
        	    System.out.println("BOTH");
        	}
        	if(n%5!=0 && n%11!=0)
        	{
        	    System.out.println("NONE");
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
	
}