package sai.java;
import java.util.*;
public class marksstudent {
    public static void main(String[] args) {
    	int a=90,b=91,c=92,d=93;
    	int total = (a+b+c+d);
    	float agg = total/4f;
    	System.out.println(total);
    	System.out.println(agg);
    	if(agg>75) 
    		System.out.println("DISTINCTION");
    		else if(agg>=60 && agg<75)
    		
    			System.out.println("FIRST DIVISION");
    		else if(agg>=50 && agg<60)
    			System.out.println("SECOND DIVISION");
    		else if(agg>=40 && agg<30)
    			System.out.println("THIRD DIVISION");
    		else
    			System.out.println("FAIL");
    	
    			
    }
}
