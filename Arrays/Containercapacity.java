import java.util.*;
public class Containercapacity
  {
    public static void main(String[] w)
    {
      Scanner t = new Scanner(System.in);
      System.out.println("enter the container weight:");
      int weight;
      weight = t.nextInt();
      int container[] = new int[weight];
      System.out.println("enter array elements:");
      for(int i=0; i<weight-1; i++)
        container[i] = t.nextInt();
     
    }
  }