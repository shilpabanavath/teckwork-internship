import java.util.*;
public class countNumber
  {
    public static void main(String[] arg)
    {
      Scanner t = new Scanner(System.in);
      System.out.println("enter any number:");
      int num;
      num = t.nextInt();
      int number[] = new int[num];
      System.out.println("enter array elements:");
      for(num=0; num<=9; num++)
        {
          count = 0;
          temp = number;
          while(temp>0)
            {
              digit = temp%10;
              if(digit ==number)
              {
                count++;
              }
              temp = temp/10;
            }
          if(count>0)
          {
            System.out.println("\t");
          }
          }
        }
    }
}