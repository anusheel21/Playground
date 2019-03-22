import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];int b[]=new int[10];
    int l=a.length;
    for(int i=0;i<l;i++)
      a[i]=sc.nextInt();
    int c=0;
    for(int j=0;j<10;j++)
    {
      for(int i=0;i<l;i++)
      {
        if(j==a[i])
          c=c+1;}
      b[j]=c;c=0;// your code here
  }int big=0;int d=0;
    for(int i=0;i<l;i++)
    {
      if(b[i]>big)
        big=b[i];}
  for(int k=0;k<l;k++)
  {
    d=a[k];
    if(b[d]==big)
    {System.out.println(d);break;}}
  
  
  
  
  }
}