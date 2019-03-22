import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();int c=0;int a=n;
      int n1=n/2; n1=n1+1;int n2=n-n1;
      for(int i=1;i<=n1;i++)
      {
        for(int j=1;j<=c;j++)
          System.out.print(" ");
        c=c+1;
        for(int k=1;k<=a;k++)
        {if(k==1 || k==a)
          System.out.print("*");
         else
           System.out.print(" ");// Type your code here
	}a=a-2;System.out.println();
        
        
      }c=c-2;
      a=a+4;
      for(int i=1;i<=n2;i++)
          {
         for(int j=1;j<=c;j++)
          System.out.print(" ");
       c=c-1; 
          for(int k=1;k<=a;k++)
        {if(k==1 || k==a)
          System.out.print("*");
         else
           System.out.print(" ");// Type your code here
	}a=a+2;System.out.println();
        
        
      }
      
      
    }
}
