import java.util.*;
public class number
  {
    public static void main(String[] arg)
    {
      int number, count = 0;
      
       Sc = new Scanner(System.in)
      System.out.println("\n enter any number:");
      number = Sc.nextInt();
      while(number>0)
        {
          number = number/10;
          count = count+1;
        }
      System.out.println("\n number of digits in given number:");
      
    }
    
  }