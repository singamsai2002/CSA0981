package sai.java;
import java.util.*;
public class mean
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int sum=0;
	    System.out.println("enter the values");
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	        sum=sum+a[i];
	    }
	    int mean=sum/n;
	    int median=(n+1)/2;
	    System.out.println("mean"+mean);
	    System.out.println("median"+a[median-1]);
		
	}
}
