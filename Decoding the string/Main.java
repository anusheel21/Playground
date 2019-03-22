import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int k=sc.nextInt();
    int l=s.length();
    for(int i=0;i<l;i++)
    {
      char ch=s.charAt(i);
        if(ch>='A' && ch<='Z')
        {
          int o=ch-'A';
          o=(o-k)%26;
          char ch1=(char)(o+'A');
          System.out.print(ch1);// Type your code here
  }
    else if(ch>='a' && ch<='z')
    {
    int o1=ch-'a';
      
      o1=(o1-k)%26;
      if(o1<0)
      {
        o1=o1-2*o1;o1=o1-1;
        o1=122-o1;
        char ch2=(char)(o1);System.out.print(ch2);}
      else
      {
    char ch2=(char)(o1+'a');
      System.out.print(ch2);
    }}
      else
        System.out.print(ch);
  }
  }
}