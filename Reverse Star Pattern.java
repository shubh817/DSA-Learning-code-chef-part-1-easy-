    /*
    *
   **
  ***
 ****
*****
*/
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
        	for(int i=1;i<=n;i++)
        	{
        	    for(int j=n-1;j>=i;j--)
        	    {
        	        System.out.print(" ");
        	    }
        	    for(int k=1;k<=i;k++)
        	    {
        	        System.out.print("*");
        	    }
        	    System.out.println();
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
