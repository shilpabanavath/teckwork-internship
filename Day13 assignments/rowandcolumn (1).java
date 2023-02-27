import java.util.Scanner;
class twoDimensionalarray
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter size of rows in an array");
        int rows =s.nextInt();
      System.out.println("enter size of columns in an array");
        int columns =s.nextInt();
      int array[][]=new int[rows][columns];
      System.out.println("enter elements in an array");
      for(int i=0;i<rows;i++)
              for(int j=0;j<columns;j++)       
        amount[i][j]=s.nextInt();
    }
  }
