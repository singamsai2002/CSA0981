package sai.java;
import java.util.*;
public class nthfactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Enter the number:");
 Scanner sc = new Scanner(System.in);
 int num = sc.nextInt();
 int n = sc.nextInt();
 int arr[] = new int[100];
 int x=0;
 for(int i=1;i<=num;i++) {
	 if(num%i==0) {
		 arr[x]=i;
	     x++;
	 }
 }
 System.out.println(x);
 System.out.println("nth factor " +num+ " is "+arr[n-1]);
	 
 
	}

}
