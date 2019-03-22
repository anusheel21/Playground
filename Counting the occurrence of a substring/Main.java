import java.util.Scanner;
class Main{
  public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String s1=sc.nextLine();
    int l=s.length();
    int l1=s1.length();String s2="";int c=0;
    for(int i=0;i<(l-l1+1);i++)
    {
      s2=s.substring(i,i+l1);
      if(s1.equals(s2)==true)
      {c=c+1;}
      s2="";// Type your code here
  } System.out.println(c);
}}