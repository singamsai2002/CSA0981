package sai.java;
import java.util.*;
public class simpleinterest {
     public static void main(String[] args) {
    	 System.out.println("Enter the principal amount:");
    	 System.out.println("Enter the time:");
    	 System.out.println("Is customer senior citizen (y/n)");
    	 Scanner sc = new Scanner(System.in);
    	 float p = sc.nextFloat();
    	 float t = sc.nextFloat();
    	 float r = sc.nextFloat();
    	 float SI = (p*t*r)/100;
    	 System.out.println("Simpleinterest="+SI);
    	 
    	 
     }
}
