import java.util.*;
public class MaxMinNo
{
  public static void main(String[] args)
  {
       
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[1];
       System.out.println("Enter elements in array");
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int i=1;i<array.length;i++)
       {
         arr[i]=sc.nextInt();
         if(arr[i]<min)
           {
           min=arr[i];
           }
         if(arr[i]>max)
         {
           max=arr[i];
         }
       }
       System.out.println("Maximum element is "+max);
       System.out.println("Minimum element is "+min);
       
       
  }
}