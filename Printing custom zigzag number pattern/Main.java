import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();int c;
      for(int i=1;i<=n;i++)
      {
        if(i%2==0)
        {
          c=i+1;System.out.print(c);
          for(int j=1;j<n;j++)
            System.out.print(i);
	}
        else
        {c=i+1;
 for(int j=1;j<n;j++)
            System.out.print(i);
System.out.print(c);         
}System.out.println();
      }}}