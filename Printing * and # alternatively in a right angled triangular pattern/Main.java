import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n=in.nextInt();int c=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(c%2==0)
            System.out.print("#");
          else
            System.out.print("*");
          c=c+1;// Type your code here
    }
        System.out.println();
}
    }
}