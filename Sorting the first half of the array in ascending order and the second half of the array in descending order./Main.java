import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      int n1=n/2;int t; 
    for(int i=0;i<n1-1;i++)
    {
      for(int j=0;j<n1-1-i;j++)
      {
        if(a[j]>a[j+1])
        {
          t=a[j];
          a[j]=a[j+1];
          a[j+1]=t;
        }
      }
    }int t1;
    
    for(int i1=n1;i1<n-1;i1++)
    {
      for(int j1=n1;j1<n-1;j1++)
      {
        if(a[j1]<a[j1+1])
        {
        t1=a[j1];
        a[j1]=a[j1+1];
        a[j1+1]=t1;
      }
    }
  }
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");// your code here
  }
}