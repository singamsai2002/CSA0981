package sai.java;
import java.util.*;
public class Matrixaddition {
    public static void main(String[] args) {
    	int a[][] = {{1,3,2},{4,5,6},{1,4,5}};
    	int b[][] = {{7,8,9},{2,3,4},{1,3,2}};
    	
    	int c[][] = new int[3][3];
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    			c[i][j]=a[i][j]+b[i][j];
    			System.out.print(c[i][j]+"  ");
    		}
    		System.out.println();
    	}
    }
}
