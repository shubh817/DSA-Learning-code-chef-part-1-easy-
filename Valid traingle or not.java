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
        	if(a+b<c ||b+c<a || a+c<b)
        	{
        	    System.out.println("NO");
        	}
            else{
                System.out.println("YES");
            }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
