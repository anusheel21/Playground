import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();s=s+" ";
    String s1=sc.nextLine();
    int l1=s1.length();
    int l=s.length();int c=0;
    for(int i=0;i<l;i++)//type your code here
    {
      if(s.charAt(i)==' ')
        c=c+1;
    }int k=0;int c1=0;String s3="";
    String s2[]=new String[c+1];
    for(int i=0;i<l;i++)
    {
      for(int j=0;j<l1;j++)
      {
        if(s.charAt(i)==s1.charAt(j))
        {
          c1=c1+1;}}
        if(c1==0 && s.charAt(i)!=' ')
        {
          s3=s3+s.charAt(i);
        }c1=0;
      if(s.charAt(i)==' ')
      {s2[k]=s3;k++;}
    }
    for(int i=0;i<c;i++)
      System.out.print(s2[i]+" ");
  }
}