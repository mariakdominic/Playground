import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int val=1;
      int row,space,col;
      for(row=1;row<=n;row++)
      {
        for(space=1;space<=(n-row);space++)
        {
          System.out.print(" ");
        }
        for(col=1;col<=row;col++)
        {
          System.out.print(val+" ");
          val++;
        }
        System.out.println();
      }
    }    
}