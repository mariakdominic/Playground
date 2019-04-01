import java.util.Scanner;
class Main{
  public static void prime(int n)
  {
    int i;
    int f,j;
    for(i=1;i<=n;i++)
    {
      f=0;
      for(j=1;j<=n;j++)
      {
      if(i%j==0)
      {
        f++;
      }
      }
       if(f==2)
       {
         System.out.println(i);
       }
      
    }
  } 
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
      // Type your code here
	}
}