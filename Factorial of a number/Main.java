import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int r=1;
      if(n==1 && n==0)
        System.out.println(1);
      while(n>1)
      {
        r=r*n;
        n--;
      }
      System.out.println(r);
	}
}