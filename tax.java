package sai.java;
import java.util.*;
public class tax {
   public static void main(String[] args) {
	  System.out.println("Enter the income tax:");
	  Scanner a = new Scanner(System.in);
	  int inc = a.nextInt();
	  float tax;
	  if(inc<=150000)
	  {
		  System.out.println("no tax");
	  }
	  else if(inc>=150001 && inc<300000)
		  System.out.println("tax"+inc/10);
	  else if(inc>=300001 && inc<=500000)
		  System.out.println("tax:"+inc/20);
	  else {
		  System.out.println("tax"+inc/30);
	  }
		  
	  
   }
}
