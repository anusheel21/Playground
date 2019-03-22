import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);int a[]=new int[26];
      String s=sc.nextLine();s=s.toLowerCase();
      int l=s.length();int c=0;
      for(char ch='a';ch<='z';ch++)
      {c=0;int b=ch;b=b-97;
      for(int i=0;i<l;i++)
      {
        char ch1=s.charAt(i);
        if(ch==ch1)
          c=c+1;// Type your code here
    }if(c>0)
        a[b]=c;
       
        
}for(int m=0;m<l;m++)
      {
        char ch1=s.charAt(m);
        int k=ch1;k=k-97;
        if(a[k]>0)
        { System.out.print(ch1);
        System.out.print(a[k]+" ");a[k]=0;}
      }
    }
}