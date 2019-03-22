import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();int n1=n;int f;int s=0;
      while(n!=0)
      {
        int d=n%10;
        f=1;
        for(int i=1;i<=d;i++)
        {
          f=f*i;// Type your code here
	}
        s=s+f;
        n=n/10;
      }
      if(s==n1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}