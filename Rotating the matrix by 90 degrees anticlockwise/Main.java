import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();// your code here
      }
    }
  for(int i=m-1;i>=0;i--)
  {
    for(int j=0;j<n;j++)
    
        {
          System.out.print(a[j][i]+" ");}
        System.out.println();
        }
  
  }
}