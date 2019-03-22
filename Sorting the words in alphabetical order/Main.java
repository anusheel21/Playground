import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();String s3=sc.nextLine();
    String s[]=new String[n];
    Scanner s1=new Scanner(System.in);
    String t="";s[0]="";
    for(int i=0;i<n;i++)
    {s[i]=sc.nextLine();s[i]=s[i].toLowerCase();}
    
    
    
   for(int i=0;i<n;i++)
   {
     for(int j=i+1;j<n;j++)
     {
       if(s[i].compareTo(s[j])>0)
       {
       t=s[i];
       s[i]=s[j];
       s[j]=t;//your code here;
  }}}
    for(int i=0;i<n;i++)
      System.out.println(s[i]);
    
}}