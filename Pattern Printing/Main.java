import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();int c=n;int d=0;int m1=m;int m2=m;
      for(int i=1;i<=m;i++)
      {m2=m;
        for(int k=1;k<=d;k++)
        { System.out.print(m2);m2=m2-1;}d=d+1;
        for(int j=1;j<=c;j++)
          System.out.print(m1);
        c=c-1;m1=m1-1;
        System.out.println();
        //Try your code here
    }}
}