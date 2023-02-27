import java.util.*;
public class countduplicateno
{
    private static Scanner sc;
	public static void main(String[] args) 
  {
		int size, i, j, count = 0;
		sc = new Scanner(System.in);
		System.out.println("Please Enter the Array size  : ");
		size = sc.nextInt();
		int[] arr = new int[size];
		for(i = 0; i < size; i++) 
		{
            System.out.print("Please give value for index "+ i +" : ");
            arr[i] = sc.nextInt();
        }
		for(i = 0; i < size; i++) 
		{
			for(j = i + 1; j < size; j++)
			{
				if(arr[i] == arr[j])
        {
					count++;
					break;
				}
			}
		}
		System.out.println("\nThe Total Number of Duplicates  = " + count);
    
	}
}