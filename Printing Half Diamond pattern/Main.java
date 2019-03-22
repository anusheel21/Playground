import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();int c=n-1;int a=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=c;j++)
          System.out.print(" ");
        c=c-1;
        for(int k=1;k<=a;k++)
          System.out.print("*");
        a=a+2;
       System.out.println(); // Type your code here
	}}}
