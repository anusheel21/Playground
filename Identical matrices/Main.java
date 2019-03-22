import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
                     int n=sc.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];int c=0;
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      { a[i][j]=sc.nextInt();
                           }
                           }
                           for(int i=0;i<m;i++)
                           {
                             for(int j=0;j<n;j++)
                             {
                               b[i][j]=sc.nextInt();
                             }
                           }
      for(int i=0;i<m;i++)
                           {
                             for(int j=0;j<n;j++)
                             {
                              if(a[i][j]==b[i][j])
                                c=c+1;
                             }
                           }
                           if(c==(m*m))
                           System.out.print("Yes");
                           else
                           System.out.println("No");
                           }
                           }//your code here
  