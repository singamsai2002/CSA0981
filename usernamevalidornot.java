package sai.java;
import java.util.*;
public class usernamevalid {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   String s1 = sc.nextLine();
    	   String s2 = sc.nextLine();
    	   if(s1==s2)
    		   System.out.print("username is valid:");
    	   else
    		   System.out.print("username is not valid");
       }
}


