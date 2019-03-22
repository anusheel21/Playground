import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      switch(n)
      {
        case 1:
          int a=sc.nextInt();
          System.out.println(a*a);break;
        case 2:
           a=sc.nextInt();
          int b=sc.nextInt();
          System.out.println(a*b);
          break;
        case 3:
           a=sc.nextInt();
           b=sc.nextInt();
          System.out.println(0.5*a*b);
          break;
        case 4:
           a=sc.nextInt();
          System.out.println(3.14*a*a);
          break;
        default:
          System.out.println("Wrong input");
      }//Try your code here
    }
}