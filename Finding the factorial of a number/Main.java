import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int f=fact(n);
    System.out.println(f);}
    static int fact(int n)
    {int o;
      if(n==1)
        return 1;
      o=fact(n-1)*n;
      return o;
    }// your code here
  }
