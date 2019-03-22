import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int a[]=new int[n];
      int l=a.length;
      for(int i=0;i<l;i++)
          a[i]=sc.nextInt();int c=0;
          for(int i=1;i<=k;i++)
          {
            for(int j=0;j<l;j++)
            {
              if(i==a[j])
                c=c+1;
            }
            System.out.println(i+" "+c);
            c=0;
          }  // Type your code here
    }
}