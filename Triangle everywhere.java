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
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	int c=sc.nextInt();
        	if(a+b>c && a+c>b && b+c>a)
        	{
            	// Check for equilateral triangle
                if (a == b && b == c )
                    System.out.println("1");
             
                // Check for isoceles triangle
                else if (a == b || b == c || c == a )
                    System.out.println("2");
             
                // Otherwise scalene triangle
                else
                    System.out.println("3");
        	}
        	else
        	{
        	    System.out.println("-1");
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
