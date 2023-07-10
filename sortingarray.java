package sai.java;
import java.util.*;
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   String S[]= {"Banana","Carrot","Radish","Apple","Jack"};
   char ch=s.next().charAt(0);
   Arrays.sort(S);
if(ch=='A'|| ch=='a')
   {
	   for(int i=0;i<S.length;i++)
	   {
		   System.out.println(S[i]);
	   }
   }
else if (ch=='D'|| ch=='d')
{
	   for(int i=S.length-1;i>=0;i--)
	   {
		   System.out.println(S[i]);
	   }
}

	}

}
