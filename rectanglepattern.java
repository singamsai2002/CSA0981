package sai.java;
import java.util.*;
public class rectanglepattern {
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	int rows = sc.nextInt();
    	int col = sc.nextInt();
    	for(int i=0;i<=rows;i++)
    	{
    		for(int j=0;j<=col;j++)
    		{
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
}
