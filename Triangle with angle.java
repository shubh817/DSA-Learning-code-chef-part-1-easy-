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
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int c = sc.nextInt();
        	if(a+b+c==180 && a!=0 && b!=0 && c!=0)
        	{
        	    System.out.println("YES");
        	}
        	else
        	{
        	    System.out.println("NO");
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
