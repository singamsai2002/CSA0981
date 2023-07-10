package sai.java;
import java.util.*;
public class specialcharacters {
     public static void main(String[] args) {
    	 System.out.println("Enter the string:");
    	 Scanner a = new Scanner (System.in);
    	 String s = a.nextLine();
    	 int len = s.length();
    	 int cap=0,sm=0,num=0,sp=0,spl=0,d;
    	 for(int i=0;i<len;i++)
    	 {
    		d = s.charAt(i);
    		if(d>='A' && d<='Z')
    			cap++;
    		else if(d>='a' && d<='z')
    			sm++;
    		else if(d>='0' && d<='9')
    			num++;
    		else if(d==' ')
    			sp++;
    		else
    		{
    			spl++;
    		     System.out.println(s.charAt(i));
    		}
    		
    		
    	 }
    	 
    		System.out.println("the special characters is "+spl);
    		System.out.println("numbers is "+num);
    		System.out.println("capital letters is "+cap);
     }
}

