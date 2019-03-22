import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int v=sc.nextInt();int t=0;
      for(int i=0;i<n-1;i++)
      {
        t=a[i];
        for(int k=i+1;k<n;k++)
        {
          if(t+a[k]==v)
            System.out.println(t+", "+a[k]);// Type your code here
    }
}
    }}