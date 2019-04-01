import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int n2;
      n2=n;
      while(n>10)
      {
         n=n/10;
         
      }
      int n1=n;
      int last=n2%10;
      int sum=n1+last;
      System.out.println(sum);
    }
}