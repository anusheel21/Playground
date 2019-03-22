import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=0;int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        if(a[i]==0)
          c=c+1;}
      for(int i=0;i<n;i++){
        if(a[i]!=0)
          System.out.print(a[i]+" ");}
      for(int i=1;i<=c;i++)
        System.out.print("0"+" ");
      // Type your code here
    }
}