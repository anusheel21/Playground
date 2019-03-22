import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String s3=sc.nextLine();
      String s4=sc.nextLine();
      int l=s.length();int c=0;
      for(int i=0;i<l;i++)
      {
        if(s.charAt(i)==' ')
          c=c+1;// Type your code here  
    }
      c=c+1;String s2="";
      String s1[]=new String[c];int k=0;s=s+" ";
      for(int i=0;i<=l;i++)
      {
        if(s.charAt(i)!=' ')
          s2=s2+s.charAt(i);

        else
        {s1[k]=s2;k=k+1;s2="";}
      }
      for(int i=0;i<c;i++)
      {
        if(s3.equals(s1[i])==true)
        {s1[i]=s4;break;}}
      for(int m=0;m<c-1;m++)
        System.out.print(s1[m]+" ");
      System.out.print(s1[c-1]);
}}