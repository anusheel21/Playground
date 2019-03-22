import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();int n1;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    
     n1=n/2;int t=0;
    for(int i=0;i<n1-1;i++)
    {
      for(int j=0;j<n1-1-i;j++)
      {
        if(a[j]>a[j+1])
        {
          t=a[j];
          a[j]=a[j+1];
          a[j+1]=t;
        }}}
for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
         //type your code;
  }
}