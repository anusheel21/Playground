import java.util.Scanner;
class Main{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[n][m];
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();
        b[j][i]=a[i][j];// Type your code here
  }
}
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        System.out.print(b[i][j]+" ");
      }
      System.out.println();
    }
  }
}