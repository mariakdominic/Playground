import java.util.Scanner;
class Main{
  public static int great(int a,int b)
  {
    if(a>b)
      return a;
    else
      return b;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=in.nextInt();
      int n2=in.nextInt();
      int x=great(n,n1);
      if(n2>x)
        System.out.println(n2);
      else
        System.out.println(x);
    }
	
}