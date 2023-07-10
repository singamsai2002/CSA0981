package sai.java;
import java.util.*;
public class atmbalance {
   public static void main(String[] args) {
	  Scanner sa = new Scanner(System.in);
	  System.out.println("Enter the 1st denomination:");
	  int a = sa.nextInt();
	  Scanner sb = new Scanner(System.in);
	  System.out.println("Enter the 1st denomination notes:");
	  int b = sb.nextInt();
	  Scanner sf = new Scanner(System.in);
	  System.out.println("Enter the 2nd denomination:");
	  int c = sf.nextInt();
	  Scanner sq = new Scanner(System.in);
	  System.out.println("Enter the 2nd denomination notes:");
	  int d = sq.nextInt();
	  Scanner st = new Scanner(System.in);
	  System.out.println("Enter the 3rd denomination:");
	  int e = st.nextInt();
	  Scanner sl = new Scanner(System.in);
	  System.out.println("Enter the 3rd denomination notes:");
	  int f = sl.nextInt();
	  Scanner sk = new Scanner(System.in);
	  System.out.println("Enter the 4th denomination:");
	  int g = sk.nextInt();
	  Scanner sp = new Scanner(System.in);
	  System.out.println("Enter the 4th denomination notes:");
	  int h = sp.nextInt();
	  int total = (a*b) + (c*d) + (e*f) + (g*h);
	  System.out.println("total available balance in atm:"+ total);
	  
	  
	  
	  
	   
   }
}
