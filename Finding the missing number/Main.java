import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];int l=a.length;
      for(int i=0;i<l;i++)
        a[i]=sc.nextInt();int c=0;
      for(int j=1;j<=l;j++)
      {c=0;
      for(int i=0;i<l;i++)
      {
        if(j==a[i])
          c=1;
      // Type your code here
    }if(c==0)System.out.println(j);}
}}