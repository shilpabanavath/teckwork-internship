import java.util.*;
 
class  swapwithouttemp
  {
    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;
 
        // Code to swap 'x' and 'y'
        x = x * y; // x now becomes 50
        y = x / y; // y becomes 10
        x = x / y; // x becomes 5
 
        System.out.println("After swapping:"
                           + " x = " + x + ", y = " + y);
    }
}