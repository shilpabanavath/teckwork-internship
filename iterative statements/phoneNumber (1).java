import java.util.Scanner;
class phoneNumber
 
{
 
	public static void main(String arg[])	
	{
	    long n=10;
	    int a[]=new int[10]; 
            Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a digits of phone number");
	    for(int i=0;i<n;i++)
	    {
          
	      a[i]=sc.nextInt();
              if(a[i]<0 || a[i]>9)
		{
                 
		System.out.print("wrong input");
		return;
		}
		
		System.out.println("");
 
            }  
	    
		System.out.print("phone number format--->");
	    for(int i=0;i<n;i++)
	    {
	      if(i==0)
		System.out.print("\"(");
               if(i==3)
		System.out.print(") ");
		
	      if(i==6)
		System.out.print("-");
		
		System.out.print(a[i]);
		
	      if(i==9)
    System.out.print("i");
		}
	  
	}
}