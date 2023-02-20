import java.util.*;
public class trafficlights
  {
    public static void main(String[] arg)
    {
      String  colour= "green";
      if(colour.equals("green"))
        {
          System.out.println("go");
        }
       else if(colour.equals("red"))
      {
        System.out.println("stop");
      }
      else if(colour.equals("orange"))
      {
          System.out.println("ready to go");
      }
      else
      {
         System.out.println("invaild input");
      }
    }
  }