import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int l=s.length();s=s+ " ";int c=0;
      String s1="";
      
        for(int j=0;j<=l;j++)
        {
          if(s.charAt(j)==' ')
            c=c+1;
        }String s2[]=new String[c];
      c=0;
      for(int i=0;i<=l;i++)
      {
        if(s.charAt(i)!=' ')
        {
        s1=s1+s.charAt(i);// Type your code here
    }else
        {s2[c]=s1;
        c=c+1;
        s1="";}
    // Function to reverse a string
   };
      for(int k=c-1;k>=0;k--)
        System.out.print(s2[k]+" ");
    }
}