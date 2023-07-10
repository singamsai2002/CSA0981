package sai.java;
import java.util.*;
public class comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner e=new Scanner(System.in);
    System.out.println("Enter the a value:");
    int a=e.nextInt();
    System.out.println("Enter the b value:");
    int b=e.nextInt();
    int c;
    
    for(int i=a+1;i<=b;i++)
    {
    	c=0;
        for(int j=1;i<=b;j++)
        {
        	if(i%j==0)
        		c++;
        }
    
        if(c>2)
        {
    	   System.out.println(i);
        }
    
	}	
}
}
