import java.util.Scanner;
class Main
{
  public static int sum(int n)
  {
    int s=n*n;
    return s;
  }
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
    
      System.out.println(sum(n));
	 // Type your code here   
	} 
}