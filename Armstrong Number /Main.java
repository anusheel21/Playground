import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n;int n2=n;int c=0;int s=0;int d;int d1=1;
      while(n!=0)
      {
        n=n/10;
        c=c+1;// Type your code here
	}
    while(n1!=0)
    {
      d=n1%10;
      for(int i=1;i<=c;i++)
        d1=d1*d;
    s=s+d1;
      d1=1;
      n1=n1/10;
    }
      
      if(s==n2)
        System.out.println("Armstrong Number");
        else
          System.out.println("Not a Armstrong Number");
}
}