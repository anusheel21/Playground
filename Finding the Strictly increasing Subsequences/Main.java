import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }int c=0;int d=0;
    for(int i=0;i<n-1;i++)
    {c=0;
      for(int j=i+1;j<n;j++)
      {
        if(a[j]>a[i] && c==0)
        {c=c+1;System.out.println(a[i]+","+a[j]);}
         else if(a[j]>a[i] && c!=0)
        {
          for(int k=i+1;k<j;k++)
          {if(a[k]>a[j])
            d=1;}
          if(d==0)
          System.out.println(a[i]+","+a[j]);
          d=0;}
      }
    }
        //your code here;
  }
}