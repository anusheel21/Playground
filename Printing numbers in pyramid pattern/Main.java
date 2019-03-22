import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();int c=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=i;j<=n-1;j++)
          System.out.print(" ");
        
        for(int k=1;k<=i;k++)
        {
          System.out.print(c+ " ");c=c+1;// Type your code here
    }  System.out.println();  
}
    }}