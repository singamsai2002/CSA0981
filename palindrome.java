package sai.java;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
//    System.out.println("Enter the string:");
    	String s1 ="madam";
    	String s2 ="";
    	int len = s1.length();
    	for(int i=len-1;i>=0;i--)
    	{
    		s2 = s2 + s1.charAt(i);
    	}
    if(s1.equals(s2))
    {
    	System.out.println("it is a palindrome");
    }
    else 
    {
    	System.out.println("it is not a palindrome");
    }
  }
}
