package sai.java;
import java.util.*;
public class vowels {
  public static void main(String[] args) {
	  System.out.println("Enter the string:");
	  Scanner sc = new Scanner(System.in);
	  String s = sc.next();
	  int len = s.length();
	  char a [] = new char[len];
	  int vow =0;
	  
	  for(int i=0;i<len;i++) {
		  a[i] = s.charAt(i);
		  if(a[i]=='a'|| a[i]=='e' || a[i]=='i'|| a[i]=='o'|| a[i]=='u'||
				  a[i]=='A'||a[i]=='E'||a[i]=='O'||a[i]=='U')
			  vow=vow+1;
		 
			  
	  }
	  System.out.println(vow);
	  
  }
}
