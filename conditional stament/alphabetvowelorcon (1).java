import java.util.Scanner;
class alphabetvowelorcon
  {
    public static void main(String args[])
    {
      char ch;
      Scanner d=new Scanner(System.in);
      System.out.println("Enter value for ch:");
      ch=d.next().charAt(0);
      switch(ch)
        {
      case 'a';
      case 'e';
      case 'i';
      case 'o';
      case 'u';
      System.out.println(ch+"is an vowel");
      break;
      default
        System.out.println(c+"is an constant");
        }
    }
  }  