import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
                       int n1=sc.nextInt();
                       int n2=sc.nextInt();
                       int n3=sc.nextInt();
          int a=great(n1,n2);             
       System.out.print(great(a,n3));                // Type your code here
	}
   public static int great(int n1,int n2)
                       {
                         if(n1>n2)
                           return n1;
                         else
                           return n2;
                       }
}