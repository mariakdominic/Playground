import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int i,j;
    int arr[][]=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        arr[i][j]=in.nextInt();
    }
    for(i=r-1;i>=0;i--)
    {
      for(j=0;j<c;j++)
      {
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
  }
}