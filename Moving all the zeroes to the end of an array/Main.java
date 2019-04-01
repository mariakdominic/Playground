import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      int zc=0;
      int j=0;
      int b[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      for(int i=0;i<n;i++)
      {
        if(arr[i]!=0)
        {
          b[j]=arr[i];
          j++;
        }
        else
          zc++;
      }
      for(int i=j;i<zc;i++)
      {
        b[i]=0;
      }
      for(int i=0;i<n;i++)
        System.out.print(b[i]+" ");
    
      
        
    }
}