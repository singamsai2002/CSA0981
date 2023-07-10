package sai.java;
import java.util.*;
public class vote {
  public  static void main(String[] args) {
	  System.out.print("Enter the age:");
	 Scanner sc = new Scanner(System.in);
	 int age,shrt;
	 age = sc.nextInt();
	  if(age>=18) {
		  System.out.println("eligible to vote:");
	  }
	  else {
		 shrt=(18-age); 
		  System.out.print("not eligible to vote:");
	  }
  }
	  
}
