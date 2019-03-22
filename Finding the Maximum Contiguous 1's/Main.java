import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int l=a.length;
        
      for(int i=0;i<l;i++)
        a[i]=sc.nextInt();int c=0;int b=0;
      for(int i=0;i<l;i++)
      {
        if(a[i]==1)
          c=c+1;
        else
        {if(c>b)
          b=c;c=0;}}
      System.out.println(b);// type your code here
    }
}