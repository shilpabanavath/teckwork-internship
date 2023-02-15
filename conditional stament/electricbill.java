import java.util.*;
class electricbill
{
    public static void main(String arr[])
    {
        float u,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the units consumed:");
        u=sc.nextInt();
        if (u<=100)
            c=2*u;
        else if (u<=250)
            c=100*2+(u-100)*0.75f;
        else
            c=100*2+100*1.50f+(u-250)*1.50f;
        c=200+c;
        System.out.println("Amount Payable="+c);
    }
}