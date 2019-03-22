import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[][]=new int[n][n];
      int k=1;int cmax=n-1;int rmin=0;int rmax=n-1;int cmin=0;
      while(rmin<=rmax && cmin<=cmax)
      {
        for(int i=cmax;i>=cmin;i--)
        {
          a[rmin][i]=k++;
        }
      for(int j=rmin+1;j<=rmax;j++)
      {
        a[j][cmin]=k++;
      }
      for(int k1=cmin+1;k1<=cmax;k1++)
      {
        a[rmax][k1]=k++;
      }
      for(int l=rmax-1;l>=rmin+1;l--)
      {
        a[l][cmax]=k++;
      }
      rmax--;cmax--;rmin++;cmin++;
    }
      for(int g=0;g<n;g++)
      {
        for(int h=0;h<n;h++)
        {
          System.out.print(a[g][h]+" ");// Type your code here
    }System.out.println();}
      
      
}}