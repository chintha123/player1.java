/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Isogram
{
	boolean check(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
		for(int i=0;i<s1.length();i++)
		{
		  char ch1=s1.charAt(i);
		  char ch2=s2.charAt(i);
		  for(int j=i+1;i<s1.length();j++)
		  {
		     char ch3=s1.charAt(j);
		     char ch4=s2.charAt(j);
		     if(ch1==ch3&&ch2==ch4)
		     return true;
		     else
		      return false;
		  }
		}
		}
		else
		return false;
		return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		Isogram is=new Isogram();
		if(is.check(s1,s2))
		System.out.println("yes");
		else
		System.out.println("no");
	
	}
}
