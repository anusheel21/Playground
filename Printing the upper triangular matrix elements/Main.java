import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
                     int n=sc.nextInt();
                     int a[][]=new int [m][n];
                     for(int i=0;i<m;i++)
                     {
                       for(int j=0;j<n;j++)
                       {
                         a[i][j]=sc.nextInt();
                       }
                     }int c=0,c1=0;
         for(int i=0;i<m;i++)
         {
           for(int j=i;j<n;j++)
           {
             if(i<=j)
             {System.out.print(a[c][c1]+" ");c=c+1;c1=c1+1;}
           }c=0;c1=i+1;
         }// your code here
  }
}