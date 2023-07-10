package sai.java;
import java.util.*;
public class leapyear {
    public static void main(String[] args) {
    	System.out.print("Enter the  date/month/year");
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	String [] d = s.split("/",3);
    	int n = Integer.parseInt(d[2]);
    	if(n%4==0)
    		System.out.print("it is a leap year:");
    	else
    		System.out.print("it is not a leap year");
    }
}
