package sai.java;
import java.util.*;
public class sumofdigitsofndigitnumber {
   public static void main(String[] args) {
	   System.out.println("Enter the number");
	   Scanner a = new Scanner(System.in);  // this is the input taking from the user
	   int n = a.nextInt();
	   int sum=0;
	   while(n!=0) {
		   int rem =n%10;   //% operator is used to return the remainder
		   sum+=rem;
		   n/=10;
		   
	   }
	   System.out.println(sum);
	   
   }
}
