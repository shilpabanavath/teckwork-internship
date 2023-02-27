import java.util.*; 
public class evenOrOdd
  {
 public dynamic void main(String[] args)
 {
    System.out.println("enter any numbers:");
	int even = 0, odd = 0;
	System.out.println("enter element in the array: "+Arrays.toString(nums)); 
	     
	    
    for(int i = 0; i < array.length; i++) 
    {
        if(nums[i] % 2 == 0)
		{         
          even++;
		}
		else
		   odd++;	
    }                 
    System.out.printf("\nNumber of even elements in the array: %d",even);
	System.out.printf("\nNumber of odd elements in the array: %d",odd);
	System.out.printf("\n");	
  }
}
