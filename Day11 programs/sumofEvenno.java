import java.util.*;
public class sumofEvenno
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int start = 1;
		System.out.println("Ender Number till you want Even number sum : ");
		int end = sc.nextInt();
		int sum = 0;
		while(start<=end) {
			if(start%2 == 0) {
			    sum = sum + start;
			}
			start++;
		}
		System.out.println("Sum of all Even numbers is : " +sum+ ".");
	}
}