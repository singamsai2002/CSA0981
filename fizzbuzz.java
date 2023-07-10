package sai.java;
import java.util.*;
public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++) {
    	
    	if(i%3==0 && i%5==0)
    	{
    		System.out.println("fizz buzz:");
    	}
    	else if(i%3==0) {
    	   System.out.println("Fizz");
    	}
    	else if(i%5==0) {
    		System.out.println("Buzz");
    	}
    	else {
    		System.out.println(i);
    	}
    }
	}

}
