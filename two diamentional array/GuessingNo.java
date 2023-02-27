import java.util.*;
public class GuessingNo
{
   public static void main(String[] args)
  {
       int computerNumber = (int) (Math.random()*100 + 1);
       int userAnswer = 0;
       System.out.println("The correct guess would be " + computerNumber);
        int count = 1;

   }

   public static String determineGuess(int userAnswer, int computerNumber, int count)
  {
       if (userAnswer <=0 || userAnswer >100) 
       {
            System.out.println("Your guess is invalid:");
       }
       else if (userAnswer == computerNumber )
       {
            System.out.println( "Correct!\nTotal Guesses: " + count);
       }
       else if (userAnswer > computerNumber) 
       {
            System.out.println( "Your guess is too high, try again.\nTry Number: " + count);
       }
       else if (userAnswer < computerNumber)
       {
            System.out.println("Your guess is too low, try again.\nTry Number: " + count);
       }
       else 
       {
           System.out.println("Your guess is incorrect\nTry Number: " + count);
           
       }
          System.out.println("playagain:") ;      
            System.out.println("thanks for playing:");
  }
}