import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner (System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      int i;
      for(i=0;i<arr_size;i++)
      {
        arr[i]=in.nextInt();
      }
      int search_elem_1=in.nextInt();
      int search_elem_2=in.nextInt();
      int id1=-1;
      int id2=-1;
      for(i=0;i<arr_size;i++)
      {
        if(arr[i]==search_elem_1)
          id1=i;
        if(arr[i]==search_elem_2)
          id2=i;
      }
        System.out.println(id1);
        System.out.println(id2);
        
    }
}