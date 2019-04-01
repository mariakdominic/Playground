import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      while(n>100)
      {
         n=n/10;
         
      }
      int n1=n;
      n1=n1%10;
      //int sum=first+last;
      System.out.println(n1);
    }
}