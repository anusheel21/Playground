import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int k=sc.nextInt();
      int n=ch;int m=0;
      n=n-k;
      if(ch>='a' && ch<='z')
      {
      if(n<97)
      {m=97-n;ch=(char)(123-m);}
      else
        ch=(char)(n);
      System.out.print(ch);
      }
      else
      {
        if(n<65)
        {m=65-n;ch=(char)(91-m);}
        else
          ch=(char)(n);
        System.out.print(ch);// Type your code here
    }
}}