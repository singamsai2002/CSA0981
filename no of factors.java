package sai.java;
import java.util.*;
public class nooffactors {
    public static void main(String[] args) {
    	System.out.println("Enter the number:");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int sum=0;
    	for(int i=1;i<n;i++) {
    		if(n%i==0) 
    			sum=sum+i;
    	}
    	if(sum==n)
    	{
    		System.out.println("it is a perfect number");
    	}
    		else
    		   {
    			System.out.println("it is not a perfect number");
    		
    			}
    	}
    		
    			
    	}
    


