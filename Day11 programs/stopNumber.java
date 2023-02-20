import java.util.Scanner;
class stopNumber
  {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter m");
    int m= s.nextInt();
    System.out.println("enter n");
    int n= s.nextInt();
    System.out.println("enter Stop Number");
    int stop_num= s.nextInt();
  for (int x=m;x<=n;x++)
    {
    if (x%2==0 && x%3==0)
    {
       if (x==stop_num)
         break;
      System.out.println(x);
     
    }
   
  }}
}