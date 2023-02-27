import java.util.Scanner;
public class TwoDimAdd
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter size of matrix :");
      int m = sc.nextInt();
      int n = sc.nextInt();
      int mat1[][] = new int[m][n];
      System.out.println("enter elements on first array :");
      for(int i = 0 ; i<m;i++)
      {
        for(int j=0;j<n;j++)
          mat1[i][j] = sc.nextInt();
        
        int mat2[][] = new int[m][n];
      System.out.println("enter elements on second array :");
      for(int i = 0 ; i<m;i++)
      {
        for(int j=0;j<n;j++)
          mat2[i][j] = sc.nextInt();
        
      }
    }
       resultMat[i][j]= displayAddMat(mat1,mat2,m,n);
      System.out.println(resultMat[i][j]);
  }
    public static void displayAddMat(int mat1[],int mat2[],int m,int n)
    {
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        }
      }
      
    }
  }
 