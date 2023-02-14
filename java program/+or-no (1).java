import java.util.*;

class posnegzero {
  public static void main(String arr[])
    {
        int num;
        //Scanner class to read valu 
      Scanner sc=new Scanner(System,in);

      System.out.print("Enter any integer number: ");
      num=sc.nextInt();

      //check condition for +ve, -ve, and zero
      if(num>0)
          System.out.println("num + " is POSITIVE NUMBER.");
      else if(num<0)
          System.out.println("num + " is NEGATIVE NUMBER.");
      else
       System.out.println("IT is ZERO.");
      
    }
}