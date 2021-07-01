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
        	int count=0;
        	String str="";
        	for(int i=1;i<=n;i++)
        	{
        	    if(n%i==0)
        	    {
        	        count++;
        	        str=str+i+" ";
        	    }
        	}
        	System.out.println(count);
         	System.out.println(str);
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
