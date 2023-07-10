package sai.java;
import java.util.*;
public class noddnumber {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int arr[] = new int[100];
	   int j=1;
	   for(int i=1;i<100;i++) {
		   arr[j] = i;
		   j++;
	   }
	   System.out.print(arr[n*2]);
   }
   
}
