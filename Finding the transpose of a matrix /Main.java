import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
        Scanner in=new Scanner (System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int i,j;
    int mat[][]=new int[r][c];
    int mat1[][]=new int[r][c];
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
        mat1[j][i]=mat[i][j];
      }
    }
    for(i=0;i<c;i++)
    {
      for(j=0;j<r;j++)
      {
    	System.out.print(mat1[i][j]+" ");
      }
      System.out.println();
    }
  }
}