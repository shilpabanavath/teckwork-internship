import java.util.*;
public class test
  {
    public static void main(String[] ard)
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the sum of alternative elements:");
      int n = sc.nextInt();
      int[] arr=new int[n];
        int sum = n;
        int i;
      for(i=0;i<sum;i++)
        {
          sum+= arr[i];
        }
          
          System.out.println("sum of the element of an array:"+sum);
    }
  }