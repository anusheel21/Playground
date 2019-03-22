import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String s1=sc.nextLine();
      String s2=s+s;
      int l=s2.length();
      int l1=s1.length();String s3="";int c=0;
      for(int i=0;i<l-l1;i++)
      {
        s3=s2.substring(i,i+l1);
        if(s3.equals(s1)==true)
        {c=1;break;}
        
        
         
      }
      
      if(c==1)
        System.out.print("Yes");
      else
        System.out.print("No");// Type your code here
    }
}