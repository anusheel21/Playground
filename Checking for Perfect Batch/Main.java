import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();int s=0;int s1=0;
    for(int i=0;i<3;i++)
      s=s+a[i];
    
    for(int j=3;j<6;j++)
      s1=s1+a[j];
    if(s==s1)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");//Try your code here
  }
}