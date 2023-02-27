import java.util.*;
public class diagonalmatrix
  {
    public static void diagonalmatrix(int arr[][],int r,int c)
    {
      System.out.println("display the diagonal values in a matrix:");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              if(i>j)
              {
                continue;
              }
              else{
                System.out.println(arr[i][j]+" ");
              }
              System.out.println();
            }
        }
    }
  public static void main(String[] ar)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("enter the row size:");
      int row = s.next();
      System.out.println("enter the column size:");
      int column = s.nextLnt();
      int array[][]= new int[row][column];
      for(int i=0; i<row;i++)
        {
          for(int j=0; j<column;j++)
            {
              array[i][j]=s.nextInt();
            }
        }
      diagonalmatrix(array,row,column);
    }
  }