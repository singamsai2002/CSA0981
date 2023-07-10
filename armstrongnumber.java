package sai.java;
import java.util.*;
public class armstrongnumber {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		int num=371,n,temp,res=0;
		n = num;
		while(n!=0) {
			temp = n%10;
			res+=Math.pow(temp,3);
			n/=10;
		}
        if(res == num)
	          System.out.println(num+ "it is a armstrong number");
       else
	     System.out.println(num+ "it is not a armstrong number");
				
			
        
     
		
		
	

	}
}
