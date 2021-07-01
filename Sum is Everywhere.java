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
        	int n=sc.nextInt();
        	long odd=0,even=0;
        	for(int i=1;i<=2*n;i++)
        	{
        	    if(i%2!=0)
        	    {
        	        odd=odd+i;
        	    }
        	    else
        	    {
        	        even=even+i;
        	    }
        	}
        	System.out.print(odd+" ");
        	System.out.println(even);
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
