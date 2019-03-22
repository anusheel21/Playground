import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int l=s.length();String s1="";
    for(int i=0;i<l;i++)
    {
      char ch=s.charAt(i);
      if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
        s1=s1+ch;//type your code here
  }System.out.println(s1);}
}