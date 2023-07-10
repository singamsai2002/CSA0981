package sai.java;
import java.util.*;
public class javaProject{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		operations ob = new operations();
		System.out.println(ob.sub(a, b));
		System.out.println(ob.add(a, b));
	}
}
class operations{
	public int add(int a , int b) {
		return a+b;
	}
	public int sub(int a , int b) {
		return a-b;
	}
	public int mul(int a , int b) {
		return a*b;
	}
	public int div(int a , int b) {
		return a/b;
	}
}
