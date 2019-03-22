import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
    a[i]=sc.nextInt();    // Type your code here
    }
      int c=0;int c1=0;int n1=sc.nextInt();
      int n2=sc.nextInt();
     for(int i=0;i<n;i++){
    if(a[i]==n1)
    {System.out.println(i);// Type your code here
     c=1;}
       else if(a[i]==n2)
       {System.out.println(i);c1=1;}// Type your code here
       
}if(c==0) System.out.println("-1");
      if(c1==0)
        System.out.println("-1");
    }}