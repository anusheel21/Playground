import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];int b=0;
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();// Type your code here
    }
      for(int i=0;i<n;i++){
      if(a[i]>b)b=a[i];
}
      System.out.println(b);}}