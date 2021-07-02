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
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int a[]=new int[5];
		    int t=0,t1=0;
		    for(int i=1;i<=n;i++)
		    {
		        if(i%2!=0)
		        {
		            for(int j=t+1;j<=5*i;j++)
		            {
		                System.out.print(j+" ");
		                t=j;
		            }
		        }
		        else
		        {
		            for(int j=t+1;j<=5*i;j++)
		            {
		                a[t1]=j;
		                t=j;
		                t1++;
		            }
		            for(int j=t1-1;j>=0;j--)
		            {
		                System.out.print(a[j]+" ");
		            }
		            t1=0;
		        }
		        System.out.println(" ");
		    }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
