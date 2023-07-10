package sai.java;
import java.util.*;
public class rightanglepattern {
	public static void main(String[] args) {
		System.out.println("Enter the no of rows");
		int n =5 ;
		int i,j;
		for(i = 1 ; i <= n ; i++) {
			for(j = 1 ; j <= i ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
