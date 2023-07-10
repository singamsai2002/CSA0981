package sai.java;
import java.util.*;
public class pattern15 {
    public static void main(String[] args)
    {
    	Scanner a = new Scanner(System.in);
    	int n = a.nextInt();
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(1+" ");
    		}
    		System.out.println();
    	}
    	for(int i=n-1;i>=0;i--)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(1+" ");
    		}
    		System.out.println();
    	}
    }
}
