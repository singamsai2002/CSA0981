package sai.java;
import java.util.*;
public class removevowelsstring {
   public static void main(String[] args) {
	   System.out.print("Enter the string:");
	   Scanner a = new Scanner(System.in);
	   String name = a.nextLine();
	   String n = name.replaceAll("[aeiouAEIOU]","");  //replaceAll is the inbuilt function is used to removing all the vowels from the string...
	   System.out.println(n);
	   
   }
}
