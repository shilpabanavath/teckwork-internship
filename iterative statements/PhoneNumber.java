import java.util.*;
// Main class
class PhoneNumber
  {
 
    // Method 1
    // To check whether number is valid or not
    public static boolean isValid(String s)
    {
 
        // The given argument to compile() method
        // is regular expression. With the help of
        // regular expression we can validate mobile
        // number.
        // The number should be of 10 digits.
 
        // Creating a Pattern class object
        Pattern p = Pattern.compile("^\\d{10}$");
 
        // Pattern class contains matcher() method
        // to find matching between given number
        // and regular expression for which
        // object of Matcher class is created
        matcher m = p.matchers;
 
        // Returning boolean value
        return (m.matches());
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
 
        // Considering two numbers as inputs
        // Custom input numbers
        String s = "7984286257";
        String s_1 = "5426391";
 
        // Checking over method 1 for string 1
        if (isValid(s))
 
            // Print statement
            System.out.println("Valid Number");
        else
 
            // Print statement
            System.out.println("Invalid Number");
 
        // Again, checking over method 1 for string 1
        if (isValid(s_1))
 
            // Print statement
            System.out.println("Valid Number");
        else
 
            // Print statement
            System.out.println("Invalid Number");
    }
}