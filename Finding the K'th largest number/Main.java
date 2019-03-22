import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int l=a.length;
      for(int i=0;i<l;i++)
          a[i]=sc.nextInt();
          int k=sc.nextInt();
      int big=0;int pos=0;
      for(int i=1;i<=k;i++)
      {
        for(int j=0;j<l;j++)
        {
          if(a[j]>big)
          { big=a[j];pos=j;}// Type your code here
    } 
        if(i==k)
          System.out.println(big);
        else
        {a[pos]=0;big=0;}
        
}}
}