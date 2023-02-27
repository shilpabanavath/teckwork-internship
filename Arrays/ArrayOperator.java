import java.util.*;
public class ArrayOperator
  {
    public static void main(String[] arg)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("enter no of elements in an array:");
      int size = s.nextInt();
        int array[] = new int[size];
           System.out.println("which of the following operation you want to perform:");
          System.out.println("1.Insert an element in first index:"); 
          System.out.println("2.Insert an element in last index:");
          System.out.println("3.Insert an element in specified index:");
          System.out.println("4.Remove element from first index:");
          System.out.println("5.Remove element from last index:");
         System.out.println("6.Remove element from specified index:");
         System.out.println("7.Remove user eneted element");
        System.out.println("8.Display all in ASC/DESC order:");
      int options = s.nextInt();
      switch(options)
        {
          case 1: InsertAnElementinfirstindex(array, size)
            break;
          case 2:Insertanelementinlastindex(array,size)
            break;
          case 3:InsertAnelementinspecifiedindex(array,size)
            break;
          case 4:Removeelementfromfirstindex(array,size)
            break;
          case 5:Removeelementfromlastindex(array,size)
            break;
          case 6:Removeelementfromspecifiedindex(array,size)
             break;
          case 7:Removeuserenetedelement(array,size)
             break;
          case 8:DisplayallinASC/DESCorder(array,size)
            break;
        }
        static void insertAtspecifiedIndex(int arr[], int size)
          {
          Scanner s = new Scanner(System.in);
          System.out.println("enter postion no of insert data:");
          int posistion = s.nextInt();
          }
      static void InsertAnElementinfirstindex(int[]arr, int size)
        {
          System.out.println("enter postion no of insert data:");
          int posistion = s.nextInt();
        System.out.println("enter element to insert at" +options+"index:");
        }
           static void Insertanelementinlastindex(int[]arr,intsize)
             {
             System.out.println("enter postion no of insert data:");
          int posistion = s.nextInt();
        System.out.println("enter element to insert at" +options +"index:");
             }
          static void InsertAnelementinspecifiedindex(int[]arr,int size)
            {
            System.out.println("enter postion no of insert data:");
          int posistion = s.nextInt();
        System.out.println("enter element to insert at" +options +"index:");
             }
            static void Removeelementfromfirstindex(int arr[],int size)
              {
              System.out.println("enter postion no of insert data:");
          int posistion = s.nextInt();
        System.out.println("enter element to insert at" +options +"index:");
              }
          static void Removeelementfromlastindex(int arr[], int size) 
            {
              System.out.println("enter postion no of insert data:");
          int posistion = s.nextInt();
        System.out.println("enter element to insert at" +options +"index:");
            }
         static void Removeelementfromspecifiedindex(int arr[],int size) 
           {
              System.out.println("enter postion no of insert data:");
          int posistion = s.nextInt();
        System.out.println("enter element to insert at" +options +"index:");
           }
          static void Removeuserenetedelement(int arr[], int size)
            {
              System.out.println("enter postion no of insert data:");
          int posistion = s.nextInt();
        System.out.println("remove element to insert at" +options +"index:");
            {
              arr(option) = s.nextInt();
            }
            for(int i=0;i<size-1;i++)
              {
                if(arr[i] == remove)
                  arr[i]=0;
              }
             if(i==size)
             {
               System.out.println(remove +"not available in the array:");
             }
            }
      static void DisplayallinASC/DESCorder(int arr[],int size)
        {
          System.out.println("enter postion no of insert data:");
          int posistion = s.nextInt();
        System.out.println("enter element to insert at" +options +"index:");
        }     
      for(int i=0;i<size-1;i++)
        {
          System.out.println(array[i]);
        }
          
    }
  }