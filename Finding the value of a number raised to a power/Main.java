import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();int p=1;
      int e=sc.nextInt();
      for(int i=1;i<=e;i++)
        p=b*p;
      System.out.println(p);//Try your logic here
    }
}