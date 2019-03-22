import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();s=s+" ";String s1="";
    int l=s.length();int k=0;
    for(int i=0;i<l;i++)
    {
      if(s.charAt(i)==' ')
      { 
        for(int j=i-1;j>=k;j--)
          s1=s1+s.charAt(j);
          System.out.print(s1+" ");s1="";
        k=i+1;}
                           
    }
    //your code here;
  }
}