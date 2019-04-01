import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
      list[i]=in.nextInt();
    int large=list[0];
    for(int i=0;i<n;i++)
    {
      if(list[i]>large)
        large=list[i];
    }
    max(list,n,large);
  }
  public static void max(int list[],int n,int large)
  {
    for(int i=0;i<n;i++)
    {
      if(list[i]==large)
        System.out.println(i);
    }
  }
}