import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n3=sc.nextInt();int n2=sc.nextInt();
      int a=gcd(n1,n2);System.out.print(gcd(a,n3));// Type your code here
	}
  public static int gcd(int n1,int n2){
    int min;
    if(n1>n2)
      min=n2;
    else
      min=n1;
    while(min>=1)
    {
      if(n1%min==0 && n2%min==0){
        return min;
        }
      min=min-1;
        }
    return 1;
  }
}