import java.util.*;
public class leapYear
  {

  // Method to check leap year
  public static void checkLeapYear(int year)
    {
    if (year % 400 == 0)
    {
      System.out.println(year + " is a leap year.");
    }
    else if (year % 100 == 0)
    {
      System.out.println(year + " is not a leap year.");
    }
    else if (year % 4 == 0) {
      System.out.println(year + " is a leap year.");
    } 
    else
    {
      System.out.println(year + " is not a leap year.");
    }
  }

  public static void main(String[] args)
    {
    if (args.length > 0)
    {
      // convert string into integer
      int year = Integer.parseInt(args[0]);
      checkLeapYear(year);
    } 
    else 
    {
      System.out.println("No arguments provided.");
    }
  }
}
