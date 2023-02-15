import java.util.*;
public class weekDay
  {
    public static void main(String[] arg)
    {
      int weekno;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter week no:");
       weekno = s.nextIn();
        Switch (weekno)
        {
          case 1:
            System.out.println("monday");
             break;
          case 2:
              System.out.println("tuesday");
               break;
          case 3:
             System.out.println("wednesday");
              break;
           case 4:
           System.out.println("thursday");
             break;
      case 5:
            System.out.print("friday");
              break;
      case 6:
            System.out.println("saturday");
                break;
      case 7:
             System.out.println("sunday");
              break;
      }
  }