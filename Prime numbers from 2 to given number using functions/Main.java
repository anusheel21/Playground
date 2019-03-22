import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      prime(n);// Type your code here
	}
  public static void prime(int n)
  {
    int c=0;
    for(int i=2;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        if(i%j==0)
          c=c+1;
      }
      if(c==2)
        System.out.println(i);
      c=0;
}}}