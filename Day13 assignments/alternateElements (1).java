import java.util.*;
public class alternateElements
  {
    public static void main( String args[] )
    {
       //initialize array
      Scanner s = new Scanner(System.in);
       int[] arr = {23, 24, 74, 76, 78};

       //array length
       int n = arr.length;

        // loop through the array and increment by 2
       for(int i=0; i<n; i = i+2)
       {
         //print element
         System.out.println(arr[i]);
       }
    }
}