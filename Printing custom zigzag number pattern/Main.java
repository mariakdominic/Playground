import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
        int k;
      for(i=1;i<=n;i++)
      {
        j=1;
        k=1;
        if(i%2==0)
        {
          System.out.print(i+1);
          while(j<n)
          {
            System.out.print(i);
            j++;
          }
        }
        else
        {
          while(k<n)
          {
            System.out.print(i);
            k++;
          }
          System.out.print(i+1);
        }
        System.out.println();
      }
      // Type your code here
	}
}