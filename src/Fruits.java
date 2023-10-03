/* package codechef; // don't place package name! */
/*https://www.codechef.com/problems/FRUITS*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Fruits
{
	public static void main (String[] args) throws IOException
	{
	    try{
	        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int result[]=new int[T];
		int N_apples,M_oranges,k,diff,act_diff;
		for(int i=0;i<T;i++)
		{
		   N_apples = sc.nextInt();
		   M_oranges = sc.nextInt();
		   k = sc.nextInt();
		  
			   if(N_apples < M_oranges  )
			   {
				   diff = Math.abs(M_oranges - N_apples);
				   if(diff == k)
				   {
					   N_apples = N_apples+diff;
				   }else
				   {
					   for(int p=1;p<=k;p++)
					   {
						   N_apples = N_apples+1;	
						   if(N_apples == M_oranges)
						   {
							   break;
						   }
					   }
				   }
			   }
			   else if(N_apples > M_oranges)
			   {
				   diff = Math.abs(N_apples - M_oranges);
				   if(diff == k)
				   {
					   M_oranges = M_oranges+diff;
				   }else
				   {
					   for(int p=1;p<=k;p++)
					   {
						   M_oranges = M_oranges+1;
						   if(N_apples == M_oranges)
						   {
							   break;
						   }
					   }
				   }
				   
			   }
			   
			   act_diff = Math.abs(N_apples - M_oranges);
			   result[i]=act_diff;
		
		}
		for(int i=0;i<T;i++)
		{
		   System.out.println(result[i]);
		}
	    }catch(Exception e){}
		
	}
}
