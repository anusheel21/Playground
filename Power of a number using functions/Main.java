import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      power(b,e);
    }
  public static void power(int b,int e)
  {int e1=1;
    for(int i=1;i<=e;i++)
      e1=b*e1;
   System.out.println(e1);
  }
}