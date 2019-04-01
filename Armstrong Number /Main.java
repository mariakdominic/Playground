import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int t;
      int n=in.nextInt();
      int count=0;;
      t=n;
      int sum=0;
      int t1=n;
      while(t!=0)
      {
        t=t/10;
        count=count+1;
      }
 	  while(t1!=0)
      {
        int r=t1%10;
        sum=sum+(r*r*r);
        t1=t1/10;
      }
      if(sum==n)
      {
      System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
      
	}
}