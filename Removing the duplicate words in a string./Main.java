import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    s=s+" ";
    int l=s.length();int c=0,c1=0;
    for(int i=0;i<l;i++)
    {
      char ch1=s.charAt(i);
      if(ch1==' ')
        c1=c1+1;}String s1[]=new String[c1];String s2="";
    for(int i=0;i<l;i++)
    {
      char ch=s.charAt(i);
      
      if(ch!=' ')
      s2=s2+ch;
      else
      {
      s1[c]=s2;s2="";c=c+1;}
    }
    for(int i=0;i<c-1;i++)
    {
      for(int j=i+1;j<c;j++)
      {
        if(s1[i].equals(s1[j])==true)
          s1[j]="";}}//type your code here
  for(int i=0;i<c;i++)
  {
    if(s1[i].equals("")==false)
      System.out.print(s1[i]+" ");}
  }
}