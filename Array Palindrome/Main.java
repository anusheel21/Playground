import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];int b[]=new int[n];
      int l=a.length;int k=l-1;
      for(int i=0;i<l;i++)
      { a[i]=sc.nextInt();b[k]=a[i];k--;}
      if(Arrays.equals(a,b)==true)
        System.out.print("Yes");
      else
        System.out.println("No");
        
      // Type your code here
    }
}