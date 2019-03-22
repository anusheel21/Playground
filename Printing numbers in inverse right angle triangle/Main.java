import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();int c;
      for(int i=n;i>=1;i--)
      {
        c=i;
        for(int j=1;j<=i;j++)
        {
        System.out.print(c);
          c--;// Type your code here
	}
        System.out.println();
        
}}}