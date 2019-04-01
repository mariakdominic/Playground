import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int x=n/100;
    int y=(n/10)%10;
    int z=n%10;
    int sum=(z*100)+(y*10)+(x);
    System.out.println(sum);
  }
}