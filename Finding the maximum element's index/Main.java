import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
  int b=0;  int pos=0;
    for(int j=0;j<n;j++)
    {
      if(a[j]>b)
      {        b=a[j];pos=j;}//Try your code here
  }System.out.print(pos);
}}