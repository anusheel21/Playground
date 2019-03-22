import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];int d[][]=new int[m][n];
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();}}
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        b[i][j]=sc.nextInt();}}
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        d[i][j]=a[i][j]-b[i][j];// Type your code here
  }
}
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(d[i][j]+" ");
      }
      System.out.println();
    }
  }
}