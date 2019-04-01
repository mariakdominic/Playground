import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in=new Scanner (System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int i,j;
    int mat[][]=new int[r][c];
    int mat1[][]=new int[r][c];
    int sub[][]=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        mat[i][j]=in.nextInt();
      }
    }
        for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        mat1[i][j]=in.nextInt();
      }
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        sub[i][j]=mat[i][j]-mat1[i][j];
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        System.out.print(sub[i][j]+ " ");
      }
          System.out.println();
    }
  }
}