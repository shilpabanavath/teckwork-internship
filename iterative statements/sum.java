//sum of two integer numbers using bitwise in Java
import java.util.*;
public class Sum
{
public static void main(String args[]){
    int x,y;
    Scanner sc=new Scanner(System.in);
    //scanner class for input
System.out.println("Please Enter the first integer number ");
int num1=sc.nextInt();//get input from user for num1
System.out.println("Please Enter the second integer number ");
int num2=sc.nextInt();//get input from user for num2
x=num1;
y=num2;
while(num2!=0){
    int brw =num1&num2;
    num1=num1^num2;
    num2=brw<<1;
}
System.out.println("Sum of two numbers "+x+" and "+y+" is: "+num1);
}
}