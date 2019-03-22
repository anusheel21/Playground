import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();s=s.toLowerCase();
      int l=s.length();int c=0;String s1="";String s2="";
      for(char ch='a';ch<='z';ch++)
      {
      for(int i=0;i<l;i++)
      {
        char ch1=s.charAt(i);
        if(ch==ch1)
          c=c+1;// Type your code here
    }
        if(c==0)
          System.out.print(ch+" ");c=0;
        
}
    }
}