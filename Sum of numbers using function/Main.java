import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int i,s=0;
    for(i=1;i<=n;i++)
      s=s+i;
    return s;
  }
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=sum(n);
      System.out.println(a);
    
      // Type your code here
	}
}