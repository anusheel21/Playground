import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();int t1=0;int t=0;
    int a[]=new int[n];int a1[]=new int[n];
    for(int i=0;i<n;i++)
    {  a[i]=sc.nextInt();}
    for(int h=0;h<n;h++)
      a1[h]=a[h];
    int r=sc.nextInt();
    for(int i=1;i<=r;i++)
    {
     t1=a[1];
      if(n%2==0)
      {t=a[n-2];}else t=a[n-1];
      for(int j=0;j<n-2;j=j+2)
      {
        a1[j+2]=a[j];//Try your code here
  	}a1[0]=t;
      for(int k=1;k<n-2;k=k+2)
      {
        a1[k]=a[k+2];}
      if(n%2==0)
      a1[n-1]=t1;
      else
        a1[n-2]=t1;
     for(int l=0;l<n;l++)
       a[l]=a1[l];
}
  for(int m=0;m<n;m++)
  System.out.print(a1[m]+" ");}}