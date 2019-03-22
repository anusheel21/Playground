import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int l=s.length();String s1="";
      for(int i=l-1;i>=0;i--)
      {
        s1=s1+s.charAt(i);// Type your code here
    } 
      if(s.equals(s1)==true)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}