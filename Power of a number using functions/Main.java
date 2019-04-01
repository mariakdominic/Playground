import java.util.Scanner;
class Main
{
  public static int exp(int b,int e)
  {
    int i=1;
    while(e!=0)
    {
      i=i*b;
      --e;
    }
    return i;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int expo=in.nextInt();
    //int a=exp(n);
    System.out.println(exp(base,expo));
  }
}