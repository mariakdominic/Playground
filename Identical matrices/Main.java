import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int r1=in.nextInt();
    int c1=in.nextInt();
    int i,j,f=1;
    int arr1[][]=new int[r1][c1];
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c1;j++)
        arr1[i][j]=in.nextInt();
    }
    int arr2[][]=new int[r1][c1];
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c1;j++)
        arr2[i][j]=in.nextInt();
    }
    for(i=0;i<r1;i++)
    {
      if(f==1)
      {
      for(j=0;j<c1;j++)
      {
        if(arr1[i][j]!=arr2[i][j])
        {
          f=0;
          break;
        }
      }
      }
      else
        break;
    }
    if(f==1)
      System.out.println("Yes");
    else
      System.out.println("No");
    
        
    //your code here
  }
}