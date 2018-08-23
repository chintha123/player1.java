/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Roman
{
		int values(char r)
		{
			if(r=='I')
			return 1;
			if(r=='V')
			return 5;
		           if(r=='X')
			return 10;
			if(r=='L')
			return 50;
			if(r=='C')
			return 100;
			if(r=='D')
			return 500;
			if(r=='M')
			return 1000;
			return -1;
		}
		        int romatoDecimal(String s)
	    {
	    int res=0;
	     for(int i=0;i<s.length();i++)
	     {
	        int ch1=values(s.charAt(i));
	        if(i+1<s.length())
	        {
	        int ch2=values(s.charAt(i+1));
	        if(ch1>=ch2)
	        res=res+ch1;
	        else{
	        	res=res+ch2-ch1;
	        i++;
	        }
	        }
	        else
	        {
	        	res=res+ch1;
	        	i++;
	        }
	     }
	     return res;
	    }
	public static void main (String[] args) throws java.lang.Exception
	{
	
	     Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    s=s.toUpperCase();
	    Roman r=new Roman();
	 System.out.println(r.romatoDecimal(s)); 
	}
}
