import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int f=0;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
       a[i]=in.nextInt();
    int i=0;
    while(i<n)
    {
      if((a[i]+a[i+1]+a[i+2])==(n-1))
         {
           f=1;
         }
         i=i+3;
    }
    if(f==1)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  
    
  }
}