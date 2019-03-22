import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int l=a.length;
    for(int i=0;i<l;i++)
     a[i]=sc.nextInt();int b=0;int s=a[0];
    for(int i=1;i<l;i++)
    {
      if(a[i]>a[i-1])
           s=s+a[i];
           else
           {
             if(s>b)
               b=s;
             s=0;s=s+a[i];}
           }
    if(b>s)
      System.out.println(b);
    else
      System.out.println(s);
           // your code here
  }
}