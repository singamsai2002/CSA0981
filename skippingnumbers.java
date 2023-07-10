package sai.java;
import java.util.*;
public class skippingnumbers {
   public static void main(String[] args) {
	   System.out.print("Enter the number");
	   Scanner sc = new Scanner(System.in);
	   int m = sc.nextInt();
	   int n = sc.nextInt();
	   int k = sc.nextInt();
	   for(int i=m;i<=n;i=i+k+1) {
		   System.out.print(i+" ");
	   }
   }
}
