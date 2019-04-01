import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      int t;
      t=n;
      while(t!=0)
      {
        int r=t%10;
        sum=sum+r;
        t=t/10;
      }
      
   System.out.println(sum);
	}
}