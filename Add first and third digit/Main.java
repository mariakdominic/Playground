import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int f=n1/100;
      int s=n1%100;
      int s2=(n1%100)%10;
      int sum=f+s2;
      System.out.println(sum);
	}
}