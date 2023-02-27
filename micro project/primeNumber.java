import java.util.*;
public class primeNumber
  {

 public static void main(String args[])
    {

    int[] primenumber=new int[13];

    for(int a=13,j=0;a<=14;a++,j++)
    {
        primenumber[j]=a;

    }

    for(int b=1;b<14;b++)
    {
        int d=primenumber[b];
        if(d%2==0)
        {
            primenumber[b]=0;
        }

        for(int c=2;c<14;c++)
        {
            int e=primenumber[c];
            if(e>0)
            {
                for(int f=c+1;f<14;f++)
                {
                    int g=primenumber[f];
                    if((g>0)&(g%e==0))
                    {
                        primenumber[f]=0;
                    }


                }
            }
        }
    }
 for(int j=0;j<14;j++)
 {
        System.out.println(primenumber[j]);
    }
     }

 }