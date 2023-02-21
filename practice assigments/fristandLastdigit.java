import java.util.*;
public class fristandLastdigit
  {
    public static void main(String[] arg)
    {
     int frist_digit, last_digit;
      SC = new.Scanner(System.in);
      System.out.println("enter any number:");
      number = SC.nextInt();
      frist_digit = number;
      while(frist_digit>=10)
        {
          frist_digit = frist_digit/10;
        }
      last_digit = number%10;
      System.out.println("\n the frist digit of a given number", + number + "=" + frist_digit);
      System.out.println("\n the last digit of a given number" + number + "=" + last_digit);
        
    }
  }