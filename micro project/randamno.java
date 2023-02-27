import java.util.*;
public class randamno
{
  public static void numbergame()
  {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int number=1+(int)(100*Math.random());
    int k=7;
    int i,guess;
    System.out.println(" a number is choosen"+"between1to100."+"guess number"+"within 7trails.");
    for (i=0;i<k;i++)
      {
        System.out.println("guess the number:");
        guess=sc.nextInt();
        if(number==guess)
          System.out.println("amazing!"+"your gussed the number");
        break;
      }
           else if(number > guess)
       {
                System.out.println("you enter the greater than guess number");
            }
            else if(number < guess)
            {
                System.out.println("you enter the less than guess number");
            }
       
        if (i == K)
{
      System.out.println( "You have exhausted" + " K trials.");
     System.out.println("The number was " + number);
        }
    }
    public static void main(String arg[])
      {
      numbergame();
      }
   
  }
 