import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int row,count,col,num;
      num=n;
      
      for(row=1;row<=n;row++)
      {
        count=num;
        for(col=1;col<=(n-(row-1));col++)
        {
          System.out.print(count);
          count--;
        }
        System.out.println();
       num=num-1;
      }
	}
}