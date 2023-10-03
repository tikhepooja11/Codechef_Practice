/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ReverseNumber
{
	public static void main (String[] args) throws IOException
	{
	     int num, reversed = 0 ,T,result[];
	    Scanner sc = new Scanner(System.in);
		try{
	    T = sc.nextInt();
	    result =new int[T];
		for(int i=0;i<T;i++)
        {
             num = sc.nextInt();
             reversed = 0 ;
             while(num != 0) 
             {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                 num /= 10;
             }
             result[i]=reversed;
        }
        
        for(int i=0;i<T;i++)
        {
            System.out.println(result[i]);
        }
        
    

		}catch(Exception e){}
	}
}
