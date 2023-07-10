package sai.java;
import java.util.*;
public class sumof10numbers {
	public static void main(String[] args) {
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i=1; i<=num.length; i++) {
			sum+=num[i];
			System.out.println("the sum of numbers"+sum);
		}
	}

}
